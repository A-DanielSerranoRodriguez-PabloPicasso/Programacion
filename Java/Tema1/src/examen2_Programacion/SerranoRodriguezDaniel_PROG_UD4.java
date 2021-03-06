package examen2_Programacion;

public class SerranoRodriguezDaniel_PROG_UD4 {

	private static Exception Exception;

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(isSorted(a));

		System.out.println();

		int[][] m0 = { { 1, 2, 3 }, { 2, 1, 4 }, { 3, 4, 1 } };
		int[][] m1 = { { 1, 2 }, { 2, 1 }, { 3, 4 } };
		try {
			System.out.println(isSimetricaPerfecta(m0));
		} catch (java.lang.Exception e) {
			System.out.println("La matriz ha de ser cuadrada");
		}

		System.out.println();

		int[][] m2 = { { 1, 5, 2, 3 }, { 2, 1, 6, 4 }, { 3, 4, 7, 1 }, { 2, 1, 6, 4 }, { 2, 1, 6, 4 } };
		int[][] m3 = { { 1, 5, 2 }, { 2, 1, 6 }, { 3, 4, 7 } };
		int[][] m4 = { { 1, 5, 2, 3, 4 }, { 2, 1, 6, 4, 5 }, { 3, 4, 7, 0, 1 }, { 2, 1, 6, 4, 1 }, { 2, 1, 6, 8, 3 },
				{ 3, 4, 5, 6, 9 } };
		int[][] m5 = { { 1, 5 }, { 2, 1 } };

		int[][] aux;
		try {
			aux = relleno(m2);
			for (int i = 0; i < aux.length; i++) {
				for (int j = 0; j < aux[i].length; j++) {
					System.out.print(aux[i][j] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("La matriz ha de ser como minimo de 3x3.");
		}

	}

	/**
	 * Comprueba que el array numerico que hemos introducido esta ordenado de forma
	 * ascendente o descendente.
	 * 
	 * @param array Array numerico que queremos comprobar.
	 * @return Verdadero si el array esta ordenado de forma ascendente o descendete.
	 *         Falso si el array no esta ordenado,
	 */
	public static boolean isSorted(int[] array) {
		boolean isSorted = false;
		int contAsc = 0, contDesc = 0;

		// Recorremos el array, contando si el numero es menor o mayor que el siguiente.
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				if (array[i] < array[i + 1] || array[i] == array[i + 1]) {
					contAsc++;
				}
				if (array[i] > array[i + 1] || array[i] == array[i + 1]) {
					contDesc++;
				}
			}
		}

		// Si alguno de los contadores alcanza la distancia del array (-1 ya que los
		// empezamos desde 0), el array esta
		// ordenado
		if (contAsc == array.length - 1) {
			return isSorted = true;
		} else if (contDesc == array.length - 1) {
			return isSorted = true;
		}

		return isSorted;
	}

	/**
	 * Comprueba que una matriz es simetrica perfecta (las filas tienen los mismos
	 * numeros que las columnas).
	 * 
	 * @param matriz Matriz que queremos comprobar.
	 * @return Devuelve verdadero si es simetrica perfecta, si no lo es devuelve
	 *         falso.
	 * @throws Exception Si la matriz no es cuadrada, saltara la excepcion.
	 */
	public static boolean isSimetricaPerfecta(int[][] matriz) throws Exception {
		boolean isSimetricaPerfecta = false;

		// Comprobamos que la matriz es cuadrada, si no lo es, salimos del programa.
		if (matriz.length == matriz[0].length) {

			// Comprobamos que la diagonal de la matriz posee los mismos numeros en toda
			// esta. Si no son todos iguales, devolvemos falso.
			for (int i = 0; i < matriz.length; i++) {
				if (i != matriz.length - 1) {
					if (matriz[i][i] != matriz[i + 1][i + 1]) {
						return isSimetricaPerfecta;
					}
				}
				if (matriz[i][i] != matriz[0][0]) {
					return isSimetricaPerfecta;
				}
			}

			// Comprobamos que las filas coinciden con las columnas. Si no coinciden,
			// devolvemos falso.
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					if (matriz[i][j] != matriz[j][i]) {
						return isSimetricaPerfecta;
					}
				}
			}
			return isSimetricaPerfecta = true;
		} else {
			throw Exception;
		}
	}

	/**
	 * Obtiene la submatriz de la matriz introducida, eliminando las primeras y
	 * ultimas filas y columnas.
	 * 
	 * @param matriz Matriz de la que queremos obtener la submatriz.
	 * @return Submatriz.
	 * @throws Exception Si la matriz no es de al menos 3x3, saltara la excepcion.
	 */
	public static int[][] relleno(int[][] matriz) throws Exception {

		// Conseguimos las filas y las columnas de nuestra submatriz. Estas tendran 2
		// filas y columnas menos que nuestra matriz.
		int[] filas = new int[matriz.length - 2];
		int[] columnas = new int[matriz[0].length - 2];

		// Si la matriz no es minimo de 3x3, salta la excepcion.
		if (matriz.length >= 3 && matriz[0].length >= 3) {

			// Insertamos las posiciones que tenemos que recorrer para crear la submatriz en
			// 2 arrays, 1 para las filas y otro para las columnas.
			// Cortesia de Isa Maye, que se le ocurrio esta genialidad
			for (int i = 0; i < filas.length; i++) {
				filas[i] = i + 1;
			}
			for (int j = 0; j < columnas.length; j++) {
				columnas[j] = j + 1;
			}

			// La submatriz tendra las distancias de FILAS y COLUMNAS, ya que estas
			// variables poseen ya el tama?o de la submatriz
			int[][] relleno = new int[filas.length][columnas.length];

			// Recorremos la matriz usando los valores de los arrays, recorriendo el
			// interior de la matriz evitando los bordes.
			for (int i = 0; i < relleno.length; i++) {
				for (int j = 0; j < relleno[i].length; j++) {
					relleno[i][j] = matriz[filas[i]][columnas[j]];
				}
			}
			return relleno;
		} else {
			throw Exception;
		}
	}

}

package utils;

public class Matrices {

	public static void imprimeMatriz(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}

	}

	/**
	 * De una matriz CUADRADA, devuelve la diagonal principal en un array.
	 * 
	 * @param m Matriz a la que extraemos la diagonal.
	 * @return Array con la diagonal de la matriz.
	 */
	private static int[] diagonal(int[][] m) {
		int[] array = new int[m.length];

		for (int i = 0; i < m.length; i++)
			array[i] = m[i][i];

		return array;
	}

	/**
	 * De una matriz CUADRADA, devuelve la diagonal INVERTIDA en un array.
	 * 
	 * @param m Matriz a la que extraemos la diagonal INVERTIDA.
	 * @return Array con la diagonal INVERTIDA de la matriz.
	 */
	private static int[] diagonalInvertida(int[][] m) {
		int[] array = new int[m.length];
		int retroceso = m.length - 1;

		for (int i = 0; i < m.length; i++)
			array[i] = m[i][retroceso--];

		return array;
	}

	/**
	 * De una matriz CUADRADA, devuelve la diagonal principal O la diagonal
	 * invertida en un array.
	 * 
	 * @param m         Matriz de la que extraemos la diagonal.
	 * @param invertida Parametro que nos indica si queremos la diagonal invertida o
	 *                  la principal (true=invertida, false=principal).
	 * @return Devuelve el array con la diagonal seleccionada.
	 */
	public static int[] diagonal(int[][] m, boolean invertida) {

		if (invertida)
			return diagonalInvertida(m);
		else
			return diagonal(m);

	}

	/**
	 * Obtiene, en el orden indicado, el valor minimo, el maximo, la media, la
	 * varianza y la desviacion tipica de la matriz introducida.
	 * 
	 * @param m Matriz a la que le extraemos los valores.
	 * @return Array con los valores obtenidos.
	 */
	public static int[] extraerEstadisticas(int[][] m) {
		int[] estadisticas = { Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 0, 0 };
		// El primer valor es el minimo, el segundo el maximo, el tercero es la media,
		// el cuarto es la varianza y el quinto es la desviacion tipica
		int cont = 0;

		// Recogemos los minimos y maximos, calculando la media
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++) {
				if (estadisticas[0] > m[i][j])
					estadisticas[0] = m[i][j];
				else if (estadisticas[1] < m[i][j])
					estadisticas[1] = m[i][j];

				estadisticas[2] += m[i][j];
				cont++;
			}

		estadisticas[2] = (int) (estadisticas[2] / cont);

		// Sacamos la varianza, para esto, restamos la media a cada numero, lo elevamos
		// al cuadrado, y hacemos la media de estos numeros elevados
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] -= estadisticas[2];
				m[i][j] = (int) Math.pow(m[i][j], 2);
				estadisticas[3] += m[i][j];
			}

		estadisticas[3] = (int) (estadisticas[3] / cont);

		// Hacemos la desviacion tipica, para esto, hacemos la raiz cuadrada a la
		// varianza
		estadisticas[4] = (int) Math.sqrt(estadisticas[3]);

		return estadisticas;
	}

	/**
	 * Invierte un array.
	 * 
	 * @param a Array al que vamos a darle la vuelta.
	 * @return Array con los valores invertidos.
	 */
	public static int[] invertir(int[] a) {
		int[] array = new int[a.length];
		int retroceso = array.length - 1;

		for (int i = 0; i < a.length; i++)
			array[i] = a[retroceso--];

		return array;
	}

	/**
	 * Obtiene los valores de la fila de una matriz.
	 * 
	 * @param m      Matriz a la que vamos a extraer los valores.
	 * @param indice Fila de la que queremos conseguir los valores.
	 * @return Array con los valores conseguidos.
	 */
	public static int[] getFila(int[][] m, int indice) {
		int[] fila = new int[0];// Lo ponemos a 0 ya que no sabemos el tama??o de las columnas

		for (int i = 0; i < m.length; i++) // Averiguamos el tama??o de las columnas, obteniendo la cantidad de filas
			fila = new int[m[i].length];

		for (int i = 0; i < fila.length; i++)
			fila[i] = m[indice][i];

		return fila;
	}

	/**
	 * Obtiene los valores de la columna de una matriz.
	 * 
	 * @param m      Matriz a la que vamos a extraer los valores.
	 * @param indice Columna de la que queremos conseguir los valores.
	 * @return Array con los valores conseguidos.
	 */
	public static int[] getColumna(int[][] m, int indice) {
		int[] fila = new int[m.length];

		for (int i = 0; i < fila.length; i++)
			fila[i] = m[i][indice];

		return fila;
	}

	/**
	 * Coge la submatriz de los numeros coincidentes entre las filas y columnas
	 * introducidas
	 * 
	 * @param m                Matriz de la que vamos a sacar la submatriz
	 * @param filasElegidas    Filas en la que van a estar nuestros numeros
	 * @param columnasElegidas Columnas en la que van a estar nuestros numeros
	 * @return Submatriz resultante de la interseccion de las filas y las columnas
	 */
	public static int[][] submatriz(int[][] m, int[] filasElegidas, int[] columnasElegidas) {
		int[][] submatriz = new int[filasElegidas.length][columnasElegidas.length];

		// Asignamos los valores en la submatriz correspondientes a los del array,
		// coordinando el recorrido
		for (int i = 0; i < submatriz.length; i++) {
			for (int j = 0; j < submatriz[i].length; j++) {
				submatriz[i][j] = m[filasElegidas[i]][columnasElegidas[j]];
			}
		}

		return submatriz;
	}

//	public static int[][] multiplica(int[][] m1, int[][] m2){
//		
//	}

	/**
	 * Reemplaza la fila seleccionada de la matriz con el array introducido.
	 * 
	 * @param m      Matriz donde reemplazar.
	 * @param a      Array con el que reemplazar. Ha de ser del mismo tama??o que la
	 *               fila de la matriz.
	 * @param indice Indica la fila que va a ser reemplazada. Comenzar en 0.
	 */
	private static void reemplazarFilaConArray(int[][] m, int[] a, int indice) {

		for (int i = 0; i < m.length - 1; i++)
			m[indice][i] = a[i];

	}

	/**
	 * Reemplaza la columna seleccionada de la matriz con el array introducido.
	 * 
	 * @param m      Matriz donde reemplazar.
	 * @param a      Array con el que reemplazar. Ha de tener del mismo tama??o que
	 *               la columna de la matriz.
	 * @param indice Indica la columna que va a ser reemplazada. Comenzar en 0.
	 */
	private static void reemplazarColumnaConArray(int[][] m, int[] a, int indice) {

		for (int i = 0; i < m.length; i++)
			m[i][indice] = a[i];

	}

	/**
	 * Reemplaza la fila o la columna seleccionada de la matriz con el array
	 * introducido.
	 * 
	 * @param m      Matriz donde reemplazar.
	 * @param a      Array con el que reemplazar. Ha de tener el mismo tama??o que la
	 *               fila o columna de la matriz.
	 * @param indice Indica la fila o columna que va a ser reemplazada. Comenzar en
	 *               0.
	 * @param donde  Char que indica si es 'f'ila o 'c'olumna.
	 */
	public static void reemplazarEnMatrizConArray(int[][] m, int[] a, int indice, char donde) {

		if (donde == 'f')
			reemplazarFilaConArray(m, a, indice);
		else if (donde == 'c')
			reemplazarColumnaConArray(m, a, indice);

	}

	/**
	 * Rota una matriz introducida una posicion hacia la derecha, pasando la esquina
	 * superior derecha a la esquina superior izquierda y as?? sucesivamente.
	 * 
	 * @param m Matriz que vamos a rotar.
	 * @return Matriz rotada.
	 */
	public static int[][] rotarMatrizDerecha(int[][] m) {
		int fil = m.length, col = m[0].length;
		int[][] aux = new int[col][fil];

		// Rota la matriz hacia la derecha

		// Menos eficiente / Forma algor??timica
//		for (int i = 0; i < aux.length; i++)
//			for (int j = 0; j < aux[i].length; j++)
//				aux[i][j] = m[m.length - 1 - j][i];

		// M??s eficiente / Reutilizaci??n de c??digo
		for (int i = 0; i < aux.length; i++)
			aux[i] = invertir(getColumna(m, i)); // getFila para girar a la izquierda

		return aux;
	}

	/**
	 * Da la vuelta a la matriz en el eje horizontal.
	 * 
	 * @param m Matriz que vamos a voltear.
	 * @return Matriz volteada.
	 */
	public static int[][] voltearHorizontalMatriz(int[][] m) {
		int fil = m.length, col = m[0].length;
		int[][] aux = new int[col][fil];

		// Sustituye las primeras filas en la nueva matriz por las ??ltimas de la matriz
		// introducida
		for (int i = 0; i < aux.length; i++)
			aux[i] = m[m.length - 1 - i];

		return aux;
	}

	/**
	 * Da la vuelta a la matriz en el eje vertical.
	 * 
	 * @param m Matriz que vamos a voltear.
	 * @return Matriz volteada.
	 */
	public static int[][] voltearVerticalMatriz(int[][] m) {
		int fil = m.length, col = m[0].length;
		int[][] aux = new int[col][fil];

		// Sustituye las primeras columnas en la nueva matriz por las ??ltimas de la
		// matriz
		// introducida
		for (int i = 0; i < aux.length; i++)
			for (int j = 0; j < aux[i].length; j++)
				aux[i][j] = m[i][m.length - 1 - j];

		return aux;
	}

	/**
	 * Da la inversa de la matriz.
	 * 
	 * @param m Matriz de que queremos obtener la inversa.
	 * @return Inversa de la matriz.
	 */
	public static int[][] algo(int[][] m) {
		int[][] aux;

		aux = voltearHorizontalMatriz(m);
		aux = voltearVerticalMatriz(aux);

		return aux;
	}

	public static int[][] inversaMatriz(int[][] m) {
		int[][] aux = new int[m.length][m[0].length];

		for (int i = 0; i < m.length; i++) {
			aux[i] = getColumna(m, i);
		}

		return aux;
	}

	public static int determinanteMatriz(int[][] m) {
		int part1 = 1, det1 = 0, part2 = 1, det2 = 0, determinante = 0, aux;
//		int[] diagonal = new int[m.length];
//
//		for (int i = 0; i < diagonal.length; i++) {
//			diagonal[i] = i;
//		}
//
//		if (m.length == 1 && m[0].length == m.length) {
//			determinante = m[0][0];
//		}
//		if (m.length == 2 && m[0].length == m.length) {
//
//			for (int i = 0; i < m.length; i++) {
//				part1 *= m[i][i];
//			}
//			for (int i = m.length - 1; i >= 0; i--) {
//				part2 *= m[m.length - 1 - i][i];
//			}
//			determinante = part1 - part2;
//		} else {
//			for (int k = 0; k < diagonal.length; k++) {
//				for (int i = 0; i < m.length; i++) {
//					part1 = part1 * m[i][diagonal[i]];
//				}
//				aux = diagonal[0];
//				for (int j = 0; j < diagonal.length; j++) {
//
//					if (j != diagonal.length - 1) {
//						diagonal[j] = diagonal[j + 1];
//					} else
//						diagonal[j] = aux;
//
//				}
//				det1 += part1;
//				part1 = 1;
//			}
//			for (int i = diagonal.length - 1; i >= 0; i--) {
//				diagonal[diagonal.length - 1 - i] = i;
//			}
//
//			for (int k = 0; k < diagonal.length; k++) {
//
//				for (int i = diagonal.length - 1; i >= 0; i--) {
//					part2 *= m[i][diagonal[i]];
//				}
//				aux = diagonal[0];
//				for (int j = 0; j < diagonal.length; j++) {
//
//					if (j != diagonal.length - 1) {
//						diagonal[j] = diagonal[j + 1];
//					} else
//						diagonal[j] = aux;
//
//				}
//				det2 += part2;
//				part2 = 1;
//			}
//		}
//		determinante = det1 - det2;

		return determinante;
	}
//TODO Determinante array independiente, usando contador para las columnas del media comnt-1 y cont+1
//	public static int[][] inversaMatriz(int[][] m){
//		int[][] aux;
//		return aux;
//	}

	/**
	 * Comprueba si una matriz es triangular.
	 * 
	 * @param m Matriz a comprobar.
	 * @return -1 si no lo es, 0 si es por ambos lados, 1 si es en la parte superior
	 *         derecha, 2 si es en la parte inferior izquierda
	 */
	public static int matrizTriangular(int[][] m) {
		int triangular = -1;
		int[] n = new int[(m.length * 2) - 2];
		int[] a = new int[(m.length * 2) - 2];
		boolean triangular1 = true, triangular2 = true;
		int contador = 0, cont1 = 0, cont2 = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = cont1; j < m[i].length; j++) {

				if (i != j) {
					n[contador] = m[i][j];
					contador++;
				}

			}
			cont1++;
		}
		contador = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = cont2; j < m[i].length; j++) {
				if (j != i) {
					a[contador] = m[j][i];
					contador++;
				}
			}
			cont2++;
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] != 0) {
				triangular1 = false;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				triangular2 = false;
			}
		}
		for (int i = 0; i < n.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();

		if (triangular1 == false && triangular2 == false)
			return triangular;
		else if (triangular1 && triangular2)
			return triangular = 1;
		else if (triangular1)
			return triangular = 2;
		else if (triangular2)
			return triangular = 3;

		return triangular;
	}

}

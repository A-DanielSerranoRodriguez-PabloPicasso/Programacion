package libro.Tema8;

public class E1_14_numeros {

	/**
	 * Devuelve si el numero es o no capicua.
	 * 
	 * @param num Numero a comprobar.
	 * @return Boolean resultado de la comprobacion.
	 */
	public static boolean esCapicua(int num) {
		boolean capicua = true;
		// Convertimos el numero en un string.
		String nums = Integer.toString(num);
		// Convertimos ese string en un array de char.
		char[] aNums = nums.toCharArray();
		// Creamos un array que tendra la mitad de tamaño que el array del numero
		int[] aux = new int[aNums.length / 2];

		// Almacenamos los numeros en el array y comparamos los numeros del array. Si
		// coinciden, capicua se mantendra verdadero, si no sera falso
		for (int i = 0; i < (aNums.length / 2); i++) {
			aux[i] = aNums[i];
			aux[(aNums.length / 2) - 1 - i] = aNums[aNums.length - 1 - i];
			if (aux[i] != aux[(aNums.length / 2) - 1 - i])
				capicua = false;
		}

		return capicua;
	}

	/**
	 * Comprueba que el numero introduce es o no primo.
	 * 
	 * @param num Numero que queremos comprobar si es primo.
	 * @return Booleano que indica si es primo o no.
	 */
	public static boolean esPrimo(int num) {
		boolean primo = false;
		int contador = 2;

		// Recorremos todos los numeros desde el 2 hasta el propio numero. Si es
		// divisible, sumara el contador
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0)
				contador++;

		}

		// Si el contador se mantiene en 2, primo sera true, si no sera false
		if (contador == 2)
			primo = true;

		return primo;
	}

	/**
	 * Obtiene el siguiente numero que es primo.
	 * 
	 * @param num Numero desde el que se empezara a buscar.
	 * @return Siguiente numero primo.
	 */
	public static int siguientePrimo(int num) {
		int siguientePrimo;
		int averiguar = num, contador = 2;
		boolean encontrado = false;

		while (encontrado == false) {
			for (int i = 2; i < averiguar - 1; i++) {
				if (averiguar % i == 0)
					contador++;

			}
			if (contador != 2) {
				averiguar++;
				contador = 2;
			} else
				encontrado = true;
		}

		siguientePrimo = averiguar;

		return siguientePrimo;
	}

	/**
	 * Obtiene el resultado de elevar la base por el exponente.
	 * 
	 * @param base      Numero que funcionara de base.
	 * @param exponente Exponente al que sera elevado la base.
	 * @return Resultado.
	 */
	public static int potencia(int base, int exponente) {
		int potencia = (int) Math.pow(base, exponente);
		return potencia;
	}

	/**
	 * Obtiene la cantidad de digitos que tiene un numero.
	 * 
	 * @param num Numero del que queremos obtener la cantidad de digitos.
	 * @return Entero que dice la cantidad de digitos.
	 */
	public static int digitos(int num) {
//		String nums = Integer.toString(num);
//		char[] aNums = nums.toCharArray();
		// Convertimos el entero a un string.
		// Pasamos el string a un array de chars.
		// Sacamos cuantos elementos hay en el array
//		int digitos = aNums.length;
		// MEJORAR ^

		int digitos = 0;

		if (num < 0)
			num = -num;

		if (num == 0)
			return 1;
		else {
			while (num > 0) {
				num /= 10;
				digitos++;
			}
		}

		return digitos;
	}

	/**
	 * Le da la vuelta a un numero.
	 * 
	 * @param num Numero que queremos invertir.
	 * @return Numero invertido.
	 */
	public static int voltea(int num) {

		if (num < 0)
			return -voltea(-num);

		int voltea = 0;

		while (num > 0) {
			voltea = (voltea * 10) + (num % 10);
			num = num / 10;
		}

		return voltea;
	}

	/**
	 * Devuelve el numero en la posicion indicada, empezando por 0 desde la
	 * izquierda a la derecha.
	 * 
	 * @param num      Numero del que queremos sacar el numero aislado.
	 * @param posicion Posicion de la que queremos sacar el numero.
	 * @return Numero de la posicion.
	 */
	public static int digitoN(int num, int posicion) {
		int numero = num;

		while (posicion-- > 0) {
			numero /= 10;
		}

		return (int) numero % 10;
	}

	/**
	 * Devuelve la posicion de un numero, contando de izquierda a derecha.
	 * 
	 * @param num       Numero en el que vamos a buscar.
	 * @param averiguar Numero del que queremos averiguar la posicion.
	 * @return Entero con la posicion.
	 */
	public static int posicionDigito(int num, int averiguar) {
		int posicion = -1;
//		int i;
		boolean encontrado = false;

//		for (i = 0; i < digitos(num) && digitoN(num, i) != averiguar) {
//			if (i == digitos(num))
//				return -1;
//			else
//				return i;
//			i++;
//		}

		if (num < 0) {
			num = -num;
		}
		while (encontrado == false) {
			for (int i = 0; i < Integer.toString(num).toCharArray().length; i++) {
				if (averiguar == Integer.toString(num).toCharArray()[i] - '0') {
					posicion = i + 1;
					encontrado = true;
				}
				if (i == Integer.toString(num).toCharArray().length - 1)
					encontrado = true;

			}
		}

//		num = voltea(num);
//		while (num-- > 0) {
//			num /= 10;
//		}

		return posicion;
//		return (int) num % 10;
	}

	/**
	 * Quita X digitos al numero introducido, empezando desde la derecha.
	 * 
	 * @param num    Numero al que vamos a quitar digitos.
	 * @param quitar Cuantos digitos que vamos a quitar
	 * @return Numero con los digitos quitados.
	 */
	public static int quitaPorDetras(int num, int quitar) {
		int resultado = num;

		resultado /= potencia(10, quitar);

		// Trabaja con arrays.
//		int[] almacen = new int[Integer.toString(num).toCharArray().length - quitar];
//
//		for (int i = 0; i < almacen.length; i++) {
//			almacen[i] = Integer.toString(num).toCharArray()[i] - '0';
//		}
//
//		for (int i = 0; i < almacen.length; i++) {
//			resultado = (resultado * 10) + almacen[i];
//		}

		return resultado;
	}

	/**
	 * Quita X digitos al numero introducido, empezando desde la izquierda.
	 * 
	 * @param num    Numero al que vamos a quitar digitos.
	 * @param quitar Cuantos digitos que vamos a quitar
	 * @return Numero con los digitos quitados.
	 */
	public static int quitaPorDelante(int num, int quitar) {

		num = voltea(num);
		int resultado = quitaPorDetras(num, quitar);
		resultado = voltea(resultado);

		return resultado;
	}

	/**
	 * Añade un digito a la derecha en el numero introducido.
	 * 
	 * @param num   Numero al que vamos a añadir un digito.
	 * @param pegar Que digito vamos a añadir.
	 * @return Numero con los digitos añadido.
	 */
	public static int pegaPorDetras(int num, int pegar) {
		int resultado = 0;
		int[] almacen = new int[Integer.toString(num).toCharArray().length + 1];

		for (int i = 0; i < Integer.toString(num).toCharArray().length; i++) {
			almacen[i] = Integer.toString(num).toCharArray()[i] - '0';
		}
		almacen[almacen.length - 1] = pegar;
		for (int i = 0; i < almacen.length; i++) {
			resultado = (resultado * 10) + almacen[i];
		}

		return resultado;
	}

	/**
	 * Añade un digito a la izquierda en el numero introducido.
	 * 
	 * @param num    Numero al que vamos a añadir un digito.
	 * @param añadir Que digito vamos a añadir.
	 * @return Numero con los digitos añadido.
	 */
	public static int pegaPorDelante(int num, int pegar) {
		int resultado = 0;
		int[] almacen = new int[Integer.toString(num).toCharArray().length + 1];

		for (int i = 0; i < Integer.toString(num).toCharArray().length; i++) {
			almacen[i] = Integer.toString(num).toCharArray()[Integer.toString(num).toCharArray().length - 1 - i] - '0';
		}
		almacen[almacen.length - 1] = pegar;
		for (int i = 0; i < almacen.length; i++) {
			resultado = (resultado * 10) + almacen[almacen.length - 1 - i];
		}

		return resultado;
	}
}

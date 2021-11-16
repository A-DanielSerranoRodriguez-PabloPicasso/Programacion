package utils;

public class Comprobar {
	/**
	 * Comprueba que una cadena de caracteres (String) es un numero entero.
	 * 
	 * @param n String a comprobar.
	 * @return Verdadero o falso.
	 */
	public static boolean entero(String n) {
		boolean entero;
		// Utilizamos .toCharArray() para convertiro en un array.
		// Dentro del bucle lo recorremos, comprobando que no hay ninguna letra o
		// caracter que haga que el numero sea decimal.
		// Si queremos introducir un entero directamente, tendriamos que poner --
		// Integer.toString(n).toCharArray -- para convertir el entero en un String, y
		// poder convertir este en un array de chars.
		// Tambien puede realizarse con Double, Long, Float, etc. numericos
		for (int i = 0; i < n.toCharArray().length; i++) {
			if (n.toCharArray()[i] == '.' || n.toCharArray()[i] == ',' || Character.isLetter(n.toCharArray()[i])) {
				return entero = false;
			}
		}
		return entero = true;
	}
}

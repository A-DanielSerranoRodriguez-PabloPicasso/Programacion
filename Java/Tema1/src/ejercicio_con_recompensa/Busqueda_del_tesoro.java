package ejercicio_con_recompensa;

import java.util.Scanner;

public class Busqueda_del_tesoro {
	static int size;
	static Scanner sc = new Scanner(System.in);
	static String[][] mapa;
	static String[][] vista;
	static int cont = 0, cont2 = 0, cont3 = 0, contFila = 0, contCol = 0;
	static int fila, columna, filBomba, colBomba, filTesoro, colTesoro;
	static String stringFila, stringColumna, stringNum;
	static char[] elChar, elNum;
	static boolean ocupada = true, ocuTesoro = false, bomba = false, tesoro = false, charFila = false,
			charColumna = false, esChar = true;

	public static void main(String[] args) {

		System.out.print("De que dimensiones quieres la matriz (5 para 5x5, 10 para 10x10, etc): ");
		stringNum = sc.next();
		for (int i = 0; i < stringNum.length(); i++) {
			while(Character.isLetter(stringNum.charAt(i))) {
				System.out.print("De que dimensiones quieres la matriz (5 para 5x5, 10 para 10x10, etc): ");
				stringNum = sc.next();
			}
		}

		size = Integer.parseInt(stringNum);
		mapa = new String[size][size];
		vista = new String[size][size];

		posiciones();

		imprimirMatriz();

		System.out.println();

		while (bomba == false && tesoro == false) {

			imprimir();

			System.out.println("Indica la fila y la columna a investigar (del 1 al " + size + ").");
			System.out.print("Fila: ");
			stringFila = sc.next();
			/*for (int i = 0; i < stringFila.length(); i++) {
				while (Character.isLetter(stringFila.charAt(i))) {
					System.out.print("Introduce un valor de fila correcto: ");
					stringFila = sc.next();
				}
				while ((Integer.parseInt(stringFila) - 1) > (size - 1)) {
					System.out.print("Introduce un valor de fila correcto: ");
					stringFila = sc.next();
				}
			}
			fila = (Integer.parseInt(stringFila) - 1);
			*/
			if (stringFila.length() > 1) {
				charFila = true;
			} else {
				elChar = stringFila.toCharArray();
				if (Character.isLetter(elChar[0])) {
					charFila = true;
				} else
					fila = Integer.parseInt(stringFila) - 1;
			}

			System.out.print("Columna: ");
			stringColumna = sc.next();
			if (stringColumna.length() > 1) {
				charColumna = true;
			} else {
				elChar = stringColumna.toCharArray();
				if (Character.isLetter(elChar[0])) {
					charFila = true;
				} else
					columna = Integer.parseInt(stringColumna) - 1;
			}

			System.out.println("\n\n");

			while (fila > size - 1 || columna > size - 1 || fila < 0 || columna < 0 || charFila == true
					|| charColumna == true) {
				System.out.println("Introduce valores correctos");
				System.out.print("Fila: ");
				fila = Integer.parseInt(sc.next()) - 1;
				if (stringFila.length() > 1) {
					charFila = true;
				} else {
					elChar = stringFila.toCharArray();
					if (Character.isLetter(elChar[0])) {
						charFila = true;
					} else {
						fila = Integer.parseInt(stringFila) - 1;
						charFila = false;
					}
				}
				System.out.print("Columna: ");
				if (stringColumna.length() > 1) {
					charColumna = true;
				} else {
					elChar = stringColumna.toCharArray();
					if (Character.isLetter(elChar[0])) {
						charColumna = true;
					} else {
						columna = Integer.parseInt(stringColumna) - 1;
						charColumna = false;
					}
				}

				columna = Integer.parseInt(sc.next()) - 1;

				System.out.println("\n\n");
			}

			vista[fila][columna] = mapa[fila][columna];

			if (vista[fila][columna].equals("@")) {
				bomba = true;
			} else if (vista[fila][columna].equals("$")) {
				tesoro = true;
			}

		}

		if (bomba) {
			imprimir();
			System.out.println("Explotaste");
		}

		if (tesoro) {
			imprimir();
			System.out.println("Ganaste");
		}

	}

	public static void imprimir() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= size; j++) {
				if (cont < size) {
					System.out.print(vista[i][j] + " ");
					cont++;
				} else {
					System.out.println("");
					cont = 0;
				}
			}
		}
		System.out.println();
	}

	public static void posiciones() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				mapa[i][j] = "X";
				vista[i][j] = "O";
			}
		}

		while (ocupada = true && cont2 < size) {

			filBomba = (int) (Math.random() * size);
			colBomba = (int) (Math.random() * size);

			if (mapa[filBomba][colBomba] != "@") {
				mapa[filBomba][colBomba] = "@";
				if (filBomba == 0) {
					if (colBomba == 0) {
						if (mapa[filBomba + 1][colBomba] != "@")
							mapa[filBomba + 1][colBomba] = "!";
						if (mapa[filBomba][colBomba + 1] != "@")
							mapa[filBomba][colBomba + 1] = "!";
						if (mapa[filBomba + 1][colBomba + 1] != "@")
							mapa[filBomba + 1][colBomba + 1] = "!";
					} else if (colBomba > 0 && colBomba < size - 1) {
						if (mapa[filBomba + 1][colBomba] != "@")
							mapa[filBomba + 1][colBomba] = "!";
						if (mapa[filBomba][colBomba + 1] != "@")
							mapa[filBomba][colBomba + 1] = "!";
						if (mapa[filBomba][colBomba - 1] != "@")
							mapa[filBomba][colBomba - 1] = "!";
						if (mapa[filBomba + 1][colBomba + 1] != "@")
							mapa[filBomba + 1][colBomba + 1] = "!";
						if (mapa[filBomba + 1][colBomba - 1] != "@")
							mapa[filBomba + 1][colBomba - 1] = "!";
					} else if (colBomba == size - 1) {
						if (mapa[filBomba + 1][colBomba] != "@")
							mapa[filBomba + 1][colBomba] = "!";
						if (mapa[filBomba][colBomba - 1] != "@")
							mapa[filBomba][colBomba - 1] = "!";
						if (mapa[filBomba + 1][colBomba - 1] != "@")
							mapa[filBomba + 1][colBomba - 1] = "!";
					}
				} else if (filBomba > 0 && filBomba < size - 1) {
					if (colBomba == 0) {
						if (mapa[filBomba + 1][colBomba] != "@")
							mapa[filBomba + 1][colBomba] = "!";
						if (mapa[filBomba - 1][colBomba] != "@")
							mapa[filBomba - 1][colBomba] = "!";
						if (mapa[filBomba][colBomba + 1] != "@")
							mapa[filBomba][colBomba + 1] = "!";
						if (mapa[filBomba + 1][colBomba + 1] != "@")
							mapa[filBomba + 1][colBomba + 1] = "!";
						if (mapa[filBomba - 1][colBomba + 1] != "@")
							mapa[filBomba - 1][colBomba + 1] = "!";
					} else if (colBomba > 0 && colBomba < size - 1) {
						if (mapa[filBomba + 1][colBomba] != "@")
							mapa[filBomba + 1][colBomba] = "!";
						if (mapa[filBomba - 1][colBomba] != "@")
							mapa[filBomba - 1][colBomba] = "!";
						if (mapa[filBomba][colBomba + 1] != "@")
							mapa[filBomba][colBomba + 1] = "!";
						if (mapa[filBomba][colBomba - 1] != "@")
							mapa[filBomba][colBomba - 1] = "!";
						if (mapa[filBomba + 1][colBomba + 1] != "@")
							mapa[filBomba + 1][colBomba + 1] = "!";
						if (mapa[filBomba - 1][colBomba + 1] != "@")
							mapa[filBomba - 1][colBomba + 1] = "!";
						if (mapa[filBomba + 1][colBomba - 1] != "@")
							mapa[filBomba + 1][colBomba - 1] = "!";
						if (mapa[filBomba - 1][colBomba - 1] != "@")
							mapa[filBomba - 1][colBomba - 1] = "!";
					} else if (colBomba == size - 1) {
						if (mapa[filBomba + 1][colBomba] != "@")
							mapa[filBomba + 1][colBomba] = "!";
						if (mapa[filBomba - 1][colBomba] != "@")
							mapa[filBomba - 1][colBomba] = "!";
						if (mapa[filBomba][colBomba - 1] != "@")
							mapa[filBomba][colBomba - 1] = "!";
						if (mapa[filBomba - 1][colBomba - 1] != "@")
							mapa[filBomba - 1][colBomba - 1] = "!";
						if (mapa[filBomba + 1][colBomba - 1] != "@")
							mapa[filBomba + 1][colBomba - 1] = "!";
					}
				} else if (filBomba == size - 1) {
					if (colBomba == 0) {
						if (mapa[filBomba - 1][colBomba] != "@")
							mapa[filBomba - 1][colBomba] = "!";
						if (mapa[filBomba][colBomba + 1] != "@")
							mapa[filBomba][colBomba + 1] = "!";
						if (mapa[filBomba - 1][colBomba + 1] != "@")
							mapa[filBomba - 1][colBomba + 1] = "!";
					} else if (colBomba > 0 && colBomba < size - 1) {
						if (mapa[filBomba - 1][colBomba] != "@")
							mapa[filBomba - 1][colBomba] = "!";
						if (mapa[filBomba][colBomba + 1] != "@")
							mapa[filBomba][colBomba + 1] = "!";
						if (mapa[filBomba][colBomba - 1] != "@")
							mapa[filBomba][colBomba - 1] = "!";
						if (mapa[filBomba - 1][colBomba - 1] != "@")
							mapa[filBomba - 1][colBomba - 1] = "!";
						if (mapa[filBomba - 1][colBomba + 1] != "@")
							mapa[filBomba - 1][colBomba + 1] = "!";
					} else if (colBomba == size - 1) {
						if (mapa[filBomba - 1][colBomba] != "@")
							mapa[filBomba - 1][colBomba] = "!";
						if (mapa[filBomba - 1][colBomba - 1] != "@")
							mapa[filBomba][colBomba - 1] = "!";
						if (mapa[filBomba - 1][colBomba] != "@")
							mapa[filBomba - 1][colBomba - 1] = "!";
					}
				}
				ocupada = false;
				cont2++;
			}
		}

		filTesoro = (int) (Math.random() * size);
		colTesoro = (int) (Math.random() * size);

		while (ocuTesoro == false) {
			if (mapa[filTesoro][colTesoro] != "@") {

				mapa[filTesoro][colTesoro] = "$";

				ocuTesoro = true;
			}
			filTesoro = (int) (Math.random() * size);
			colTesoro = (int) (Math.random() * size);
		}
	}

	public static void imprimirMatriz() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= size; j++) {
				if (cont < size) {
					System.out.print(mapa[i][j] + " ");
					cont++;
				} else {
					System.out.println("");
					cont = 0;
				}
			}
		}
	}
}

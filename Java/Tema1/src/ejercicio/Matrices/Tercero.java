package ejercicio.Matrices;

import java.util.Scanner;

public class Tercero {

	static Scanner sc = new Scanner(System.in);
	static int[][] nums;
	static int[] array;
	static int filas, columnas, control, posicion = 0;

	public static void main(String[] args) {

		MatrizRandom matriz = new MatrizRandom();

		System.out.println("Escribe las dimensiones de la matriz: ");
		System.out.print("Filas: ");
		filas = Integer.parseInt(sc.next());
		while (filas < 2) {
			System.out.print("Introduce más de 2 filas: ");
			filas = Integer.parseInt(sc.next());
		}

		System.out.print("Columnas: ");
		columnas = Integer.parseInt(sc.next());
		while (columnas < 2) {
			System.out.print("Introduce más de 2 columnas: ");
			columnas = Integer.parseInt(sc.next());
		}

		nums = new int[filas][columnas];
		array = new int[((filas * 2) + (columnas * 2)) - 4];
		System.out.println();

		matriz.rellenar(nums);

		bordes();

//		Más eficiente, pero para cuadradas
//		for (int i = 0; i < filas; i++) {
//			array[posicion++] = nums[i][filas];
//		}
//		
//		for (int i = columnas - 2; i >= 0; i--) {
//			array[posicion++] = nums[columnas - 2][i];
//		}
//		
//		for (int i = filas - 2; i >= 0; i--) {
//			array[posicion++] = nums[i][0];
//		}
//		
//		for (int i = 1; i < columnas - 1; i++) {
//			array[posicion++] = nums[0][i];
//		}

		MatrizRandom.imprimir(nums);

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		sc.close();
	}

	// Obtenemos los bordes de la matriz de forma horaria (clockwise), empezando
	// desde el numero en la esquina superior derecha
	public static void bordes() {

		boolean exit = false;

		// Bajamos la ultima columna introduciendo los valores
		for (int i = 0; i < nums.length; i++) {
			control = 0; // Empieza la columna desde la posicion 0 para coger todos los valores
			for (int j = nums[i].length; j >= 0; j--) {
				while (j == nums[i].length - 1 && exit == false) {
					array[posicion++] = nums[control++][j];
					if (control == nums.length) {
						exit = true;
					}
				}
			}
		}
		exit = false;

		// Recorremos la ultima fila introduciendo los valores
		for (int i = nums.length - 1; i >= 0; i--) {
			control = nums[i].length - 2; // Empieza la fila desde la penultima posicion, para no repetir el valor de la
											// esquina inferior derecha
			for (int j = nums[i].length; j >= 0; j--) {
				while (i == nums.length - 1 && exit == false) {
					array[posicion++] = nums[i][control--];
					if (control < 0) {
						exit = true;
					}
				}
			}
		}
		exit = false;

		// Subimos la primera columna introduciendo los valores
		for (int i = nums.length - 1; i > 0; i--) {
			control = nums.length - 2; // Empieza la columna desde la penultima posicion, para no repetir el valor de
										// la esquina inferior izquierda
			for (int j = 0; j < nums[i].length; j++) {
				while (j == 0 && exit == false) {
					array[posicion++] = nums[control--][j];
					if (control < 0) {
						exit = true;
					}
				}
			}
		}
		exit = false;

		// Recorremos la primera fila introduciendo los valores
		for (int i = 0; i < nums.length; i++) {
			control = 1; // Empieza la fila desde la segunda posicion para no repetir el valor de la
							// esquina superior izquierda, comprobando que cuando control
							// valga la distancia del array-1 termine el programa (esto se hace para que no
							// se repita el valor de la esquina superior derecha)
			for (int j = 0; j < nums[i].length; j++) {
				while (i == 0 && exit == false) {
					array[posicion++] = nums[i][control++];
					if (control == nums[i].length - 1) {
						exit = true;
					}
				}
			}
		}
		exit = false;
	}

}

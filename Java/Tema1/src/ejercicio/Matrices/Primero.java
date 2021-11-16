package ejercicio.Matrices;

import java.util.Scanner;

public class Primero {

	public static void main(String[] args) {
		MatrizRandom matriz = new MatrizRandom();
		Scanner sc = new Scanner(System.in);
		int[][] nums;
		int filas, columnas, buscar, cont = 0;
		
		System.out.println("Dimensiones de la matriz: ");
		System.out.print("Filas: ");
		filas = Integer.parseInt(sc.next());
		System.out.print("Columnas: ");
		columnas = Integer.parseInt(sc.next());
		nums = new int[filas][columnas];
		System.out.println();

		matriz.rellenar(nums);
		
		MatrizRandom.imprimir(nums);
		
		System.out.print("\nCuantas veces se repite el número: ");
		buscar = Integer.parseInt(sc.next());
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] == buscar) {
					cont++;
				}
			}
		}
		
		System.out.println("Tu número se repite " + cont + " veces.");
		sc.close();
	}

}

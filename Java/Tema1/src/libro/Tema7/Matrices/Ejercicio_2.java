package libro.Tema7.Matrices;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fila = 5, colum = 6;
		int[][] nums = new int[fila][colum];
		int sumaFila = 0, sumaColum = 0, total = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums[i].length - 1; j++) {
				System.out.print("Introduce el número de la fila " + i + " y la columna " + j + ": ");
				nums[i][j] = Integer.parseInt(sc.next());
			}
		}

		for (int i = 0; i < fila; i++) {
			sumaFila = 0;
			for (int j = 0; j < colum; j++) {
				sumaFila += nums[i][j];
				if (j == (colum - 1)) {
					nums[i][j] = sumaFila;
					total += sumaFila;
				}
			}
		}

		for (int j = 0; j < colum - 1; j++) {
			sumaColum = 0;
			for (int i = 0; i < fila; i++) {
				sumaColum += nums[i][j];
				if (i == (fila - 1)) {
					nums[i][j] = sumaColum;
					total += sumaColum;
				}
			}
		}
		
		nums[fila-1][colum-1] = total;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}

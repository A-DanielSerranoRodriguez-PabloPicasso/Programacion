package libro.Tema7.Matrices;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fila = 5, colum = 6;
		int[][] nums = new int[fila][colum];
		int sumaFila = 0, sumaColum = 0, total = 0;
		int random = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums[i].length - 1; j++) {
				random = (int) (Math.random() * 1000);
				while (random < 100) {
					random = (int) (Math.random() * 1000);
				}
				nums[i][j] = random;
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
				if (j == colum - 2) {
					try{
						Thread.sleep(600);
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
				if (j == colum - 1 || i == fila - 1) {
					try{
						Thread.sleep(600);
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}

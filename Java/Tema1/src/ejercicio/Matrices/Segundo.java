package ejercicio.Matrices;

import java.util.Scanner;

public class Segundo {
	
	public static void main(String[] args) {
		MatrizRandom matriz = new MatrizRandom();
		Scanner sc = new Scanner (System.in);
		int[][] nums;
		int[] diag1, diag2;
		int dim;
		
		System.out.print("Introduce la dimensión de la matriz cuadrada (4 = 4x4, 10=10x10, etc): ");
		dim = Integer.parseInt(sc.next());
		nums = new int[dim][dim];
		diag1 = new int[dim];
		diag2 = new int[dim];
		
		System.out.println();
		
		matriz.rellenar(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (i == j) {
					diag1[i] = nums[i][j];
				}
			}
		}
		
//		Más eficiente
//		for (int i = 0; i < nums.length; i++) {
//			diag1[i] = nums[i][i];
//		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums[i].length; j >= 0; j--) {
				if ((i + j) == (nums[i].length - 1)) {
					diag2[i] = nums[i][j];
				}
			}
		}
		
//		Más eficiente
//		int length = nums.length - 1;
//		for (int i = 0; i < nums.length; i++) {
//			diag2[i] = nums[i][length--];
//		}
		
		MatrizRandom.imprimir(nums);
		
		System.out.println();
		for (int i = 0; i < diag1.length; i++) {
			System.out.print(diag1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < diag2.length; i++) {
			System.out.print(diag2[i] + " ");
		}
		
		sc.close();
	}

}

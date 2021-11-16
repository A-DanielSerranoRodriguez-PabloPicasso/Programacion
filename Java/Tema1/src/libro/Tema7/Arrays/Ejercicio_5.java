package libro.Tema7.Arrays;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
		int maxNum = 0, minNum = 0;

		System.out.println("Introduce 10 numeros");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Num: ");
			numeros[i] = Integer.parseInt(sc.next());
		}

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > min) {
				max = numeros[i];
			}

			if (numeros[i] < max || numeros[i] == max) {
				min = numeros[i];
				for (int j = 0; j < i; j++) {
					if (min > numeros[j]) {
						min = numeros[j];
					}
				}
			}
		}

		for (int i = 0; i < numeros.length; i++) {

//			Solución 1
			/*
			 * if (numeros[i] == max && numeros[i] == min) { System.out.println(numeros[i] +
			 * " es el máximo y el mínimo"); break; } else if (numeros[i] == max) {
			 * System.out.println(numeros[i] + " es el máximo"); } else if (numeros[i] ==
			 * min) { System.out.println(numeros[i] + " es el mínimo"); } else
			 * System.out.println(numeros[i]);
			 */

//			Solución 2
			System.out.print(numeros[i] + " ");
			if (numeros[i] == max && numeros[i] == min) {
				minNum = numeros[i];
				maxNum = minNum;
			} else if (numeros[i] == max) {
				maxNum = numeros[i];
			} else if (numeros[i] == min) {
				minNum = numeros[i];
			}

		}

		System.out.println("\nMáximo: " + maxNum + "\t Mínimo: " + minNum);
//		Fin solución 2
		
		sc.close();
	}

}

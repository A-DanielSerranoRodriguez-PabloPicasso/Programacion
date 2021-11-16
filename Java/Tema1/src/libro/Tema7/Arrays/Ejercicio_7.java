package libro.Tema7.Arrays;

import java.util.Scanner;

public class Ejercicio_7 {
	
	static int[] aleatorios = new int[100];
	static int num1, num2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		array1();
		
		System.out.print("Introduce un número de la lista: ");
		num1 = Integer.parseInt(sc.next());
		
		System.out.print("Introduce un número por el que sustituirlo: ");
		num2 = Integer.parseInt(sc.next());
		
		sustitucion(num1, num2);
		
		sc.close();
	}
	
	public static void array1(){
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int) (Math.random() * 21);
		}
		for (int i = 0; i < aleatorios.length; i++) {
			System.out.print(aleatorios[i] + " ");
		}
		System.out.println();
	}
	
	public static void sustitucion(int num1, int num2) {
		for (int i = 0; i < aleatorios.length; i++) {
			if (aleatorios[i] == num1) {
				aleatorios[i] = num2;
				System.out.print("\"" + aleatorios[i] + "\" ");
			} else
				System.out.print(aleatorios[i] + " ");
		}
	}
}

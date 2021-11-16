package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1, cantImpar = 0, impar = 0, mayorPar = 0;
		double mediaImpar = 0;
		
		System.out.println("Introduce números. Para parar, introduce un número negativo.");
		
		while (num > 0) {
			System.out.print("Numero: ");
			num = Integer.parseInt(sc.next());
			if ((num % 2) == 0) {
				if (num > mayorPar) {
					mayorPar = num;
				}
			} else {
				impar += num;
				cantImpar++;
				if (num < 0) {
					impar -= num;
					cantImpar--;
				}
			}
		}
		
		mediaImpar = (double) impar / cantImpar;
		
		System.out.println("Este es el mayor par: " + mayorPar);
		System.out.println("Esta es la media impar: " + mediaImpar);
		
		sc.close();
	}
}

package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i, modulo = 0, divisible = 0;
		
		System.out.print("Introduce un número para comprobar si es primo: ");
		num = Integer.parseInt(sc.next());
		
		for (i = 1; i <= num; i++) {
			modulo = num % i;
			if (modulo == 0) {
				divisible++;
			}
		}
		
		if(divisible > 2) {
			System.out.println("No es primo");
		} else
			System.out.println("Si es primo");
		
		sc.close();
	}
}

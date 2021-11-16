package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, multiplo;
		
		System.out.print("Introduce un número para ver su tabla de multiplicar: ");
		num = Integer.parseInt(sc.next());
		
		for (int i = 1; i <= 10; i++) {
			multiplo = i * num;
			System.out.println(multiplo);
		}
		
		sc.close();
	}
}

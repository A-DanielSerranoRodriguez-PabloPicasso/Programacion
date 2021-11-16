package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_14 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, par, cinco;
		
		System.out.print("Introduce un número: ");
		num = Integer.parseInt(sc.nextLine());
		
		par = num % 2;
		cinco = num % 5;
		
		if (par == 0) {
			if (cinco == 0) {
				System.out.println("Es par y divisible entre 5.");
			}else
				System.out.println("Es par.");
		}else if (cinco == 0) {
			if (par == 0) {
				System.out.println("Es par y divisible entre 5.");
			}else
				System.out.println("No es par, pero es divisible entre 5.");
		}
		
		sc.close();
	}
}

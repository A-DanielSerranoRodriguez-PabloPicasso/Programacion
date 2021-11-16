package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_13 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		
		System.out.println("Introduce 3 números enteros para ser ordenados");
		System.out.print("Primero: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("Segundo: ");
		b = Integer.parseInt(sc.nextLine());
		System.out.print("Tercero: ");
		c = Integer.parseInt(sc.nextLine());
		
		if (a < b && a < c) {
			if (b < c) {
				System.out.println(a + " " + b + " " + c);
			}else
				System.out.println(a + " " + c + " " + b);
		}else if (b < a && b < c) {
			if (a < c) {
				System.out.println(b + " " + a + " " + c);
			}else
				System.out.println(b + " " + c + " " + a);
		}else if (c < a && c < b) {
			if (a < b) {
				System.out.println(c + " " + a + " " + b);
			}else
				System.out.println(c + " " + b + " " + a);
		}
		
		sc.close();
	}
}

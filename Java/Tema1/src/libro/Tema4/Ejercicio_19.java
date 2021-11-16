package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_19 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, cantidad = 0;
		
		System.out.print("Introduce un número de como mucho 5 dígitos: ");
		num = Integer.parseInt(sc.next());
		
		if (num < 10 && num > -10) {
			cantidad = 1;
		}else if (num < 100 && num > -100) {
			cantidad = 2;
		}else if (num < 1000 && num > -1000) {
			cantidad = 3;
		}else if (num < 10000 && num > -10000) {
			cantidad = 4;
		}else if (num < 100000 && num > -100000) {
			cantidad = 5;
		}
		
		System.out.println("El número tiene " + cantidad + " de dígitos");
		
		sc.close();
	}
}

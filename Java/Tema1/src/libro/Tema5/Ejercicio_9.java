package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numDigitos = 1, n;
		
		System.out.println("Introduce un numero");
		n = Integer.parseInt(sc.next());
		
		while (n > 10) {
			n = n / 10;
			numDigitos++;
		}
		
		System.out.println("Tiene " + numDigitos + " cantidad de digitos");
		
		sc.close();
	}
}

package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura, alturaBase = 1;
		int i;
		
		System.out.print("Introduce la altura de la pirámide: ");
		altura = Integer.parseInt(sc.next());

		for (alturaBase = 1; alturaBase < altura; alturaBase++) {

			for (i = 1; i < alturaBase; i++) {
				System.out.print(i);
			}

			for (i = alturaBase; i > 0; i--) {
				System.out.print(i);
			}
			System.out.println("");
		}

		sc.close();
	}
}

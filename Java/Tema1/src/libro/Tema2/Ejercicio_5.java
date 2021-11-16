package libro.Tema2;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce cuantas pesetas tienes: ");
		double pesetas = sc.nextDouble();
		double euros = pesetas * 0.006;
		System.out.printf("\nTienes estos euros: %.3f", euros);
		sc.close();
	}

}

package libro.Tema2;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce cuantos euros tienes: ");
		double euros = sc.nextDouble();
		double pesetas = euros * 166.386;
		System.out.printf("\nEstas son tus pesetas: %.3f", pesetas);
		sc.close();
	}

}

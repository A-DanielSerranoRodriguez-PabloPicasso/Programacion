package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = 0, g = 9.81, t = 0;
		
		System.out.print("Introduce la altura desde la que caerá el objeto: ");
		h = Double.parseDouble(sc.nextLine());
		t = Math.sqrt((2 * h) / g);
		System.out.println("Tardará " + t + " segundos en caer.");
		
		sc.close();
	}

}

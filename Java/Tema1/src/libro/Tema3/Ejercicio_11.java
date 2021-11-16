package libro.Tema3;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los Kb para convertirlos a Mb");
		System.out.print("Kb: ");
		double kb = Double.parseDouble(sc.nextLine());
		double mb = kb / 1024;
		System.out.println("Tienes " + mb + " Mb.");
		
		sc.close();
	}

}

package libro.Tema3;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los Mb para convertirlos a Kb");
		System.out.print("Mb: ");
		int mb = Integer.parseInt(sc.nextLine());
		int kb = mb * 1024;
		System.out.println("Tienes " + kb + " Kb.");
		
		sc.close();
	}

}

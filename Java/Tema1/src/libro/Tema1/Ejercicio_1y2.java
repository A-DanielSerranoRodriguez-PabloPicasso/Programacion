package libro.Tema1;

import java.util.Scanner;

public class Ejercicio_1y2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		String dir = sc.nextLine();
		Integer tlf = sc.nextInt();
		System.out.println("Te llamas: " + nombre);
		System.out.println("Vives en: " + dir);
		System.out.println("Tú número de teléfono es:" + tlf);
		sc.close();
	}

}

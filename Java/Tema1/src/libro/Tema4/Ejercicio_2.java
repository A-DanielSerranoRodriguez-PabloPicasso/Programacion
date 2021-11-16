package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una hora (6, 21, 18, etc): ");
		int hora = Integer.parseInt(sc.nextLine());
		if(hora >= 6 && hora < 12) {
			System.out.println("Buenos días");
		}else if(hora >= 12 && hora < 20) {
			System.out.println("Buenas tardes");
		}else if(hora >= 20 || hora < 6) {
			System.out.println("Buenas noches");
		}
		
		sc.close();
	}

}

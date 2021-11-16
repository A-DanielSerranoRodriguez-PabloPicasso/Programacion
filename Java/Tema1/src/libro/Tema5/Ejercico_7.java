package libro.Tema5;

import java.util.Scanner;

public class Ejercico_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean abierto = false;
		int numero = 0;
		int intentos = 4;
		
		System.out.println("Entra en la caja fuerte, introduce el número de 4 digitos");

		while ((intentos > 4) && (abierto = false)) {
			System.out.print("Numero: ");
			numero = Integer.parseInt(sc.next());
			if (numero == 1234) {
				abierto = true;
				System.out.println("Abierta");
			}else
				intentos--;
		}
		
		if (intentos == 0) {
			System.out.println("caca");
		}
		if (abierto) {
			System.out.println("lolo");
		}

		sc.close();
	}
}

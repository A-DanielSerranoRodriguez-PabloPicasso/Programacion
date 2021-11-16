package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura;
		String caracter1, caracter2;

		System.out.println("Vamos a imprimir una pirámide.");
		System.out.print("Introduce un número entero para definir que altura tendrá: ");
		altura = Integer.parseInt(sc.next());

		while (altura <= 0) {
			System.out.println("Introduce una altura positiva");
			System.out.print("Altura: ");
			altura = Integer.parseInt(sc.next());
		}

		System.out.print("Introduce el carácter con el que se hará la pirámide: ");
		caracter1 = sc.next();
		caracter2 = caracter1;
		
		for (int i = 0; i < altura; i++) {
			System.out.println(caracter1);
			caracter1 += caracter2;
		}
		
		sc.close();
	}
}

package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, fibo = 0, cero = 0, uno = 1, extra = 0;

		System.out.println("Vamos a imprimir por pantalla la serie de Fibonacci.");
		System.out.print("Introduce cuántos términos de la serie quieres que aparezcan: ");
		n = Integer.parseInt(sc.next());

		switch (n) {
		case 1:
			System.out.print("0");
			break;
		case 2:
			System.out.print("0, 1");
			break;
		default: {
			System.out.print("0, 1 ");
			while (n > 2) {
				extra = cero;
				cero = uno;
				uno = extra + uno;
				if (n > 3) {
					System.out.print(uno + ", ");
				} else
					System.out.print(uno + ".");
				n--;
			}
		}
		}

		sc.close();
	}
}

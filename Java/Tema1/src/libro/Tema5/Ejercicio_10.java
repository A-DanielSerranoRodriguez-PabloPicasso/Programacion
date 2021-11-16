package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numIntroducido = 0, cantNum = 0, total = 0, resultado = 0;

		System.out.println("Introduce numeros enteros positivos para realizar la media de estos.");
		System.out.println("El programa parará cuando introduzcas un número negativo.");

		while (numIntroducido >= 0) {
			System.out.print("Número: ");
			numIntroducido = Integer.parseInt(sc.next());
			if (numIntroducido >= 0) {
				total += numIntroducido;
				cantNum++;
			}
		}
		
		resultado = total / cantNum;

		System.out.println("La media es: " + resultado);

		sc.close();
	}
}

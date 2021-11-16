package examen1_Programacion;

import java.util.Scanner;

public class SerranoRodríguezDaniel_PROG_UD2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int resul = 0, aux = 0;
		int i;
		String caracter;

		System.out.println("Vamos a realizar cálculos.");
		System.out.print("Introduce el primer número: ");
		num1 = Integer.parseInt(sc.next());
		System.out.print("Introduce el segundo número: ");
		num2 = Integer.parseInt(sc.next());

		System.out.println("\n¿Que operación deseas realizar?");
		System.out.println("\n+ Suma\t\t\t- Resta\n* Multiplicación\t/ División");
		caracter = sc.next();
		while (!caracter.equals("+") && !caracter.equals("-") && !caracter.equals("*") && !caracter.equals("/")) {
			System.out.print("Introduce un carácter válido: ");
			caracter = sc.next();
		}
		switch (caracter) {
		case "+":
			resul = num1 + num2;
			break;

		case "-":
			resul = num1 - num2;
			break;

		case "*":
			if (num1 == 0 || num2 == 1) {
				resul = 0;
			} else if (num2 > 0) {
				for (i = 0; i < num2; i++) {
					resul += num1;
				}
			} else if (num2 < 0) {
				for (i = 0; i > num2; i--) {
					resul -= num1;
				}
			}
			break;

		case "/":
			if (num1 == num2) {
				resul = 1;
			} else if (num2 == 1) {
				resul = num1;
			} else if (num2 > 1) {
				for (i = 0; i < num2; i++) {
					aux++;
				}
				resul = aux;
			}
		}

		System.out.println("\nEl resultado de la operación es: " + resul);
	}

}

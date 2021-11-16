package libro.Tema3;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce 2 números:");
		double num1 = Double.parseDouble(sc.next());
		double num2 = Double.parseDouble(sc.next());
		double multiplicacion = num1 * num2;
		System.out.println("Esta es su multiplicación: " + multiplicacion);
	
		sc.close();
	}

}

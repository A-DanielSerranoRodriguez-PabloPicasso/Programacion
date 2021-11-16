package libro.Tema3;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce dos números: ");
		double x = Double.parseDouble(sc.next());
		double y = Double.parseDouble(sc.next());
		double suma = x + y;
		double resta = x - y;
		double division1 = x / y;
		double division2 = y / x;
		double multiplicacion = x * y;		
		System.out.printf("x = %.3f \t y = %.3f\nSuma = %.3f\nResta = %.3f\nDivisión (x / y) = %.3f\nDivisión (y / x) = %.3f\nMultiplicación = %.3f", x, y, suma, resta, division1, division2, multiplicacion);
	
		sc.close();
	}

}

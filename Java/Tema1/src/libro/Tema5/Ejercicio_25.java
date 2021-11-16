package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, reves = 0, aux = 0;
		
		System.out.print("Introduce un número: ");
		num = sc.nextDouble();
		
		double numero = num;
		double volteado = 0;
		while (numero > 0) {
		volteado = (volteado * 10) + (numero % 10);
		numero /= 10;
		} // while

		
		System.out.println("Volteado es: " + volteado);
		
		sc.close();
	}
}

package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantExponente, expo, potencias, i;
		double base, resul = 1;
		
		System.out.print("Introduce un número real: ");
		base = Double.parseDouble(sc.next());
		System.out.print("Introduce un número entero positivo: ");
		cantExponente = Integer.parseInt(sc.next());
		
		for (i = 1; i <= cantExponente; i++) {
			expo = i;
			for (int j = 1; j <= expo; j++) {
				resul *= base;
			}
			System.out.println(base + "^" + expo + " = " + resul);
			resul=1;
		}
		
		sc.close();
	}
}

package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, cantPosit = 0, cantNegat = 0;
		int i;
		
		System.out.println("Introduce 10 números, vamos a ver cuantos son positivos y cuantos negativos");
		
		for (i = 1; i <= 10; i++) {
			System.out.print("Número " + i + ": ");
			num = Integer.parseInt(sc.next());
			if (num >= 0) {
				cantPosit++;
			} else
				cantNegat++;
		}
		
		if (cantPosit == 10) {
			System.out.println("Solo hay números positivos");
		} else if (cantPosit == 0) {
			System.out.println("Solo hay números negativos");
		} else
			System.out.println("Hay " + cantPosit + " números positivos y " + cantNegat + " números negativos");
		
		sc.close();
	}
}

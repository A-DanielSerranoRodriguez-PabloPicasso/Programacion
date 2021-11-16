package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, i, resul = 0, max;
		
		System.out.println("Introduce un número entero positivo.");
		
		while (num <= 0) {
			System.out.print("Numero: ");
			num = Integer.parseInt(sc.next());
			if (num <= 0) {
				System.out.println("Introduce un número entero positivo mayor que 0.");
			}
		}
		
		max = num + 100;
		
		for (i = 1; i <= max; i++) {
			resul += i;
		}
		
		System.out.println("La suma de los 100 primeros numeros es: " + resul);
		
		sc.close();
	}
}

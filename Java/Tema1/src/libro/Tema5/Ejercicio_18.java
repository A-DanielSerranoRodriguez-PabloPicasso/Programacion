package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, i, peque = 0, grande = 0;
		
		System.out.println("Introduce 2 números enteros positivos distintos");
		
		while (num1 <= 0 && (num2 <= 0 && num2 == num1)) {
			System.out.print("Número 1: ");
			num1 = Integer.parseInt(sc.next());
			System.out.print("Número 2: ");
			num2 = Integer.parseInt(sc.next());
			if (num2 == num1) {
				System.out.println("Introduce 2 números distintos.");
			}
			if (num2 > num1) {
				peque = num1;
				grande = num2;
			} else {
				peque = num2;
				grande = num1;
			}
				
		}
		
		System.out.println("Vamos a saltar de 7 en 7 desde el mśa pequeño hasta el más grande.");
		
		for (i = peque; i <= grande; i += 7) {
			System.out.println(i);
		}
		
		sc.close();
	}
}

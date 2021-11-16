package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int[] num = {0,0,0,0,0}, cuad = {0,0,0,0,0}, cubo = {0,0,0,0,0};
		
		System.out.println("Introduce un número entero. Se le hará el cuadrado y el cubo, y se mostrará por pantalla");
		System.out.print("Número: ");
		num[0] = Integer.parseInt(sc.next());
		for (i = 0; i < 5; i++) {
			if (num[i] == num[0]) {
				num[i] = num[0];
			} else {
				num[i] = num[i-1] + 1;
			}
			cuad[i] = (int) Math.pow(num[i], 2);
			cubo[i] = (int) Math.pow(num[i], 3);
		}
		
		if (i == 5) {
			System.out.println("   Número introducido   |\tCuadrado\t|\tCúbo");
			System.out.println("-------------------------------------------------------------");

			for (j = 0; j < 5; j++) {
				System.out.println("\t  " + num[j] + "\t\t|\t   " + cuad[j] + "\t\t|\t " + cubo[j]);
			}
		}
		sc.close();
	}
}

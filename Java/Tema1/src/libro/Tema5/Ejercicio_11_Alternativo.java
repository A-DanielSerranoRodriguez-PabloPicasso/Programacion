package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_11_Alternativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int[] num = {0,0,0,0,0}, cuad = {0,0,0,0,0}, cubo = {0,0,0,0,0};
		
		System.out.println("Introduce un número entero. Se le hará el cuadrado y el cubo, y se mostrará por pantalla");
		for (i = 0; i < 5; i++) {
			System.out.print("Número: ");
			num[i] = Integer.parseInt(sc.next());
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

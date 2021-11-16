package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_17 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, ultimoDigito;
		
		System.out.print("Introduce un número entero: ");
		num = Integer.parseInt(sc.nextLine());
		ultimoDigito = (Math.abs(num) % 10);
		
		System.out.println("Este es el último dígito: " + ultimoDigito);
		
		sc.close();
	}
}

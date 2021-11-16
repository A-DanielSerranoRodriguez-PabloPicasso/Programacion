package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		double media;
		int cantNum = 0, total = 0;
		
		System.out.println("Ve introduciendo números hasta sumar más de 10000.");
		
		while (total < 10000) {
			System.out.print("Número: ");
			num = Integer.parseInt(sc.next());
			
			total += num;
			cantNum++;
		}
		
		media = (double) total / cantNum;
		
		System.out.println("El total es: " + total + ", habiendo introducido " + cantNum + " números, con una media de " + media);
		
		sc.close();
	}
}
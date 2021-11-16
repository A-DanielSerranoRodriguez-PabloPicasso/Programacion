package libro.Tema3;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduce la base y la altura del triángulo: ");
		System.out.print("Base: ");
		double lado1 = Double.parseDouble(sc.next());
		System.out.print("Altura: ");
		double lado2 = Double.parseDouble(sc.next());
		double area = (lado1 * lado2) / 2;
		System.out.println("Esta es el área del triángulo: " + area);
		
		sc.close();
	}

}

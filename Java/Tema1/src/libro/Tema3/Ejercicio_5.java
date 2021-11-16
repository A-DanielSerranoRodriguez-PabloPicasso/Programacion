package libro.Tema3;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduce la base y la altura del rectángulo: ");
		double lado1 = Double.parseDouble(sc.next());
		double lado2 = Double.parseDouble(sc.next());
		double area = lado1 * lado2;
		System.out.println("Esta es el área del rectángulo: " + area);
		
		sc.close();
	}

}

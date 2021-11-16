package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, resultado1, resultado2;
		
		System.out.println("Introduce los valores para resolver ax² + bx + c = 0");
		System.out.print("a: ");
		a = Double.parseDouble(sc.next());
		System.out.print("b: ");
		b = Double.parseDouble(sc.next());
		System.out.print("c: ");
		c = Double.parseDouble(sc.next());
		resultado1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
		resultado2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
		if(a == 0) {
			System.out.println("No tiene solución");
		}else
		System.out.println("Los resultados son: " + resultado1 + " y " + resultado2);
		
		sc.close();
	}
}

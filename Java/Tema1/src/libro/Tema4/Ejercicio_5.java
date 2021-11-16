package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, x;
		
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		System.out.print("Por favor, introduzca el valor de a: ");
		a = Double.parseDouble(sc.nextLine());
		System.out.print("Ahora, introduzca el valor de b: ");
		b = Double.parseDouble(sc.nextLine());
		b = -b;
		x = b / a;
		if(a == 0) {
			System.out.println("Esta ecuación no tiene solución real.");
		}else
			System.out.println("x = " + x);
		
		
		sc.close();
	}

}

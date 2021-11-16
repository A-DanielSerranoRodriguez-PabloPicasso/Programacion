package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_15 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String caracter, orientacion;		
		
		System.out.print("Introduce el carácter que formara la \"pirámide\": ");
		caracter = sc.next();
		System.out.print("Que orientación quieres que tenga el pico de la pirámide (ARriba, ABajo, IZquierda, DErecha): ");
		orientacion = sc.next();
		System.out.println("");
		
		switch (orientacion) {
		case "AR":{
			System.out.println("    " + caracter);
			System.out.println("   " + caracter + caracter + caracter);
			System.out.println("  " + caracter + caracter + caracter + caracter + caracter);
			System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
			System.out.println(caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
			break;
		}
		case "AB":{
			System.out.println(caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
			System.out.println(" " + caracter + caracter + caracter + caracter + caracter + caracter + caracter);
			System.out.println("  " + caracter + caracter + caracter + caracter + caracter);
			System.out.println("   " + caracter + caracter + caracter);
			System.out.println("    " + caracter);
			break;
		}
		case "IZ":{
			System.out.println("    " + caracter);
			System.out.println("   " + caracter + caracter);
			System.out.println("  " + caracter + caracter + caracter);
			System.out.println(" " + caracter + caracter + caracter + caracter);
			System.out.println(caracter + caracter + caracter + caracter + caracter);
			System.out.println(" " + caracter + caracter + caracter + caracter);
			System.out.println("  " + caracter + caracter + caracter);
			System.out.println("   " + caracter + caracter);
			System.out.println("    " + caracter);
			break;
		}
		case "DE":{
			System.out.println(caracter + "    ");
			System.out.println(caracter + caracter + "   ");
			System.out.println(caracter + caracter + caracter + "  ");
			System.out.println(caracter + caracter + caracter + caracter + " ");
			System.out.println(caracter + caracter + caracter + caracter + caracter);
			System.out.println(caracter + caracter + caracter + caracter + " ");
			System.out.println(caracter + caracter + caracter + "  ");
			System.out.println(caracter + caracter + "   ");
			System.out.println(caracter + "    ");
			break;
		}
		default: System.out.println("Introduce una orientación indicada por las mayúsculas (ARriba, IZquierda)");
		}
		
		sc.close();
	}
}

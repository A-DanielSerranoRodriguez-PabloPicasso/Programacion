package libro.Tema3;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a calcular el volumen de un cono. Introduce la altura y el radio.");
		System.out.print("Altura: ");
		double altura = Double.parseDouble(sc.nextLine());
		System.out.print("Radio: ");
		double radio = Double.parseDouble(sc.nextLine());
		double volumen = (Math.PI * Math.pow(radio, 2) * altura) / 3;
		System.out.println("El volumen del cono es: " + volumen);
	
		sc.close();
	}

}

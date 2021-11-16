package libro.Tema3;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1;
		double notaTrimestre;
		double necesito;
		
		System.out.print("Introduce la nota del primer examen: ");
		nota1 = Double.parseDouble(sc.nextLine());
		System.out.print("¿Qué nota quieres sacar en el trimestre? ");
		notaTrimestre = Double.parseDouble(sc.nextLine());
		double valorNota1 = nota1 * 0.4;
		necesito = (notaTrimestre - valorNota1) / 0.6;
		System.out.println("Para tener un " + notaTrimestre + " en el trimestre, necesitas sacar un " + necesito + " en el segundo examen.");
	
		sc.close();
	}

}

package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_11 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora, minutos, segundos, falta;
		int medianoche = 24 * 3600;
		
		System.out.println("Vamos a calcular cuanto queda para medianoche, introduce laa hora y los minutos.");
		System.out.print("Horas: ");
		hora = Integer.parseInt(sc.nextLine());
		System.out.print("Minutos: ");
		minutos = Integer.parseInt(sc.nextLine());
		
		segundos = hora * 3600;
		segundos += minutos * 60;
		falta = medianoche - segundos;
		
		System.out.println("Quedan " + falta + " segundos para medianoche.");
		
		sc.close();
	}
}

package libro.Tema3;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teniendo en cuenta que cobras 12€ la hora, ¿cuantas horas trabajas a la semana?");
		System.out.print("Horas de trabajo semanales: ");
		int horas = Integer.parseInt(sc.next());
		int sueldo = horas * 12;
		System.out.println("Tu sueldo semanal es de: " + sueldo + "€");
		
		sc.close();
	}

}

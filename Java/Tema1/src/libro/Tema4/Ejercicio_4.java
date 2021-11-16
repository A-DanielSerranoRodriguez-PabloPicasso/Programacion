package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
		int horas = Integer.parseInt(sc.next());
		int extra = 0, sueldoFinal;
		if(horas > 40) {
			extra = horas - 40;
			horas = 40;
		}
		int sueldo1 = horas * 12;
		int sueldo2 = extra * 16;
		sueldoFinal = sueldo1 + sueldo2;
		System.out.println("El sueldo semanal que le corresponde es de " + sueldoFinal + " euros");
		
		sc.close();
	}

}
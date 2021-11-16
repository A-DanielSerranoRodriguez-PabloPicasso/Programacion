package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] asignaturas = {"Base de datos", "Lenguaje de marcas", "Entornos de desarrollo", "Programación", "Formación y Orientación Laboral", "Sistemas Informáticos"};
		System.out.print("Introduce el día de la semana (lunes, martes, etc): ");
		String dia = sc.nextLine();
		switch(dia){
		case "lunes":
		case "Lunes": System.out.println(asignaturas[0]);
			break;
		case "martes":
		case "Martes": System.out.println(asignaturas[5]);
			break;
		case "miércoles":
		case "miercoles":
		case "Miércoles":
		case "Miercoles": System.out.println(asignaturas[4]);
			break;
		case "jueves":
		case "Jueves": System.out.println(asignaturas[0]);
			break;
		case "viernes":
		case "Viernes": System.out.println(asignaturas[3]);
			break;
			
		default: System.out.println("Introduce un dia de clase subnorma.");
		}
		
		sc.close();
	}

}

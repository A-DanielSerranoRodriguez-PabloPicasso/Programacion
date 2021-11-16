package libro.Tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] semana = { "lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo" };
		String dia1, dia2;
		int i, hora1, hora2, total, horas1, horas2, horas = 0, totalhoras, posi1, posi2, momento1=0, momento2=0;

		System.out.println("Por favor, introduzca la primera hora.");
		System.out.print("Día: ");
		dia1 = sc.next();
		switch (dia1) {
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
			while (Integer.parseInt(dia1) < 1 || Integer.parseInt(dia1) > 7) {
				System.out.print("Día (entre 1 y 7): ");
				dia1 = sc.next();
			}
			break;
		case "lunes":
		case "martes":
		case "miércoles":
		case "jueves":
		case "viernes":
		case "sábado":
		case "domingo":
			break;
		default:
			System.out.print("Día (entre lunes y domingo): ");
			dia1 = sc.next();
			break;
		}

		System.out.print("Hora: ");
		hora1 = Integer.parseInt(sc.next());

		System.out.println("Por favor, introduzca la segunda hora.");
		System.out.print("Día: ");
		dia2 = sc.next();
		switch (dia2) {
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
			while (Integer.parseInt(dia2) < 1 || Integer.parseInt(dia2) > 7) {
				System.out.print("Día (entre 1 y 7): ");
				dia1 = sc.next();
			}
			while (Integer.parseInt(dia1) > Integer.parseInt(dia2)) {
				System.out.println("Por favor, introduzca la segunda hora. (un día posterior, no anterior)");
				System.out.print("Día: ");
				dia2 = sc.next();
			}
			break;
		case "lunes":
		case "martes":
		case "miércoles":
		case "jueves":
		case "viernes":
		case "sábado":
		case "domingo":
			posi1 = Arrays.asList(semana).indexOf(dia1);
			posi2 = Arrays.asList(semana).indexOf(dia2);
			while (posi1 > posi2) {
				System.out.print("Día (entre lunes y martes): ");
				dia2 = sc.next();
				posi2 = Arrays.asList(semana).indexOf(dia2);
			}
			break;
		default:
			System.out.print("Día (entre lunes y martes): ");
			dia2 = sc.next();
			posi1 = Arrays.asList(semana).indexOf(dia1);
			posi2 = Arrays.asList(semana).indexOf(dia2);

			while (posi1 > posi2) {
				System.out.print("Día (entre lunes y martes): ");
				dia2 = sc.next();
				posi2 = Arrays.asList(semana).indexOf(dia2);
			}
			break;

		}

		System.out.print("Hora: ");
		hora2 = Integer.parseInt(sc.next());
		if (dia1 == dia2) {
			while (hora1 > hora2) {
				System.out.print("Hora (mayor que la precedente): ");
				hora2 = Integer.parseInt(sc.next());
			}
		}
		
		
		horas1 = 24 - hora1;
		horas2 = hora2;
		
		for (int x = 0; x < 6; x++) {
			if(dia1.equals(semana[x])) {
				momento1=x;
			} else
				momento1=Integer.parseInt(dia1);
			if(dia2.equals(semana[x])) {
				momento2=x;
			} else
				momento2=Integer.parseInt(dia2);
		}
		for (i = momento1; i < momento2; i++) {
			horas = i;
		}

		totalhoras = ((horas - 1) * 24);
		total = totalhoras + horas1 + horas2;

		System.out.println("Entre las " + hora1 + ":00 del " + dia1 + " y las " + hora2 + ":00 del " + dia2 + " hay "
				+ total + " hora/s");

		sc.close();
	}
}

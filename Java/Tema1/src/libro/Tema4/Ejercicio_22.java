package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia, horaYminutos;
		int hora, minutos, minutosDia, minutosRestantes;
		int minutosDelDia = 24 * 60, minutosViernes = 15 * 60, minutosSemana = (minutosDelDia * 4) + (minutosViernes);

		System.out.println(
				"Vamos a calcular cuanto queda para el fin de semana, contando que el fin de semana empieza el Viernes a las 15:00");
		System.out.print("Introduce un día de la semana (lunes, martes, etc.): ");
		dia = sc.next();
		System.out.print("Introduce la hora (hora:minutos): ");
		horaYminutos = sc.next();

		String divide[] = horaYminutos.split(":");
		hora = Integer.parseInt(divide[0]);
		minutos = Integer.parseInt(divide[1]);

		switch (dia) {
		case "Lunes":
		case "lunes": {
			if ((hora < 0 || hora > 24) || (minutos < 0 || minutos > 60)) {
				System.out.println("Introduce valores válidos");
			} else {
				minutosDia = (hora * 60) + minutos;
				minutosRestantes = minutosSemana - minutosDia;
				System.out.println("Quedan " + minutosRestantes + " para el fin de semana");
			}
			break;

		}
		case "Martes":
		case "martes": {
			if ((hora < 0 || hora > 24) || (minutos < 0 || minutos > 60)) {
				System.out.println("Introduce valores válidos");
			} else {
				minutosDia = (minutosDelDia * 1) + (hora * 60) + minutos;
				minutosRestantes = minutosSemana - minutosDia;
				System.out.println("Quedan " + minutosRestantes + " para el fin de semana");

			}
			break;
		}
		case "Miércoles":
		case "Miercoles":
		case "miércoles":
		case "miercoles": {
			if ((hora < 0 || hora > 24) || (minutos < 0 || minutos > 60)) {
				System.out.println("Introduce valores ");
			} else {
				minutosDia = (minutosDelDia * 2) + (hora * 60) + minutos;
				minutosRestantes = minutosSemana - minutosDia;
				System.out.println("Quedan " + minutosRestantes + " para el fin de semana");

			}
			break;
		}
		case "Jueves":
		case "jueves": {
			if ((hora < 0 || hora > 24) || (minutos < 0 || minutos > 60)) {
				System.out.println("Introduce valores válidos");
			} else {
				minutosDia = (minutosDelDia * 3) + (hora * 60) + minutos;
				minutosRestantes = minutosSemana - minutosDia;
				System.out.println("Quedan " + minutosRestantes + " para el fin de semana");

			}
			break;
		}
		case "Viernes":
		case "viernes": {
			if (hora >= 15 && (minutos > 0 || minutos <= 60)) {
				System.out.println("YA ES FIN DE SEMANA");
			} else {
				minutosDia = (minutosDelDia * 4) + (hora * 60) + minutos;
				minutosRestantes = minutosSemana - minutosDia;
				System.out.println("Quedan " + minutosRestantes + " para el fin de semana");

			}
			break;
		}
		case "Sábado":
		case "Sabado":
		case "sábado":
		case "sabado":{
			System.out.println("YA ES FIN DE SEMANA");
			break;
		}
		case "Domingo":
		case "domingo":{
			System.out.println("YA ES FIN DE SEMANA");
			break;
		}
		default: System.out.println("Introduce un día válido");
		}

		sc.close();
	}
}

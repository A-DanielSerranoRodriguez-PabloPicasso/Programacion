package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_26 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double precioNormal = 8, precioMierc = 5, precioJuev = 5.5, precioPareja = 11, descuento = 0.10;
		double precio = 0, total = 0, descontado = 0, precioFinal;
		int entradas, parejas = 0;
		String dia, poseeTarjeta;
		
		System.out.println("Venta de entradas CineCampa");
		System.out.print("Número de entradas: ");
		entradas = Integer.parseInt(sc.next());
		System.out.print("Día de la semana: ");
		dia = sc.next();
		System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
		poseeTarjeta = sc.next();
		
		switch (dia) {
		case "lunes":
		case "Lunes":
		case "martes":
		case "Martes":
		case "viernes":
		case "Viernes":
		case "sábado":
		case "sabado":
		case "Sabado":
		case "Sábado":
		case "domingo":
		case "Domingo":{
			precio = precioNormal;
			total = precio * entradas;
			break;
		}
		case "miercoles":
		case "miércoles":
		case "Miercoles":
		case "Miércoles":{
			precio = precioMierc;
			total = precio * entradas;
			break;
		}
		case "jueves":
		case "Jueves":{
			parejas = entradas / 2;
			precio = precioJuev;
			total = precio * entradas;
			if ((entradas % 2) != 0) {
				total += precioNormal - precioJuev;
			}
			break;
		}
		default:System.out.println("Introduce un día válido");
		}
		
		if (poseeTarjeta.equals("S") || poseeTarjeta.equals("s")) {
			descontado = total * descuento;
			precioFinal = total - descontado;
		} else
			precioFinal = total;
		
		System.out.println("\n");
		System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
		if (dia.equals("jueves") || dia.equals("Jueves")) {
			System.out.println("Entradas parejas\t\t" + parejas);
			System.out.println("Precio por entrada de pareja\t" + precioPareja + "€");
			if ((entradas % 2) != 0) {
				System.out.println("Entradas individuales\t\t1");
				System.out.println("Precio por entrada individual\t" + precio + "€");
			}
		} else {
			System.out.println("Entradas individuales\t\t" + entradas);
			System.out.println("Precio por entrada individual\t" + precio + "€");
		}
		System.out.println("Total\t\t\t\t" + total + "€");
		System.out.println("Descuento\t\t\t" + descontado + "€");
		System.out.println("A pagar\t\t\t\t" + precioFinal + "€");
		
		sc.close();
	}
}

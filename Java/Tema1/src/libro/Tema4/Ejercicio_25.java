package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_25 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, anchura, area, precioBase, total;
		double precioEscudo = 2.5, envio = 3.25;
		String escudoBordado;
		
		System.out.print("Introduce la altura de la bandera en cm: ");
		altura = Integer.parseInt(sc.next());
		System.out.print("Ahora introduzca la anchura: ");
		anchura = Integer.parseInt(sc.next());
		System.out.print("¿Quiere escudo bordado? (s/n): ");
		escudoBordado = sc.next();
		
		area = altura * anchura;
		
		precioBase = area * 0.01;

		if (escudoBordado.equals("s")) {
			total = precioBase + precioEscudo;
		}else
			total = precioBase;
		
		total += envio;
		
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		System.out.println("Bandera de " + area + " cm2:\t" + precioBase + " €");
		if (escudoBordado.equals("s")) {
			System.out.println("Con escudo:\t\t" + precioEscudo + " €");
		}else
			System.out.println("Sin escudo:\t\t0.00 €");
		System.out.println("Gastos de envío:\t" + envio + " €");
		System.out.println("Total:\t\t\t" + total + " €");
		
		sc.close();
	}
}

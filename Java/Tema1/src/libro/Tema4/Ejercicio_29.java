package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String comido, tipoPitufo1 = "", bebido;
		String[] comidas = {"palmera","donut","pitufo"};
		String[] tipoPitufo2 = {"aceite", "tortilla"};
		String[] bebidas = {"zumo","café","cafe"};
		double precio = 0;
		double[] precioComidas = {1.4, 1};
		double[] precioPitufos = {1.2, 1.6};
		double[] precioBebidas = {1.5, 1.2};
		
		System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
		comido = sc.next();
		if (comido.equals(comidas[2])) {
			System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
			tipoPitufo1 = sc.next();
		}
		System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
		bebido = sc.next();
		
		if (comido.equals(comidas[0])) {
			precio += precioComidas[0];
		} else if (comido.equals(comidas[1])) {
			precio += precioComidas[1];
		}  else if (comido.equals(comidas[2])) {
			if (tipoPitufo1.equals(tipoPitufo2[0])) {
				precio += precioPitufos[0];
			} else if (tipoPitufo1.equals(tipoPitufo2[1])) {
				precio += precioPitufos[1];
			}
		}
		
		if (bebido.equals(bebidas[0])) {
			precio += precioBebidas[0];
		} else if (bebido.equals(bebidas[1])) {
			precio += precioBebidas[1];
		} else if (bebido.equals(bebidas[2])) {
			precio += precioBebidas[1];
		}
		
		if (comido.equals(comidas[0])) {
			System.out.println("Palmera: " + precioComidas[0] + "€");
		} else if (comido.equals(comidas[1])) {
			System.out.println("Donut: " + precioComidas[1] + "€");
		}  else if (comido.equals(comidas[2])) {
			System.out.print("Pitufo con ");
			if (tipoPitufo1.equals(tipoPitufo2[0])) {
				System.out.println("aceite: " + precioPitufos[0] + "€");
			} else if (tipoPitufo1.equals(tipoPitufo2[1])) {
				System.out.println("tortilla: " + precioPitufos[1] + "€");
			}
		}
		if (bebido.equals(bebidas[0])) {
			System.out.println("Zumo: " + precioBebidas[0] + "€");
		} else if (bebido.equals(bebidas[1])) {
			System.out.println("Café: " + precioBebidas[1] + "€");
		} else if (bebido.equals(bebidas[2])) {
			System.out.println("Café: " + precioBebidas[1] + "€");
		}
		System.out.printf("Total desayuno: %.2f€",precio);
		
		sc.close();
	}
}

package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_27 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String sabor, tipoChoco = "", nata, nombre;
		String[] tiposTarta = {"manzana", "fresa", "chocolate"};
		String[] claseChoco = {"negro", "blanco"};
		double[] preciosTarta = {18, 16};
		double[] preciosChoco = {14, 15};
		double precio = 0, conNata = 2.5, conNombre = 2.75;
		
		System.out.print("Elija un sabor (manzana, fresa o chocoloate): ");
		sabor = sc.next();
		if (sabor.equals(tiposTarta[2])) {
			System.out.print("¿Qué tipo de chocolate quiere= (negro o blanco): ");
			tipoChoco = sc.next();
		}
		System.out.print("¿Quiere nata? (sí o no): ");
		nata = sc.next();
		System.out.print("¿Quiere ponerle un nombre? (sí o no): ");
		nombre = sc.next();
		
		if (sabor.equals(tiposTarta[0])) {
			precio = preciosTarta[0];
		} else if (sabor.equals(tiposTarta[1])) {
			precio = preciosTarta[1];
		} else if (sabor.equals(tiposTarta[2])) {
			if (tipoChoco.equals(claseChoco[0])) {
				precio = preciosChoco[0];
			} else if (tipoChoco.equals(claseChoco[1])) {
				precio = preciosChoco[1];
			}
		}
		
		switch (nata) {
		case "si":
		case "sí":
		case "Si":
		case "Sí":
			precio += conNata;
		default:
		}
		
		switch (nombre) {
		case "si":
		case "sí":
		case "Si":
		case "Sí":
			precio += conNombre;
		default:
		}
		
		System.out.println("\n");
		if (sabor.equals(tiposTarta[0])) {
			System.out.println("Tarta de " + tiposTarta[0] + ": " + preciosTarta[0] + "€");
		} else if (sabor.equals(tiposTarta[1])) {
			System.out.println("Tarta de " + tiposTarta[1] + ": " + preciosTarta[1] + "€");
		} else if (sabor.equals(tiposTarta[2])) {
			if (tipoChoco.equals(claseChoco[0])) {
				System.out.println("Tarta de " + tiposTarta[2] + " " + claseChoco[0] + ": " + preciosChoco[0] + "€");
			} else if (tipoChoco.equals(claseChoco[1])) {
				System.out.println("Tarta de " + tiposTarta[2] + " "  + claseChoco[1] + ": " + preciosChoco[1] + "€");
			}
		}
		switch (nata) {
		case "si":
		case "sí":
		case "Si":
		case "Sí":
			System.out.println("Con nata: " + conNata + "€");
		default:
		}
		switch (nombre) {
		case "si":
		case "sí":
		case "Si":
		case "Sí":
			System.out.println("Con nata: " + conNombre + "€");
		default:
		}
		System.out.println("Total: " + precio + "€");
		
		sc.close();
	}
}

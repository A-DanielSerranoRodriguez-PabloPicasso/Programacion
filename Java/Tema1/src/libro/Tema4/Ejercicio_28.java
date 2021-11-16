package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jugador1, jugador2;
		String[] opciones = {"piedra", "papel", "tijera"};
		
		System.out.print("Turno del jugador 1 (piedra, papel o tijera): ");
		jugador1 = sc.next();
		System.out.print("Turno del jugador 2 (piedra, papel o tijera): ");
		jugador2 = sc.next();
		
		if (jugador1.equals(opciones[0])) {
			if (jugador2.equals(opciones[0])) {
				System.out.println("Empate");
			} else if (jugador2.equals(opciones[1])) {
				System.out.println("Gana el jugador 2");
			} else if (jugador2.equals(opciones[2])) {
				System.out.println("Gana el jugador 1");
			}
		} 		if (jugador1.equals(opciones[1])) {
			if (jugador2.equals(opciones[1])) {
				System.out.println("Empate");
			} else if (jugador2.equals(opciones[2])) {
				System.out.println("Gana el jugador 2");
			} else if (jugador2.equals(opciones[0])) {
				System.out.println("Gana el jugador 1");
			}
		} 		if (jugador1.equals(opciones[2])) {
			if (jugador2.equals(opciones[2])) {
				System.out.println("Empate");
			} else if (jugador2.equals(opciones[0])) {
				System.out.println("Gana el jugador 2");
			} else if (jugador2.equals(opciones[1])) {
				System.out.println("Gana el jugador 1");
			}
		}
		
		sc.close();
	}
}

package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_12 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int correcto = 0, i = 0;
		String respuesta;
		String[] preguntas = {"¿Cómo se llama el profesor de Base de Datos?","¿Como se llama el profesor de Lenguaje de Marcas?",
				"¿Como se llama el profesor de FOL?","¿Como se llama el profesor de Programación?",
				"¿Como se llama la profesora de Sistemas Informáticos?","¿Como se llama el profesor de Entornos de Desarrollo?",
				"¿Qué entorno estamos usando para programar en Java?","¿Qué programa estamos usando para virtualizar?",
				"¿Cuál es la primera clase del Jueves?","¿Cuál es la última clase del Martes?"};
		String[] soluciones = {"Nacho","","Agustín","José","Blanca","Enrique","Eclipse","VirtualBox","Base de Datos","Lenguaje de Marcas"};
		
		for(i = 0; i < 10; i++) {
			System.out.print("\n" + preguntas[i] + " ");
			respuesta = sc.nextLine();
			if (respuesta.equals(soluciones[i])) {
				correcto++;
			}
		}
		System.out.println("");
		if (correcto < 5) {
			System.out.println("Suspenso, tienes un " + correcto);
		}else if (correcto == 5) {
			System.out.println("Suficiente, tienes un " + correcto);
		}else if (correcto == 6) {
			System.out.println("Bien, tienes un " + correcto);
		}else if (correcto == 7 || correcto == 8) {
			System.out.println("Notable, tienes un " + correcto);
		}else if (correcto == 9 || correcto == 10) {
			System.out.println("Sobresaliente, tienes un " + correcto);
		}
		
		sc.close();
	}
}

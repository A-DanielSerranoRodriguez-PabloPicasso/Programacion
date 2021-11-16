package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_16 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] preguntas = {"Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.",
				"Ha aumentado sus gastos de vestuario.",
				"Ha perdido el interés que mostraba anteriormente por ti",
				"Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).",
				"No te deja que mires la agenda de su teléfono móvil.",
				"A veces tiene llamadas que dice no querer contestar cuando estás tú delante.",
				"Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.",
				"Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.",
				"Has notado que últimamente se perfuma más.",
				"Se confunde y te dice que ha estado en sitios donde no ha ido contigo."};
		int i, contador = 0;
		String si;
		
		System.out.println("Preguntas para saber si tu pareja te está siendo infiel. Contesta \"Sí\" o \"No\".");
		
		for(i = 0; i < 10; i++) {
			System.out.println(preguntas[i]);
			si = sc.nextLine();
			if (si.equals("Sí") || si.equals("Si") || si.equals("sí") || si.equals("si")) {
				contador += 3;
			}
		}
		
		if (contador >= 0 && contador <= 10) {
			System.out.println("Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		}else if (contador >= 11 && contador <= 22) {
			System.out.println("Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		}else if (contador >= 22 && contador <= 30) {
			System.out.println("Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		}
		
		
		sc.close();
	}
}

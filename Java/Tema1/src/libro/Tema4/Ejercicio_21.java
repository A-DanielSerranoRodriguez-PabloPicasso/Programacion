package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, notaMedia;
		String[] apto = { "apto", "Apto" };
		String recuperacion;

		System.out.print("Nota del primer control: ");
		nota1 = Double.parseDouble(sc.next());
		System.out.print("Nota del segundo control: ");
		nota2 = Double.parseDouble(sc.next());

		notaMedia = (nota1 + nota2) / 2;

		if ((nota1 > 10 || nota1 < 0) || (nota2 > 10 || nota2 < 0)) {
			System.out.println("Introduce notas válidas");
		} else {

			if (notaMedia >= 5 && notaMedia <= 10) {
				System.out.println("Tu nota de Programación es " + notaMedia);
			} else if (notaMedia < 5 && notaMedia >= 0) {
				System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
				recuperacion = sc.next();
				if (recuperacion.equals(apto[0]) || recuperacion.equals(apto[1])) {
					System.out.println("Tu nota de Programación es 5");
				} else
					System.out.println("Tu nota de Programación es " + notaMedia);
			}
		}
		
		sc.close();
	}
}

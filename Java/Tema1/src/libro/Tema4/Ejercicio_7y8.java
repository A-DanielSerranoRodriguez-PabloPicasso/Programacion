package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_7y8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		String[] calificacion = {"Insuficiente", "Suficiente", "Bien", "Notable", "Sobresaliente"};
		
		System.out.print("Introduce 3 notas para realizar la media aritmética: ");
		nota1 = Double.parseDouble(sc.next());
		nota2 = Double.parseDouble(sc.next());
		nota3 = Double.parseDouble(sc.next());
		media = (nota1 + nota2 + nota3) / 3;
		if(media >= 0 && media < 5) {
			System.out.print("Tu nota media es un " + calificacion[0]);
		}else if(media >= 5 && media < 6) {
			System.out.print("Tu nota media es un " + calificacion[1]);
		}else if(media >= 6 && media < 7) {
			System.out.print("Tu nota media es un " + calificacion[2]);
		}else if(media >= 7 && media < 9) {
			System.out.print("Tu nota media es un " + calificacion[3]);
		}else if(media >= 9 && media <= 10)
			System.out.print("Tu nota media es un " + calificacion[4]);
		
		System.out.println(" (" + media + ")");
		
		sc.close();
	}

}

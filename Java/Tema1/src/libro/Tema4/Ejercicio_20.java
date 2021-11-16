package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean capicua = false;
		
		System.out.print("Introduce un número entero positivo para saber si es capicúa: ");
		num = Integer.parseInt(sc.next());
		
		if (num < 10) {
			capicua = true;
		}else if (num > 10 && num < 100) {
			if ((num / 10) == (num % 10)) {
				capicua = true;
			}else
				capicua = false;
		}else if (num > 100 && num < 1000) {
			if ((num / 100) == (num % 10)) {
				capicua = true;
			}else
				capicua = false;
		}else if (num > 1000 && num < 10000) {
			if (((num / 1000) == (num % 10)) && (((num / 100) % 10) == ((num / 10) % 10))) {
				capicua = true;
			}else
				capicua = false;
		}else if (num >= 10000 && num <= 99999) {
			if(((num / 10000) == (num % 10)) && ((num / 1000) % 10) == ((num / 10) % 10)){
				capicua = true;
			}else
				capicua = false;
		}
		
		if (capicua == true) {
			System.out.println("Es un número capicúa (número que se puede leer igual de derecha a izquierda que de izquierda a derecha)");
		}else
			System.out.println("No es un número capicúa");
		
		sc.close();
	}
}

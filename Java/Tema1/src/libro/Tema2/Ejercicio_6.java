package libro.Tema2;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] productos = {"Silla", "Mesa", "Armario", "Nevera"};
		System.out.println("Estas comprando cosas para la casa, introduce los valores de los 4 elementos\n");
		double[] precios = {0,0,0,0};
		double precioFinal = 0;
		for(int i = 0; i < 4; i++) {
			System.out.printf("%s: ", productos[i]);
			precios[i] = Double.parseDouble(sc.next());
			precioFinal += precios[i];
		}
//		System.out.printf("%s: %s\n%s: %s\n%s: %s\n%s: %s", productos[0], precios[0], productos[1], precios[1], productos[2], precios[2], productos[3], precios[3]);
		System.out.println("El precio final es: " + precioFinal);
		sc.close();
	}

}

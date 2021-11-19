package libro.Tema9.POO.ClasesEntregar;

import java.util.Scanner;

public class Prueba_Perro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Perro perro = new Perro("Coco", "aSaber", "Verde", 40);

		System.out.println(perro);
		System.out.println();

		// perro.jugar();
//		perro.jugar();
//		perro.jugar();
//		System.out.println(perro);
//		perro.dormir();
		System.out.println();

//		System.out.println(perro);
//		perro.comer(1);
		System.out.println();
		try {
			perro.necesidades();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		System.out.println(perro);
		try {
			perro.pasear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();

		System.out.println(perro);
		try {
			perro.necesidades();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();

		System.out.println(perro);
		try {
			perro.jugar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			perro.jugar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			perro.jugar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();

		System.out.println(perro);
		System.out.println();
		try {
			perro.dormir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(perro);
		System.out.println();

		System.out.println(perro);
		System.out.println();

		System.out.println(perro);
		System.out.println();

		sc.close();
	}

}

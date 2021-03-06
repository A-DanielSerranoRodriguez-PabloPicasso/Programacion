package libro.Tema9.POO.Ejercicio_2;

import java.util.Scanner;

public class ProbarCoche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0, km;

		Bicicleta bici = new Bicicleta(9);
		Coche coche = new Coche(1900);
		Vehiculo vehiculo = new Vehiculo();

		while (opcion != 8) {
			System.out.println("1. Andar con la bici");
			System.out.println("2. Hacer el caballito con la bicicleta");
			System.out.println("3. Andar con el coche");
			System.out.println("4. Quemar rueda con el coche");
			System.out.println("5. Ver km bici");
			System.out.println("6. Ver km coche");
			System.out.println("7. Ver km total");
			System.out.println("8. Salir");
			System.out.print("Elegir (1-8): ");
			opcion = Integer.parseInt(sc.next());

			switch (opcion) {
			case 1:
				System.out.print("¿Cuantos kilometros? ");
				km = Integer.parseInt(sc.next());
				bici.recorre(km);
				break;
			case 2:
				bici.hacerCaballito();
				break;
			case 3:
				System.out.print("¿Cuantos kilometros? ");
				km = Integer.parseInt(sc.next());
				coche.recorre(km);
				break;
			case 4:
				coche.quemarRueda();
				break;
			case 5:
				System.out.println(bici.getKilometrosRecorridos());
				break;
			case 6:
				System.out.println(coche.getKilometrosRecorridos());
				break;
			case 7:
				System.out.println(vehiculo.getKilometrosTotales());
				break;
			default:
			}

		}
	}

}

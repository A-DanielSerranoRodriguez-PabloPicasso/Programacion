package libro.Tema9.POO.Perro;

import java.util.Scanner;

public class Probar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, vel;
		double c, km;
		boolean enMovimiento = false;

		Motocicleta miMoto = new Motocicleta("Negra", "Toshiba", "1234AAA", "LaMama", "Diesel", 150, 70);
		while (n != 8) {

			System.out.println("1. Arrancar");
			System.out.println("2. Apagar");
			if (!enMovimiento) {
//				System.out.println("3. Andar con la moto");
				System.out.println("3. Comenzar viaje");
				System.out.println("4. Luces de emergencia");
				System.out.println("5. Luz corta");
				System.out.println("6. Luz larga");
				System.out.println("8. Salir");
				System.out.print("Elegir (1-8): ");
				n = Integer.parseInt(sc.next());
			} else {
				System.out.println("3. Acabar el viaje");
				System.out.println("4. Acelerar");
				System.out.println("5. Luz corta");
				System.out.println("6. Luz larga");
				System.out.println("7. Girar derecha");
				System.out.println("8. Girar izquierda");
				System.out.println("9. Repostar");
				System.out.println("10. Salir");
				System.out.print("Elegir (1-10) (cada turno es 1 hora): ");
				n = Integer.parseInt(sc.next());
			}

			switch (n) {
			case 1:
				System.out.println("Mioto arranquiada");
				try {
					miMoto.arrancar();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Mioto apiagiada");
				try {
					miMoto.apagar();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				if (!enMovimiento) {
					enMovimiento = true;
//					System.out.print("¿Cuantos kilometros? ");
//					km = Integer.parseInt(sc.next());
//					try {
//						miMoto.recorrer(km);
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
				} else {
					enMovimiento = false;
				}
				break;

			case 4:
				if (enMovimiento) {
					System.out.print("Velocidad? ");
					vel = Integer.parseInt(sc.next());
					try {
						miMoto.acelerar(vel);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			/*
			 * case 5: System.out.println(bici.getKilometrosRecorridos()); break; case 6:
			 * System.out.println(coche.getKilometrosRecorridos()); break; case 7:
			 * System.out.println(vehiculo.getKilometrosTotales()); break;
			 */
			case 9:
				System.out.print("Cuanta? ");
				c = Integer.parseInt(sc.next());
				try {
					c = miMoto.repostar(30);
					System.out.println("Coste: " + c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
			}
			System.out.println(miMoto.toString());
			System.out.println();
		}

		sc.close();
	}

}

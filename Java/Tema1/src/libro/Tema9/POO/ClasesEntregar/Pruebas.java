package libro.Tema9.POO.ClasesEntregar;

import java.util.Scanner;

public class Pruebas {
	static Scanner sc = new Scanner(System.in);
	static CuentaBancaria cb = new CuentaBancaria("12345678A", 1234);
	static CuentaBancaria cb2 = new CuentaBancaria("98765432Z", 4321);
	static int pin = 0;
	static Motocicleta moto = new Motocicleta("Sunny", "Delight", "Naranja", "1234AAA", 120, 200);
	static int opt = 0;

	public static void main(String[] args) {
		do {
			System.out.println("1. Cuenta bancaria");
			System.out.println("2. Motocicleta");
			System.out.println("4. Salir");
			System.out.println();
			System.out.print("¿Que quieres hacer? ");
			opt = Integer.parseInt(sc.next());
			System.out.println();
			switch (opt) {
			case 1:
				cuentaBancaria();
				break;

			case 2:
				moto();
				break;
				
			case 3:
				opt = -1;
				break;

			default:
				System.out.println("Elige una opcion correcta");
				break;
			}
		} while (opt != -1);

	}

	public static void cuentaBancaria() {
		do {
			if (cb.isBloqueada()) {
				System.out.println("CUENTA BLOQUEADA\n");
				System.out.println("1. Desbloquear cuenta");
				System.out.println("2. Salir");
			} else if (!cb.isConectada()) {
				System.out.println("1. Iniciar sesion");
				System.out.println("2. Salir");
			} else {
				System.out.println("\nBIENVENIDO: " + cb.getDni());
				System.out.println("1. Hacer ingreso");
				System.out.println("2. Hacer retirada");
				System.out.println("3. Hacer transferencia");
				System.out.println("4. Ver estado cuenta");
				System.out.println("5. Salir");
			}
			System.out.println();
			System.out.print("¿Que quieres hacer? ");
			opt = Integer.parseInt(sc.next());

			menuCuentaBancaria();

		} while (opt != -2);

	}

	public static void menuCuentaBancaria() {
		if (cb.isBloqueada()) {
			switch (opt) {
			case 1:
				System.out.print("\nIntroduce el pin: ");
				pin = Integer.parseInt(sc.next());
				cb.desbloquear(pin);
				if (cb.isBloqueada()) {
					System.out.println("\nERROR\n");
				} else if (!cb.isBloqueada()) {
					System.out.println("Cuenta desbloqueada\n");
				}
				break;

			case 2:
				opt = -2;
				break;

			default:
				System.out.println("Elige una opcion correcta");
				break;
			}
		} else if (!cb.isConectada()) {
			switch (opt) {
			case 1:
				System.out.print("Introduce el pin: ");
				pin = Integer.parseInt(sc.next());
				cb.comprobarPin(pin);
				if (!cb.isConectada()) {
					System.out.println("\nPin incorrecto.\n");
				}
				break;

			case 2:
				opt = -2;
				break;

			default:
				System.out.println("Elige una opcion correcta");
				break;
			}
		} else
			switch (opt) {
			case 1:
				System.out.print("¿Cuanto dinero quieres ingresar? ");
				double ingreso = Double.parseDouble(sc.next());
				try {
					cb.ingreso(ingreso);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:
				System.out.print("¿Cuanto dinero quieres retirar? ");
				double retirada = Double.parseDouble(sc.next());
				try {
					cb.retirada(retirada);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 3:
				System.out.print("¿Cuanto dinero quieres transferir? ");
				double transferir = Double.parseDouble(sc.next());
				try {
					cb.transferencia(cb2, transferir);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 4:
				System.out.println(cb);
				break;

			case 5:
				opt = -2;
				break;

			default:
				System.out.println("Elige una opcion correcta");
				break;
			}
	}

	public static void moto() {
		do {
			if (!moto.isArrancada()) {
				System.out.println("1. Encender moto");
				System.out.println("2. Salir");
			} else {
				System.out.println("1. Apagar moto");
				System.out.println("2. Acelerar");
				System.out.println("3. Frenar");
				System.out.println("4. Marcha atras");
				System.out.println("5. Recorrer distancia");
				System.out.println("6. Repostar");
				System.out.println("7. Estado de la moto");
				System.out.println("8. Salir");
			}
			System.out.println();
			System.out.print("¿Que quieres hacer? ");
			opt = Integer.parseInt(sc.next());

			menuMoto();

		} while (opt != -2);
	}

	public static void menuMoto() {
		if (!moto.isArrancada()) {
			switch (opt) {
			case 1:
				try {
					moto.arrancar();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:
				opt = -2;
				break;

			default:
				System.out.println("Elige una opcion correcta");
				break;
			}
		} else if (moto.isArrancada()) {
			switch (opt) {
			case 1:
				try {
					moto.apagar();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:
				System.out.print("¿Cuanto quieres acelerar? ");
				int acelerar = Integer.parseInt(sc.next());
				try {
					moto.acelerar(acelerar);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 3:
				System.out.print("¿Cuanto quieres frenar? ");
				int frenar = Integer.parseInt(sc.next());
				try {
					moto.frenar(frenar);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 4:
				System.out.print("¿Como de rapido quieres ir marcha atras? ");
				int atras = Integer.parseInt(sc.next());
				try {
					moto.marchaAtras(atras);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 5:
				System.out.print("¿Cuento quieres recorrer? ");
				double recorrer = Double.parseDouble(sc.next());
				try {
					moto.recorrer(recorrer);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 6:
				System.out.println("¿Apagar la moto? (1 si / 2 no): ");
				opt = Integer.parseInt(sc.next());
				switch (opt) {
				case 1:
					try {
						moto.apagar();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					break;

				case 2:
					break;

				default:
					System.out.println("Elige una opcion correcta");
					break;
				}

				System.out.print("¿Cuento quieres repostar? ");
				double repostar = Double.parseDouble(sc.next());
				try {
					moto.repostar(repostar);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (!moto.isArrancada())
					try {
						moto.arrancar();
					} catch (Exception e) {
						e.printStackTrace();
					}
				break;

			case 7:
				System.out.println(moto);
				break;

			case 8:
				opt = -2;
				break;

			default:
				System.out.println("Elige una opcion correcta");
				break;
			}
		}
	}

}

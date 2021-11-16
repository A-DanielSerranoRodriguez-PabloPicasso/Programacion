package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cargo, dias, estadoCivil;
		double valorDieta = 30;
		double sueldo = 0, dieta, bruto, retenido = 0, neto;
		double[] cantRetencion = { 0.25, 0.20 };
		String porcRetencion = "";
		Boolean boolCargo = true, boolEC = true;

		System.out.println("1 - Programador junior");
		System.out.println("2 - Programador senior");
		System.out.println("3 - Jefe de proyecto");

		System.out.print("Introduzca el cargo del empleado (1 - 3): ");
		cargo = Integer.parseInt(sc.next());
		System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
		dias = Integer.parseInt(sc.next());
		System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		estadoCivil = Integer.parseInt(sc.next());

		switch (cargo) {
		case 1: {
			sueldo = 950;
			break;
		}
		case 2: {
			sueldo = 1200;
			break;
		}
		case 3: {
			sueldo = 1600;
			break;
		}
		default: {
			boolCargo = false;
		}
		}

		dieta = valorDieta * dias;
		bruto = sueldo + dieta;

		switch (estadoCivil) {
		case 1: {
			retenido = bruto * cantRetencion[0];
			porcRetencion = "25%";
		}
		case 2: {
			retenido = bruto * cantRetencion[1];
			porcRetencion = "20%";
		}
		default: {
			boolEC = false;
		}
		}
		
		neto = bruto - retenido;
		
		if (boolCargo.equals(false)) {
			System.out.println("Introduce un cargo válido");
		}else if (boolEC.equals(false)) {
			System.out.println("Introduce un Estado Civil válido");
		}else if (boolCargo.equals(false) && boolEC.equals(false)) {
			System.out.println("Introduce un cargo y un estado civil válido");
		}else{
			System.out.println("--------------------------------");
			System.out.println("| Sueldo base\t\t" + sueldo + " |");
			System.out.println("| Dietas (" + dias + " viajes)\t" + dieta + " |");
			System.out.println("|------------------------------|");
			System.out.println("| Sueldo bruto\t\t" + bruto + " |");
			System.out.println("| Retención IRPF (" + porcRetencion + ")\t" + retenido + " |");
			System.out.println("|------------------------------|");
			System.out.println("| Sueldo neto\t\t" + neto + " |");
			System.out.println("--------------------------------");
		}

		sc.close();
	}
}

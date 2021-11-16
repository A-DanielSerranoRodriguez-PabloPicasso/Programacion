package libro.Tema4;

import java.util.Scanner;

public class Ejercicio_23 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double baseImponible, valorIva = 0, precioConIVA = 0, descuento = 0, total;
		double[] iva = {0.21, 0.10, 0.04};
		double[] promo = {0.50, -5, 0.05};
		String ivaIntroducido, tipoIva = "", promoIntroducida, tipoPromo = "";
		
		System.out.print("Introduzca la base imponible: ");
		baseImponible = Double.parseDouble(sc.next());
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		ivaIntroducido = sc.next();
		System.out.print("Introduzca el código promociona (nopro, mitad, meno5 o 5porc): ");
		promoIntroducida = sc.next();
		
		switch (ivaIntroducido) {
		case "general":
		case "General":{
			valorIva = baseImponible * iva[0];
			tipoIva = "21%";
			precioConIVA = baseImponible + valorIva;
			break;
		}
		case "reducido":
		case "Reducido":{
			valorIva = baseImponible * iva[1];
			tipoIva = "10%";
			precioConIVA = baseImponible + valorIva;
			break;
		}
		case "superreducido":
		case "Superreducido":{
			valorIva = baseImponible * iva[2];
			tipoIva = "4%";
			precioConIVA = baseImponible + valorIva;
			break;
		}
		default: System.out.println("Introduce un IVA válido");
		}
		
		switch (promoIntroducida) {
		case "nopro":
		case "Nopro":{
			descuento = -0;
			tipoPromo = "nopro";
			break;
		}
		case "mitad":
		case "Mitad":{
			descuento = -(precioConIVA * promo[0]);
			tipoPromo = "mitad";
			break;
		}
		case "meno5":
		case "menos5":
		case "Menos5":
		case "Meno5":{
			descuento = -(precioConIVA * promo[1]);
			tipoPromo = "meno5";
			break;
		}
		case "5porc":
		case "5%":
		case "5Porc":{
			descuento = -(precioConIVA * promo[2]);
			tipoPromo = "5porc";
			break;
		}
		default: System.out.println("Introduce una promoción válida");
		}
		
		total = precioConIVA + descuento;
		
		System.out.println("Base imponible\t\t " + baseImponible);
		System.out.println("IVA (" + tipoIva + ")\t\t " + valorIva);
		System.out.println("Precio con IVA\t\t " + precioConIVA);
		System.out.println("Cód. promo. (" + tipoPromo + ")\t " + descuento);
		System.out.println("TOTAL\t\t\t " + total);
		
		sc.close();
	}
}

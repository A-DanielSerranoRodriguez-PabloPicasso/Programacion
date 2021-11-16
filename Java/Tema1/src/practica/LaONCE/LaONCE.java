package practica.LaONCE;

import java.util.Scanner;

public class LaONCE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double random1, random2, random3, random4, random5, selector, money = 10, coste = 1.5;
		double[] premio = {35000,200,20,6,1.5};
		int intRandom1, intRandom2, intRandom3, intRandom4, intRandom5, intSelector;
		String aNumero, aRandom = "", jugar;

		System.out.println("Bienvenido a la ruleta de la fortuna de La ONCE. Empiezas con " + money + " euros, la entrada son "
				+ coste + " euros.");
		System.out.print("¿Quieres jugar? (si/no): ");
		jugar = sc.next();
		
		while (jugar.equalsIgnoreCase("si") && money > 1.5) {
			money -= 1.5;
			
//			Seleccionamos el rango en el que el número aleatorio tendra digitos distintos de 0 de forma aleatoria
			selector = (Math.random() * 10);
			intSelector = (int) selector;

//			Genera un numero aleatorio con el rango obtenido
			switch (intSelector) {
			case 0:
			case 1:
				random1 = (Math.random() * 10);
				intRandom1 = (int) random1;
				aRandom = "0000" + intRandom1;
				break;
			case 2:
			case 3:
				random2 = (Math.random() * 100);
				intRandom2 = (int) random2;
				aRandom = "000" + intRandom2;
				break;
			case 4:
			case 5:
				random3 = (Math.random() * 1000);
				intRandom3 = (int) random3;
				aRandom = "00" + intRandom3;
				break;
			case 6:
			case 7:
				random4=(Math.random() * 10000);
				intRandom4=(int) random4;
				aRandom = "0" + intRandom4;
				break;
			case 8:
			case 9:
				random5=(Math.random() * 100000);
				intRandom5 = (int) random5;
				aRandom = Integer.toString(intRandom5);
				break;
			}

			System.out.print("Introduce un número entero de 5 digitos (12345 o 00001): ");
			aNumero = sc.next();
			
			int numero = Integer.parseInt(aNumero);
			while (numero < 0 || numero > 99999) {
				System.out.print("Introduce un número válido (menor de 6 digitos positivo y entero): ");
				aNumero = sc.next();
			}
			
//			Dependiendo de las coincidencias, se dará un premio y la información correspondiente
			if (aNumero.charAt(4) == aRandom.charAt(4) && aNumero.charAt(3) == aRandom.charAt(3)
					&& aNumero.charAt(2) == aRandom.charAt(2) && aNumero.charAt(1) == aRandom.charAt(1)
					&& aNumero.charAt(0) == aRandom.charAt(0)) {
				money += premio[0];
				System.out.println("Enhorabuena, has introducido el número correcto, has ganado " + premio[0] + ". Número ganador: " + aRandom + "\n Balance: " + money + "€");
			} else if (aNumero.charAt(4) == aRandom.charAt(4) && aNumero.charAt(3) == aRandom.charAt(3)
					&& aNumero.charAt(2) == aRandom.charAt(2) && aNumero.charAt(1) == aRandom.charAt(1)) {
				money += premio[1];
				System.out.println("Casi, has hacertado las 4 últimas cifras, has ganado " + premio[1] + ". Número ganador: " + aRandom + "\nBalance: " + money + "€");
			} else if (aNumero.charAt(4) == aRandom.charAt(4) && aNumero.charAt(3) == aRandom.charAt(3)
					&& aNumero.charAt(2) == aRandom.charAt(2)) {
				money += premio[2];
				System.out.println("Cerca, has hacertado las 3 últimas cifras, has ganado " + premio[2] + ". Número ganador: " + aRandom + "\nBalance: " + money + "€");
			} else if (aNumero.charAt(4) == aRandom.charAt(4) && aNumero.charAt(3) == aRandom.charAt(3)) {
				money += premio[3];
				System.out.println("Tocado, has hacertado las 2 últimas cifras, has ganado " + premio[3] + ". Número ganador: " + aRandom + "\nBalance: " + money + "€");
			} else if (aNumero.charAt(0) == aRandom.charAt(0) || aNumero.charAt(4) == aRandom.charAt(4)) {
				money += premio[4];
				if (aNumero.charAt(0) == aRandom.charAt(0)) {
					System.out.println("Rozando, has hacertado la 1 primera cifra, has ganado " + premio[4] + ". Número ganador: " + aRandom + "\nBalance: " + money + "€");
				} else
					System.out.println("Rozando, has hacertado la última cifra. Número ganador: " + aRandom + "\nBalance: " + money + "€");
			} else
				System.out.println("Te falta calle, no has dado ni una. Número ganador: " + aRandom + "\nBalance: " + money + "€");

			if (money > 1.5) {
				System.out.print("¿Jugar otra vez? ");
				jugar = sc.next();
			} else {
				System.out.println("Mala suerte, se ha quedado sin dinero.");
			}

		}

		sc.close();

	}

}

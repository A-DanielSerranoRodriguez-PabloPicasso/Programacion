package examen1_Programacion;

import java.util.Scanner;

public class SerranoRodríguezDaniel_PROG_UD2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int resul = 0, aux = 0;
		int i;
		boolean jugar = true;
		String caracter1, caracter2, simbolo, pregunta;
		char[] car1, car2;

//		Bucle que nos permite continuar calculando hasta que el usuario indique que no quiere continuar
		while (jugar) {

//			Se recogen los datos como string puro
			System.out.println("\n\nVamos a realizar cálculos con números enteros.\n");
			System.out.print("Introduzca el primer número: ");
			caracter1 = sc.next();
			System.out.print("Introduzca el segundo número: ");
			caracter2 = sc.next();

//			Convertimos el string en un array de char
			car1 = caracter1.toCharArray();
			car2 = caracter2.toCharArray();

//			Comprobamos que en todas las posiciones de los char forman un numero entero, obligando a introducir el número de nuevo si se
//			encuentra alguna letra, punto (.) o coma (,)
			for (i = 0; i < car1.length; i++) {
				while (Character.isLetter(car1[i]) || car1[i] == '.'  || car1[i] == ',') {
					System.out.print("Introduzca un primer número válido (ha de ser entero): ");
					caracter1 = sc.next();
					car1 = caracter1.toCharArray();
					i = 0;
				}
			}

			for (i = 0; i < car2.length; i++) {
				while (Character.isLetter(car2[i]) || car2[i] == '.') {
					System.out.print("Introduzca un segundo número válido (ha de ser entero): ");
					caracter2 = sc.next();
					car2 = caracter2.toCharArray();
					i = 0;
				}
			}
			
			num1 = Integer.parseInt(caracter1);
			num2 = Integer.parseInt(caracter2);

			System.out.println("\n+ Suma\t\t\t- Resta\n* Multiplicación\t/ División");
			System.out.print("\nIntroduce el símbolo de la operación que desee realizar: ");
			simbolo = sc.next();
			while (!simbolo.equals("+") && !simbolo.equals("-") && !simbolo.equals("*") && !simbolo.equals("/")) {
				System.out.print("Introduce un símbolo válido: ");
				simbolo = sc.next();
			}
			switch (simbolo) {
			case "+":
				resul = num1 + num2;
				break;

			case "-":
				resul = num1 - num2;
				break;

			case "*":
				if (num1 == 0 || num2 == 0) {
					resul = 0;
				} else if (num2 > 0) {
					for (i = 0; i < num2; i++) {
						resul += num1;
					}
				} else if (num2 < 0) {
					for (i = 0; i > num2; i--) {
						resul -= num1;
					}
				}
				break;

			case "/":
				if (num1 == num2) {
					resul = 1;
				} else if (num2 == 1) {
					resul = num1;
				} else if (num2 > 1 && num1 > 0) {
					while (num1 >= num2) {
						num1 -= num2;
						aux++;
					}
					resul = aux;
				} else if (num2 < 0) {
					num2 = -num2;
					while (num1 >= num2) {
						num1 -= num2;
						aux++;
					}
					resul = -aux;
				} else if (num1 < 0) {
					num1 = -num1;
					while (num1 >= num2) {
						num1 -= num2;
						aux++;
					}
					resul = -aux;
				}
				break;
			}
			if (simbolo.equals("/") && num2 == 0) {
				System.out.println("No se puede dividir entre 0");
			} else
				System.out.println("\nEl resultado de la operación es: " + resul);

			System.out.print("\n¿Desea seguir calculando? (Sí/No): ");
			pregunta = sc.next();

			while (!pregunta.equals("Sí") && !pregunta.equals("sí") && !pregunta.equals("si") && !pregunta.equals("Si")
					&& !pregunta.equals("SÍ") && !pregunta.equals("SI") && !pregunta.equals("sI")
					&& !pregunta.equals("sÍ") && !pregunta.equals("No") && !pregunta.equals("no")
					&& !pregunta.equals("NO") && !pregunta.equals("nO")) {
				System.out.print("\nNo le he entendido bien. ¿Desea seguir calculando? (Sí/No): ");
				pregunta = sc.next();
			}
			if (pregunta.equals("No") || pregunta.equals("no") || pregunta.equals("NO") || pregunta.equals("nO")) {
				System.out.println("Hasta la próxima 😢");
				jugar = false;
			}
		}
		sc.close();
	}
}

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
			System.out.println("\n\nVamos a realizar cÃ¡lculos con nÃºmeros enteros.\n");
			System.out.print("Introduzca el primer nÃºmero: ");
			caracter1 = sc.next();
			System.out.print("Introduzca el segundo nÃºmero: ");
			caracter2 = sc.next();

//			Convertimos el string en un array de char
			car1 = caracter1.toCharArray();
			car2 = caracter2.toCharArray();

//			Comprobamos que en todas las posiciones de los char forman un numero entero, obligando a introducir el nÃºmero de nuevo si se
//			encuentra alguna letra, punto (.) o coma (,)
			for (i = 0; i < car1.length; i++) {
				while (Character.isLetter(car1[i]) || car1[i] == '.' || car1[i] == ',') {
					System.out.print("Introduzca un primer nÃºmero vÃ¡lido (ha de ser entero): ");
					caracter1 = sc.next();
					car1 = caracter1.toCharArray();
					i = 0;
				}
			}

			for (i = 0; i < car2.length; i++) {
				while (Character.isLetter(car2[i]) || car2[i] == '.' || car2[i] == ',') {
					System.out.print("Introduzca un segundo nÃºmero vÃ¡lido (ha de ser entero): ");
					caracter2 = sc.next();
					car2 = caracter2.toCharArray();
					i = 0;
				}
			}

//			Una vez que tenemos los numeros enteros, los metemos en sus variables correspondientes
			num1 = Integer.parseInt(caracter1);
			num2 = Integer.parseInt(caracter2);

			System.out.println("\n+ Suma\t\t\t- Resta\n* MultiplicaciÃ³n\t/ DivisiÃ³n");
			System.out.print("\nIntroduce el sÃ­mbolo de la operaciÃ³n que desee realizar: ");
			simbolo = sc.next();
			while (!simbolo.equals("+") && !simbolo.equals("-") && !simbolo.equals("*") && !simbolo.equals("/")) {
				System.out.print("Introduce un sÃ­mbolo vÃ¡lido: ");
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
//				Comprobamos que los nÃºmeros son distintos de 0. Si lo son, sumamos o restamos con respecto a si el segundo nÃºmero es negativo o positivo
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
//				Comprobamos que los numeros no sean iguales, que el segundo nÃºmero no es 1 o 0. Si es 0, pedimos que vuelva a introducir un nÃºmero nuevo.
//				Si son positivos mayores que 1, hacemos un bucle en el que le restaremos al primer numero el segundo, contando el nÃºmero de veces que 
//				recorremos el bucle. El bucle acaba cuando el primer nÃºmero	es menor que el segundo. Si alguno de los nÃºmeros es negativo, se pasa a 
//				positivo y el contador de veces que se ha recorrido el bucle se pasa a negativo una vez este bucle ha terminado.
				while (num2 == 0) {
					System.out.print("No se puede dividir entre 0, introduce un nÃºmero vÃ¡lido: ");
					caracter2 = sc.next();
					car2 = caracter2.toCharArray();
					for (i = 0; i < car2.length; i++) {
						while (Character.isLetter(car2[i]) || car2[i] == '.' || car2[i] == ',') {
							System.out.print("Introduzca un segundo nÃºmero vÃ¡lido (ha de ser entero): ");
							caracter2 = sc.next();
							car2 = caracter2.toCharArray();
							i = 0;
						}
					}
					num2 = Integer.parseInt(caracter2);
				}
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

			System.out.println("\nEl resultado de la operaciÃ³n es: " + resul);

			System.out.print("\nÂ¿Desea seguir calculando? (SÃ­/No): ");
			pregunta = sc.next();

//			Tras preguntar si se desea seguir jugando, comprobamos que la respuesta introducida es la que deseamos
			while (!pregunta.equals("SÃ­") && !pregunta.equals("sÃ­") && !pregunta.equals("si") && !pregunta.equals("Si")
					&& !pregunta.equals("SÃ�") && !pregunta.equals("SI") && !pregunta.equals("sI")
					&& !pregunta.equals("sÃ�") && !pregunta.equals("No") && !pregunta.equals("no")
					&& !pregunta.equals("NO") && !pregunta.equals("nO")) {
				System.out.print("\nNo le he entendido bien. Â¿Desea seguir calculando? (SÃ­/No): ");
				pregunta = sc.next();
			}
			if (pregunta.equals("No") || pregunta.equals("no") || pregunta.equals("NO") || pregunta.equals("nO")) {
				System.out.println("Hasta la prÃ³xima ðŸ˜¢");
				jugar = false;
			}
		}
		sc.close();
	}
}

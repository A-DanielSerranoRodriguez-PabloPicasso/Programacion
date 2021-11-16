package libro.Tema7.Matrices;
import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dimen = 8, control, posici, cantrol;
		String posicion;
		char[] posi = new char[2];
		String[] mueve;
		char letra = (char) 97;
		String[][] tablero = new String[dimen][dimen];

		for (int i = 0; i < tablero[dimen - 1].length; i++) {
			control = dimen;
			for (int j = 0; j < tablero.length; j++) {
				tablero[j][i] = letra + "" + control;
				control--;
			}
			letra++;
		}

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[dimen - 1].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Vamos a ver los posibles movimientos de un alfil.");
		System.out.print("Elije su posición: ");
		posicion = sc.next();
		posi = posicion.toCharArray();

		System.out.println("El alfil se puede mover a:");

		if (posi[0] == 'a') {//Primera posición
			letra = posi[0];
			control = posi[1] - '0';
			mueve = new String[dimen];
			posici = 0;

			if (control == 8) {//Baja diagonal hacia la derecha
				for (int i = 1; i < tablero.length; i++) {
					mueve[posici++] = tablero[i][i];
					System.out.print(mueve[i] + " ");
				}
			} else if (control < 8 && control > 1) {//Comprueba ambas diagonales hacia la derecha
				for (int i = dimen - control; i > 0; i--) {
					mueve[posici++] = tablero[i-1][posici];
				}
				int lugar = posici; //Iteraciones ya realizadas a quitar
				for (int i = 1; i < tablero.length - lugar; i++) {
					mueve[posici++] = tablero[i + lugar][i];
				}
				for (int i = 0; i < mueve.length-1; i++) {
					System.out.print(mueve[i] + " ");
				}
			} else if (control == 1) {//Suje la diagonal hacia la derecha
				for (int i = tablero.length - 1; i > 0; i--) {
					mueve[posici++] = tablero[i-1][control++];
				}
				for (int i = 0; i < mueve.length-1; i++) {
					System.out.print(mueve[i] + " ");
				}
			}
		} else if (posi[0] == 'h') { //Ultima posición
			letra = posi[0];
			control = posi[1] - '0';
			mueve = new String[dimen];
			posici = 0;
			
			if (control == 8) { //Baja diagonal hacia la izquierda
				for (int i = tablero.length - 1; i > 0; i--) {
					mueve[posici++] = tablero[posici][i-1];
				}
				for (int i = 0; i < mueve.length-1; i++) {
					System.out.print(mueve[i] + " ");
				}
			} else if (control < 8 && control > 1) { //Comprueba ambas diagonales hacia la izquierda
				for (int i = dimen - control; i > 0; i--) {
					mueve[posici++] = tablero[i-1][control--];
				}
				int lugar = posici;
				for (int i = 1; i < tablero.length - lugar; i++) {
					mueve[posici++] = tablero[i + lugar][dimen - i - 1];
				}
				for (int i = 0; i < mueve.length-1; i++) {
					System.out.print(mueve[i] + " ");
				}
			} else if (control == 1) {//Sube diagonal hacia la izquierda
				for (int i = tablero.length - 1; i > 0; i--) {
					mueve[posici++] = tablero[i-1][i-1];
				}
				for (int i = 0; i < mueve.length-1; i++) {
					System.out.print(mueve[i] + " ");
				}
			}
		} else {
			letra = posi[0];
			cantrol =  posi[0] - tablero[0][0].charAt(0);
			control = posi[1] - '0';
			mueve = new String[dimen];
			posici = 0;
			if (control == 8) {
				for (int i = cantrol; i > 0; i--) {//Baja diagonal hacia la izquierda
					mueve[posici++] = tablero[posici][i-1];
				}
				int lugar = posici;
				for (int i = 1; i < tablero.length - lugar; i++) {//Baja diagonal hacia la derecha
					mueve[posici++] = tablero[i][i+lugar];
				}
				for (int i = 0; i < mueve.length-1; i++) {
					System.out.print(mueve[i] + " ");
				}
			} else if (control == 1){
				for (int i = cantrol; i > 0; i--) {//Subiendo hacia la Izquierda
					mueve[posici++] = tablero[dimen-posici-1][i-1];
				}
				int lugar = posici;
				for (int i = 1; i < tablero.length-cantrol ; i++) {//Subiendo hacia la derecha
					mueve[posici++] = tablero[dimen-i-1][i+lugar];
				}
				for (int i = 0; i < mueve.length-1; i++) {
					System.out.print(mueve[i] + " ");
				}
			} else {
				mueve = new String[15];
				posici = 0;
				letra = posi[0];
				control = posi[1] - '0';
				cantrol =  posi[0] - tablero[0][0].charAt(0);

				for (int i = cantrol; i > 0; i--) {//Subiendo hacia la Izquierda
					mueve[posici++] = tablero[i-1][i-1];
				}
				int lugar = posici;
				for (int i = cantrol; i <dimen-1 ; i++) {//Subiendo hacia la derecha
					mueve[posici++] = tablero[cantrol-1][i+1];
				}
				for (int i = 0; i < mueve.length-1; i++) {
					System.out.print(mueve[i] + " ");
				}
			}
		}
	}

}

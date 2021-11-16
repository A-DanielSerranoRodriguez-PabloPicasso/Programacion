package libro.Tema7.Arrays;

public class Ejercicio_4 {

	public static void main(String[] args) {
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		int random;
		
		for (int i = 0; i < numero.length; i++) {
			random = (int) (Math.random() * 100) + 1;
			numero[i] = random;
			cuadrado[i] = (int) Math.pow(numero[i], 2);	
			cubo[i] = (int) Math.pow(numero[i], 3);
		}
		
		System.out.println("Numero\t\tCuadrado\tCubo");
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i] + "\t\t" + cuadrado[i] + "\t\t" + cubo[i]);
		}
		
	}

}

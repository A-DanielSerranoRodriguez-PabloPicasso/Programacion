package libro.Tema7.Arrays;

public class Ejercicio_1y2 {
	public static void main(String[] args) {
		int[] num = new int[11];
		
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		//Si fueran letras, en las posiciones en las que no se introducen valores serían NULL
	}
}

package libro.Tema7.Matrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[][] num = new int[3][6];
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		for (int i = 0; i < num.length; i++) {
			//System.out.print(num[i]);
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
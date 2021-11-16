package libro.Tema7.Matrices;

public class Ejercicio_9 {

	public static void main(String[] args) {
		int[][] m = new int[12][12];
		int fil = m.length, col=m[0].length;
		int[][] aux = new int[col][fil];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 101);
			}
		}

		utils.Matrices.imprimeMatriz(m);

		aux = utils.Matrices.rotarMatrizDerecha(m);
//		for (int i = 0; i < aux.length; i++) {
//			for (int j = 0; j < aux[i].length; j++) {
//				aux[i][j] = m[m.length - 1 - j][i];
//				// Rota la matriz hacia la derecha 1 posición si es cuadrada
//			}
//		}
		System.out.println("\n");
		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux[i].length; j++) {
				System.out.print(aux[i][j] + " ");
				// Rota la matriz hacia la derecha 1 posición si es cuadrada
			}
			System.out.println();
		}

	}

}

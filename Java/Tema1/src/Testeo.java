
public class Testeo {

	public static void main(String[] args) {
//		int fil, col1, col2;
		int[][] m = { {2, 3}, {-9, 0}, {0, 4} };
		int[][] m2 = { {3, -2, 5}, {3, 0, 4} };
		boolean yes=true;
		// if (m2.length==m[0].length)
		int fol=m2[0].length, col=m.length;
		int[][] aux = new int[col][fol];

		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux[0].length; j++) {
				for (int k = 0; k < m[0].length; k++) {
					aux[i][j] += m[i][k] * m2[k][j];
				}
			}
		}
		
		
//		if (m.length > m2.length)
//			fil = m2.length;
//		else
//			fil = m.length;
//
//		if (m[0].length > m2[0].length) {
//			col1 = m[0].length;
//			col2 = m2[0].length;
//		} else {
//			col2 = m[0].length;
//			col1 = m2[0].length;
//		}
//		int[][] array = new int[fil][col2];
//
//		for (int i = 0; i < fil; i++) {
//			for (int j = 0; j < col2; j++) {
//				for (int k = 0; k < col1; k++) {
//					array[i][j] +=m[i][k] * m2[k][j];
//				}
//			}
//		}

		for (int i = 0; i < aux.length; i++) {
			for (int j = 0; j < aux[i].length; j++) {
				System.out.print(aux[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}

	}

}

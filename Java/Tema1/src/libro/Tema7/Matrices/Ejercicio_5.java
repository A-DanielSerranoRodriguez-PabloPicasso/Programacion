package libro.Tema7.Matrices;

public class Ejercicio_5 {

	public static void main(String[] args) {
		int[][] nums = new int[6][10];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int selector;
		int[] posiMin = new int[2], posiMax = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				selector = (int) (Math.random()*10);
				if (selector < 5) {
					nums[i][j] = (int) (Math.random()*1000);
				} else {
					nums[i][j] = (int) (Math.random()*1001);
				}
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] > max) {
					max = nums[i][j];
					posiMax[0] = i+1;
					posiMax[1] = j+1;
				} else if (nums[i][j] < min) {
					min = nums[i][j];
					posiMin[0] = i+1;
					posiMin[1] = j+1;
				}
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("El número mínimo está en la fila " + posiMin[0] + " y la columna " + posiMin[1]);
		System.out.println("El número máximo está en la fila " + posiMax[0] + " y la columna " + posiMax[1]);
		
	}

}

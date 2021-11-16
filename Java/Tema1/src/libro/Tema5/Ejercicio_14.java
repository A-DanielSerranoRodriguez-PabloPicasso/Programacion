package libro.Tema5;

import java.util.Scanner;

public class Ejercicio_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		double[] nums = {0,0};
		double pot;
		
		System.out.println("Vamos a calcular la potencia de un número.");
		
		for (i = 0; i < 2; i++) {
			if (i == 0) {
				System.out.print("Introduce la base: ");
				nums[i] = Double.parseDouble(sc.next());
			} else {
				System.out.print("Introduce el exponente: ");
				nums[i] = Double.parseDouble(sc.next());
			}
				
		}
		
		pot = Math.pow(nums[0], nums[1]);
		
		System.out.println("Esta es la potencia: " + pot);
		
		sc.close();
	}
}

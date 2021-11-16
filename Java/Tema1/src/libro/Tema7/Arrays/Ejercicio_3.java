package libro.Tema7.Arrays;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		System.out.println("Introduce números:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("Num: ");
			num[i] = Integer.parseInt(sc.next());
		}
		
		for (int j = (num.length - 1); j >= 0; j--) {
			System.out.println(num[j]);
		}
		sc.close();
	}
	
}

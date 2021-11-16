package libro.Tema7.Arrays;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[8];
		
		System.out.println("Introduce 8 numeros para averiguar si son pares.");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Num: ");
			nums[i] = Integer.parseInt(sc.next());
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2 == 0) {
				System.out.println(nums[i] + " es par.");
			} else
				System.out.println(nums[i] + " no es par");
		}
		
	}

}

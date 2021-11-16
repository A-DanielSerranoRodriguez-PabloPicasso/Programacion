package pruebas;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Número de como mucho 5 cifras: ");
		num = Integer.parseInt(sc.next());
		
		if (num < 10) {
			System.out.println("Es capicua.");
		} else if (num >= 10 && num < 100) {
			if (num/10 == num%10) {
				System.out.println("Es capicua." + num/10 + num%10);
			} else
				System.out.println("No es capicua." + num/10 + num%10);
		} else if (num >= 100 && num < 1000) {
			if (num/100 == num%10) {
				System.out.println("Es capicua." + num/100 + num%10);
			} else
				System.out.println("No es capicua." + num/100 + num%10);
		} else if (num >= 1000 && num < 10000) {
			if ((num/1000 == num%100) && ((num/100)%10 == (num/10)%10)) {
				System.out.println("Es capicua.");
				System.out.println(num/1000 +""+ num%100 +""+ (num/10));
			} else {
				System.out.println("No es capicua.");
				System.out.println(num/1000 +""+ num%100 +""+ (num/100)%10);
			}
		} else if (num >= 10000 && num < 100000) {
			if ((num/10000 == num%1000) && ((num/1000)%10 == (num/10)%10)) {
				System.out.println("Es capicua.");
				System.out.println(num/1000 +""+ num%100 +""+ (num/10));
			} else {
				System.out.println("No es capicua.");
				System.out.println(num/1000 +""+ num%100 +""+ (num/100)%10);
			}
		} else if (num >= 100000) {
			if((num/100000) == (num%1000) && ((num/1000)%10 == (num/100)%10) && ((num/100)%10 == (num/10)%10)){
				System.out.println("Es capicua");
			}
			System.out.println((num/1000)%10 +""+ (num/100)%10);
		}
	}

}

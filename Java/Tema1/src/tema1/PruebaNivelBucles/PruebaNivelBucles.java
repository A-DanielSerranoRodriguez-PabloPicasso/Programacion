package tema1.PruebaNivelBucles;

import java.util.Scanner;

public class PruebaNivelBucles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, par;
		
		System.out.println("Introduce un número ENTERO POSITIVO MENOR O IGUAL A 100 para realizar un proceso por el cuál terminará saliendo el 1. El proceso se imprimirá por pantalla para demostrar su funcionamiento.");
		while (num <= 0 || num > 100) {
			System.out.print("Número: ");
			num = Integer.parseInt(sc.next());
		}
		
		while (num > 1) {
			
			par = num % 2;
			
			switch (par) {
			
			case 0:{
				System.out.println("Como " + num + " es par, lo dividiremos entre 2: " + num + "/2");
				num /= 2;
				break;
			}
			
			case 1:{
				System.out.println("Como " + num + " es impar, lo multiplicaremos por 3 y le sumaremos 1: " + num + "*3 + 1 ");
				num = (num*3) + 1;
				break;
			}
			}

		}
		
		System.out.println("Como puedes ver, con este proceso hemos acabado en el " + num);
		
		sc.close();
	}

}

package libro.Tema5;

public class Ejercicio_22 {
	public static void main(String[] args) {
		int i, j, modulo;
		int contador = 0, num;
		
		System.out.println("Estos son todos los números primos entre 2 y 100, exceptuando el 100: ");
		
		for (i = 2; i < 100; i++) {
			num = i;
			for (j = 1; j <= num; j++) {
				modulo = num % j;
				if (modulo == 0) {
					contador++;
				}
			}
			if (contador <= 2) {
				System.out.print(num + ", ");
			}
			contador = 0;
		}
		System.out.println("100.");
	}
}

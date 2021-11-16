package libro.Tema5;

public class Ejercicio_3 {
	public static void main(String[] args) {
		int numero = 5, multiplicado = 1, multiplo;
		do {
			multiplo = numero * multiplicado;
			multiplicado += 1;
			System.out.println(multiplo);
		} while (multiplo != 100);
	}
}

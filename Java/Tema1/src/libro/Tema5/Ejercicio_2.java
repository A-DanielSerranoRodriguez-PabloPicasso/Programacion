package libro.Tema5;

public class Ejercicio_2 {
	public static void main(String[] args) {
		int numero = 5, multiplicado = 1, multiplo = 0;
		while (multiplo != 100) {
			multiplo = numero * multiplicado;
			multiplicado += 1;
			System.out.println(multiplo);
		}
	}
}

package libro.Tema5;

public class Ejercicio_6 {
	public static void main(String[] args) {
		int empieza = 320, acaba = 160;
		System.out.println(empieza);
		do {
			empieza -= 20;
			System.out.println(empieza);
		} while (empieza != acaba);
	}
}

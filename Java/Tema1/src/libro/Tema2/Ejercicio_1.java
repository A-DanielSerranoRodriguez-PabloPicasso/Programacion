package libro.Tema2;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int x = 144;
		int y = 999;
		int suma = x + y;
		int resta = x - y;
		double division1 = (double)  (x / y);
		double division2 = (double)  (y / x);
		int multiplicacion = x * y;		
		System.out.printf("x = %d \t y = %d\nSuma = %d\nResta = %d\nDivisión (x / y) = %.2f\nDivisión (y / x) = %.2f\nMultiplicación = %d", x, y, suma, resta, division1, division2, multiplicacion);
	}

}

package libro.Tema5;

import java.util.*;

public class Ejercicio_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = "";
		String digito, stri;
		int i = 1, j = 0;
		List<Integer> li = new ArrayList<>();
		
		System.out.print("Introduce un número entero: ");
		num = sc.next();
		System.out.print("Introduce un dígito para buscar en el número: ");
		digito = sc.next();
		
		char[] arrayNum = num.toCharArray();
		
		for (char ch : arrayNum) {
			stri = String.valueOf(ch);
			if (stri.equals(digito)) {
				li.add(i);
			}
			i = (int) i + 1;
		}
		
		System.out.print("El digito " + digito + " aparece las posiciones ");
		for (j = 0; j < li.size(); j++) {
			System.out.print(li.get(j) + ", ");
		}
		
		sc.close();
	}

}

package libro.Tema7.Arrays;

import java.util.Scanner;

public class Ejercicio_8 {

	static Scanner sc = new Scanner(System.in);
	static String[] meses = {"Enero: ","Febrero: ","Marzo: ","Abril: ","Mayo: ","Junio: ","Julio: ","Agosto: ","Septiembre: ","Octubre: ","Noviembre: ","Diciembre: "};
	static String[] mes = {"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
	static int[] tempMes = new int[12];
	
	public static void main(String[] args) {
		
		System.out.println("Introduce las temperaturas medias de los meses.");
		meses();
		
		imprimir();
		
	}

	public static void meses() {
		for (int i = 0; i < 12; i++) {
			System.out.print(meses[i]);
			tempMes[i] = Integer.parseInt(sc.next());
		}
		
	}
	
	public static void imprimir() {
		for(int i = 0; i < tempMes.length; i++) {
			int max = 0, control = 0;
			for (int j = 0; j < tempMes.length; j++) {
				if (max < tempMes[j]) {
					max = tempMes[j];
					control = max;
				}
			}
			for(int j = max; j >= 0; j--) {
				if(control > tempMes[i]) {
					System.out.print(" ");
					control--;
				} else {
					System.out.print("#");
					control--;
				}
			}
			System.out.println(" " + mes[i]);
		}
	}
}

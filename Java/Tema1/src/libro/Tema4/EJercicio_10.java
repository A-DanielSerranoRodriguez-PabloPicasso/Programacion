package libro.Tema4;

import java.util.Scanner;

public class EJercicio_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes;
		String[] horoscopo = {"Acuario"," Piscis","Aries","Tauro","Géminis","Cáncer","Leo","Virgo","Libra","Escorpio","Sagitario","Capricornio"};
		
		System.out.println("Introduce el día y tu mes de nacimiento.");
		System.out.print("Día: ");
		dia = Integer.parseInt(sc.nextLine());
		System.out.print("Mes: ");
		mes = Integer.parseInt(sc.nextLine());
		System.out.print("Tu horóscopo es: ");
		
		if(dia >= 1 && dia <= 31) {
			switch (mes) {
			
			case 1:{
				if (dia >= 20) {
					System.out.println(horoscopo[0]);
				}else
					System.out.println(horoscopo[11]);
				
				break;
			}
			
			case 2:{
				if (dia >= 19 && dia <= 28) {
					System.out.println(horoscopo[1]);
				}else if(dia > 28) {
					System.out.println("Introduce un día válido.");
				}else
					System.out.println(horoscopo[0]);
				
				
				break;
			}
			
			case 3:{
				if (dia >= 21) {
					System.out.println(horoscopo[2]);
				}else
					System.out.println(horoscopo[1]);
				
				break;
			}
			
			case 4:{
				if (dia >= 21) {
					System.out.println(horoscopo[3]);
				}else
					System.out.println(horoscopo[2]);
				
				break;
			}
			
			case 5:{
				if (dia >= 21) {
					System.out.println(horoscopo[4]);
				}else
					System.out.println(horoscopo[3]);
				
				break;
			}
			
			case 6:{
				if (dia >= 21) {
					System.out.println(horoscopo[5]);
				}else
					System.out.println(horoscopo[4]);
				
				break;
			}
			
			case 7:{
				if (dia >= 21) {
					System.out.println(horoscopo[6]);
				}else
					System.out.println(horoscopo[5]);
				
				break;
			}
			
			case 8:{
				if (dia >= 22) {
					System.out.println(horoscopo[7]);
				}else
					System.out.println(horoscopo[6]);
				
				break;
			}
			
			case 9:{
				if (dia >= 23) {
					System.out.println(horoscopo[8]);
				}else
					System.out.println(horoscopo[7]);
				
				break;
			}
			
			case 10:{
				if (dia >= 23) {
					System.out.println(horoscopo[9]);
				}else
					System.out.println(horoscopo[8]);
				
				break;
			}
			
			case 11:{
				if (dia >= 23) {
					System.out.println(horoscopo[10]);
				}else
					System.out.println(horoscopo[9]);
				
				break;
			}
			
			case 12:{
				if (dia >= 21) {
					System.out.println(horoscopo[11]);
				}else
					System.out.println(horoscopo[10]);
				
				break;
			}
				
			default:
				System.out.println("Introduce un mes válido.");
					
			}
			
		}else
			System.out.println("Introduce un día válido.");
		
		sc.close();
	}
}

package boletin5;
import java.util.Scanner;
public class Ej8 {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		int n1;
		int n2;
		int resultado;
		
		System.out.println("Introduce primer numero: ");
		n1 = scanner.nextInt();
		
		System.out.println("Introduce segundo numero: ");
		n2 = scanner.nextInt();
		
		amigos(n1 , n2);

		
	}
	
	public static void amigos(int primernumero , int segundonumero) {
		
		int i;
		int j;
		int sumadivisor1 = 0;
		int sumadivisor2 = 0;
		
		
		for(i = 1 ; i < primernumero ; i++) {
			
			if(primernumero % i == 0) {
				sumadivisor1 = i + sumadivisor1;
			}
		}
		
		for(j = 1 ; j < segundonumero ; j++) {
			
			
			if(segundonumero % j == 0) {
				sumadivisor2 = j + sumadivisor2;
			}
		}
		
		if((sumadivisor1 == segundonumero) && (sumadivisor2 == primernumero)) {
			System.out.println("Son amigos");
			
		}else {
			System.out.println("No son amigos");
		}
		
		System.out.println("El resultado de la suma de los divisores de " + primernumero + " es: " +sumadivisor1);
		System.out.println("El resultado de la suma de los divisores de " + segundonumero + " es: " +sumadivisor2);
		
		
		
		
		
	}
}

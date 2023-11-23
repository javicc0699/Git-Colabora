package boletin5;
import java.util.Scanner;
public class Ej8sinfuncion {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		int primernumero;
		int segundonumero;
		int i;
		int j;
		int sumadivisor1 = 0;
		int sumadivisor2 = 0;
		
		System.out.println("Introduce primer numero: ");
		primernumero = scanner.nextInt();
		
		System.out.println("Introduce segundo numero: ");
		segundonumero = scanner.nextInt();
		
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
			
		
		
		System.out.println(sumadivisor1);
		System.out.println(sumadivisor2);
		

	}

}

package boletin5;
import java.util.Scanner;
public class Ej8b {

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
	
	public static void amigos(int numero1 , int numero2) {
						
		if((sumadivisor(numero1) == numero2) && (sumadivisor(numero2) == numero1)) {
			System.out.println("Son amigos");
			
		}else {
			System.out.println("No son amigos");
		}
				
	}
	
	public static int sumadivisor(int numero){
		int i;
	
		int sumadivisor = 0;
	
		for(i = 1 ; i < numero ; i++) {
		
			if(numero % i == 0) {
				sumadivisor = i + sumadivisor;
			}
		}
		return sumadivisor;
	}
}
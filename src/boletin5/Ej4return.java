package boletin5;
import java.util.Scanner;
public class Ej4return {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		
		int primernumero;
		int segundonumero;
		int tercernumero;
		
		System.out.println("Introduce el primer numero: ");
		 primernumero = scanner.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		 segundonumero = scanner.nextInt();
		
		System.out.println("Introduce el tercer numero: ");
		 tercernumero = scanner.nextInt();
		 
		System.out.println("El numero mas alto de los tres es: " + (maximo(primernumero , segundonumero , tercernumero)));
		 
		
		System.out.println("El numero mas bajo de los tres es: " + (minimo(primernumero , segundonumero , tercernumero)));
		

	}

	
	
	public static int maximo(int n1 , int n2 , int n3) {
		
		if((n1 >= n2) && (n1 >= n3)) {
			return n1;
			
		}else if((n2 >= n1) && (n2 >= n3)) {
			return n2;
			
		}else {
			return n3;
		}
		
		
		
		
	}
	
	public static int minimo(int n1 , int n2 , int n3) {
		
		if((n1 <= n2) && (n1 <= n3)) {
			return n1;
			
		}else if((n2 <= n1) && (n2 <= n3)) {
			return n2;
		
		}else {
			return n3;
		}
	}
}
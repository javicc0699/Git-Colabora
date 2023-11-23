package boletin5;
import java.util.Scanner;
public class Ej9Iterativo {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		int base;
		int exp;
		int resultado;
		
		System.out.println("Introduce base ");
		base = scanner.nextInt();
		
		System.out.println("Introduce exponente ");
		exp = scanner.nextInt();
		
		resultado = producto(base , exp);

	}

	public static int producto(int b , int e) {
		
		int i;
		int resultado = 1;
		
		for(i = 1 ; i <= e ; i++) {
			
			resultado = b * resultado;
		}
		System.out.println(resultado);
		return resultado;
		
	}
	
}

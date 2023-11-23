package boletin5;
import java.util.Scanner;
public class Ej9recursivo {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		int base;
		int exp;
		int i;
		int resultado;
		
		System.out.println("Introduce la base: ");
		base = scanner.nextInt();
		
		System.out.println("Introduce el exponente");
		exp = scanner.nextInt();
		
		resultado = potencia(base , exp);
		System.out.println("Resultado " + resultado);
	
	}

	public static int potencia(int b , int e) {
		
		int resultado = 1;
		
		if(e == 0) {
		resultado = 1;
			
	
		}else {
			resultado = b * potencia(b , e - 1);
			System.out.println(resultado);
		}
		return resultado;
	}
}









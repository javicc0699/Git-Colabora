package boletin5;
import java.util.Scanner;
public class Ej2 {

	
	public static void mostrarNumeros(int primero , int ultimo) {
		
		int i;
		
		for(i = primero ; i <= ultimo ; i++) {
			
			System.out.println(i);
	
		}
	}
	

	
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		int numeroPrimero;
		int numeroUltimo;
		
		System.out.println("Introduce el primer numero: ");
		numeroPrimero = scanner.nextInt();
		
		System.out.println("Introduce el ultimo numero: ");
		numeroUltimo = scanner.nextInt();
		
		if(numeroPrimero > numeroUltimo) {
			System.out.println("Error");
		
		}else {
		mostrarNumeros(numeroPrimero, numeroUltimo);
		}
		
		scanner.close();

	}

}

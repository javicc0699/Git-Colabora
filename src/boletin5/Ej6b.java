package boletin5;
import java.util.Scanner;
public class Ej6b {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);

		int numeroUsuario;
		
		System.out.println("Introduce el numero: ");
		numeroUsuario = scanner.nextInt();
		
		divisorprimo(numeroUsuario);
	}

	//Incluye el mismo numero introducido
	public static void divisorprimo(int numero) {
		
		int i;
		int contprimo = 0;
		
		
		for(i = 1 ; i <= numero ; i++) {
			if(i % numero == 0 && esprimo(i)) {
				contprimo++;
			}

		}
		System.out.println("contador" + contprimo);
	}
	
	public static boolean esprimo(int numero) {
		
		int j;
		boolean esprimo;
		
		esprimo = true;
		
		for(j = 2 ; j < numero  && esprimo ==true; j++) {
			
			if(numero % j == 0) {
				esprimo = false;
			}
		}
		return esprimo;

	}
			
		
}

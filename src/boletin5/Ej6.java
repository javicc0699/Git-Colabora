package boletin5;
import java.util.Scanner;
public class Ej6 {

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
		int j;
		int contprimo = 0;
		boolean esprimo;
		
		
		for(i = 1 ; i <= numero ; i++) {
			esprimo = true;
			
			for(j = 2 ; j < i  && esprimo ==true; j++) {
				
				if(i % j == 0) {
					esprimo = false;
				}
			}
			
			if(esprimo==true) {
				System.out.println(j);
				contprimo++;
			}
			
		}
		System.out.println("contador" + contprimo);
		}
			
		
	}


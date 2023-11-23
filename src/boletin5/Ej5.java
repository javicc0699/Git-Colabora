package boletin5;
import java.util.Scanner;
public class Ej5 {
	
	
	
	public static boolean letras(char vocal) {
		
		boolean esvocal = false;
		
		if((vocal == 'a') || (vocal == 'e')|| (vocal == 'i') || (vocal == 'o') || (vocal == 'u')) {
			esvocal = true;
			System.out.println("Es vocal");
			return esvocal;
			
		}else {
			esvocal = false;
			System.out.println("No es vocal");
			return esvocal;
		}
		
		
		
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		char letrausuario;
		
		System.out.println("Introduce letra: ");
		letrausuario = scanner.next().charAt(0);
		
		letras(letrausuario);
	}

}

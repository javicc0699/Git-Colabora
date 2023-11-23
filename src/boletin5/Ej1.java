package boletin5;
import java.util.Scanner;
public class Ej1 {

	public static void eco(int nveces) {
		
		int i;
		
		for(i = 1 ; i <= nveces ; i++) {
			
			System.out.println("Eco..." + i);
		}
		
	}

	
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		System.out.println("Introduce numero de veces: ");
		int veces = scanner.nextInt();
		
		eco(veces);
		
		scanner.close();
	}

}

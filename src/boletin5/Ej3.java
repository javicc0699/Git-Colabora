package boletin5;
import java.util.Scanner;
public class Ej3 {

	
	public static void area(double altura , double radio) {
		
		double final pi = 3.14;
		double resultadoArea = 2 * pi * radio * (altura + radio);
		
		System.out.println(resultadoArea);

		
	}
	
	public static void volumen(double altura , double radio) {
		
		double pi = 3.14;
		double resultadoVolumen = pi * radio * 2 * altura;
		
		System.out.println(resultadoVolumen);
	}

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		double alturaUsuario;
		double radioUsuario;
		int seleccionformula;
		
		System.out.println("Introduce altura");
		alturaUsuario = scanner.nextDouble();
		
		System.out.println("Introduce radio");
		radioUsuario = scanner.nextDouble();
		
		System.out.println("Introduce 1 si quiere calcular area y 2 si quieres calcular volumen, otro numero calcula ambos");
		seleccionformula = scanner.nextInt();
		
		if(seleccionformula == 1) {
		
			System.out.println("El area es:");
			area(alturaUsuario , radioUsuario);
			
		}else if(seleccionformula == 2) {
				
			System.out.println("El volumen es: ");
			volumen(alturaUsuario , radioUsuario);
			
		}else {
			System.out.println("El area es: ");
			area(alturaUsuario , radioUsuario);
			System.out.println("El volumen es: ");
			volumen(alturaUsuario , radioUsuario);
		}
		scanner.close();
	}

}

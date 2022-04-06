/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */



package ejercioslibro;
import java.util.Scanner;




public class PrincipaldeMUL {
	
	private static Scanner scanner;  
	  private static Multiplica multiplica;
	
	public static void main(String[] args) {
		
		
		scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese un numero");
        double num2 = scanner.nextDouble();
        multiplica = new Multiplica();
        multiplica.setNum1(num1);
        multiplica.setNum2(num2);
        multiplica.imprimirResultado();
		
		
		
		
	}

}

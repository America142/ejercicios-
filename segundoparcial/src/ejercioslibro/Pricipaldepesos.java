/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */


package ejercioslibro;

import java.util.Scanner;

public class Pricipaldepesos {
	
	private static Scanner scanner;  
	  private static Pesos pesos;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
	    System.out.println("Ingrese los pesos");
	    double pesos = scanner.nextDouble();
	    
	   pesos = new Pesos();
	    pesos.setPesos(pesos);
	    pesos.imprimirDolar();
		
	}

}

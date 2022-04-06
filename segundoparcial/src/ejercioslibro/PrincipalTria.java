/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

import java.util.Scanner;

public class PrincipalTria {

	private static Scanner scanner;
	private static Triangulo triangulo;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("Ingresa la base");
		double base = scanner.nextDouble();
		System.out.println("Ingresa la altura");
		double altura = scanner.nextDouble();
		triangulo = new Triangulo();
		triangulo.setBase(base);
		triangulo.setAltura(altura);
		triangulo.imprimirArea();
	}

}

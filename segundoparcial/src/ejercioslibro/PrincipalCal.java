/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

import java.util.Scanner;

public class PrincipalCal {
	private static Scanner scanner;
	private static Calculadora2 calculadora2;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		double num1 = scanner.nextDouble();
		System.out.println("Ingresa el segundo numero");
		double num2 = scanner.nextDouble();
		calculadora2 = new Calculadora2();
		calculadora2.setNum1(num1);
		calculadora2.setNum2(num2);
		calculadora2.imprimirSuma();
		calculadora2.imprimirResta();
		calculadora2.imprimirMultiplicacion();
		calculadora2.imprimirDivision();

	}

}

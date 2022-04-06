/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

import java.util.Scanner;

public class PrincipalV {
	private static Scanner scanner;
	private static Volumen volumen;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Dame la altura");
		double altura = scanner.nextDouble();
		System.out.println("Dame el radio");
		double radio = scanner.nextDouble();
		volumen = new Volumen(altura, radio);
		volumen.setAltura(altura);
		volumen.setRadio(radio);
		volumen.imprimirResultado();
	}

}

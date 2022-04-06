/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

import java.util.Scanner;

public class PrincipalFac {
	private static Scanner scanner;
	private static Facctura facctura;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		double descuento = scanner.nextDouble();
		System.out.println("Ingresa el segundo numero");
		double impuesto = scanner.nextDouble();
		facctura = new Facctura();
		facctura.setDescuentos(descuento);
		facctura.setImpuesto(impuesto);
		facctura.imprimirTotal();

	}

}

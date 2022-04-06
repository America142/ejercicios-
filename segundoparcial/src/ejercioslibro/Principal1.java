/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

import java.util.Scanner;

public class Principal1 {
	private static Scanner scanner;
	private static Convertidor1 convertidor1;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("Dame el numero de horas trabajadas");
		double mb = scanner.nextDouble();
		convertidor1 = new Convertidor1(mb);
		convertidor1.setMb(mb);
		convertidor1.imprimirKb();
	}

}

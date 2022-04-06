/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

import java.util.Scanner;

public class Principal2 {
	private static Scanner scanner;
	private static Convertidor2 convertidor2;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Dame el numero de horas trabajadas");
		double kb = scanner.nextDouble();
		convertidor2 = new Convertidor2(kb);
		convertidor2.setKb(kb);
		convertidor2.imprimirMb();

	}

}

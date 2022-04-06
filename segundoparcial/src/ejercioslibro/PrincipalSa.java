/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

import java.util.Scanner;

public class PrincipalSa {
	private static Scanner scanner;
	private static Salario salario;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Dame el numero de horas trabajadas");
		double horas = scanner.nextDouble();
		salario = new Salario(horas);
		salario.setHoras(horas);
		salario.imprimirPago();

	}

}

/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

import java.util.Scanner;

public class PrincipaldeDo {

	private static Scanner scanner;
	private static Dolares dolares;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("Ingrese los dolares");
		double dolar = scanner.nextDouble();
		System.out.println("Ingrese el precio en pesos mexicanos");
		double precio = scanner.nextDouble();
		dolares = new Dolares();
		dolares.setDolar(dolar);
		dolares.setPrecio(precio);
		dolares.imprimirPesos();

	}
}

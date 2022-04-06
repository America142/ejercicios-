/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

public class Calculadora2 {
	private double num1;
	private double num2;

	public Calculadora2() {

	}

	public Calculadora2(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getSuma() {
		return this.num1 + this.num2;
	}

	public void imprimirSuma() {
		System.out.println("el area del suma es: " + this.getSuma());
	}

	public double getResta() {
		return this.num1 - this.num2;
	}

	public void imprimirResta() {
		System.out.println("el area del resta es: " + this.getResta());
	}

	public double getMultiplicacion() {
		return this.num1 * this.num2;
	}

	public void imprimirMultiplicacion() {
		System.out.println("el area del multiplicacion es: " + this.getMultiplicacion());
	}

	public double getDivision() {
		return this.num1 / this.num2;
	}

	public void imprimirDivision() {
		System.out.println("el area del division es: " + this.getDivision());
	}

}

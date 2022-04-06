/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

public class Triangulo {
	private double base;
	private double altura;

	public Triangulo() {

	}

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return this.base * this.altura / 2;
	}

	public void imprimirArea() {
		System.out.println("el area del rectangulo es: " + this.getArea());
	}

}

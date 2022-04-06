/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

public class Volumen {

	private double altura;
	private double radio;

	public Volumen(double altura, double radio) {
		this.altura = altura;
		this.radio = radio;

	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getResultado() {
		return 0.333 * 3.1415 * (this.radio * this.radio) * this.altura;
	}

	public void imprimirResultado() {
		System.out.println("su volumen es:" + getResultado());
	}

}

/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */



package ejercioslibro;

public class Multiplica {

	private double num1;
	private double num2;
	
	public Multiplica() {
		
	}
	
	public Multiplica(double num1, double num2) {
		this.num1=num1;
		this.num2=num2;
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
	
	public double getResultado() {
		return this.num1*this.num2;
	}
	public void imprimirResultado() {
		System.out.println("el resultado es: "+this.getResultado());
	}
}

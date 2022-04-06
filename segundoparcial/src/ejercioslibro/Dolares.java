/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */




package ejercioslibro;

public class Dolares {
	 private double dolar;
	 private double precio;
	 
	 public  Dolares() {
		 
	 }
	 
	 public  Dolares(double dolar, double precio) {
		 this.dolar=dolar;
		 this.precio=precio;
				 
	 }

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getPesos() {
		return this.dolar*this.precio;
	}
	
	public void imprimirPesos() {
		System.out.println("el dolar en pesos mexicanos es de: "+this.getPesos());
	}

}

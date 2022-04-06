/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */



package ejercioslibro;

public class Facctura {
	private double descuentos;
	private double impuesto;

public Facctura() {
	
}
	public Facctura(double descuentos, double impuestos) {
		this.descuentos=descuentos;
		this.impuesto=impuestos;
	}
	public double getDescuentos() {
		return descuentos;
	}
	public void setDescuentos(double descuentos) {
		this.descuentos = descuentos;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	
	public double getTotal() {
		return this.descuentos+this.impuesto;
	}
	
	

	public void imprimirTotal() {
		System.out.println("el total de la factura es : "+this.getTotal());
		
	}
	
}

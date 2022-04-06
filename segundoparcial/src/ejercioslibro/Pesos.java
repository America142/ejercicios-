/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */



package ejercioslibro;

public class Pesos {
	 private double pesos;
	
	 
	 public  Pesos() {
		 
	 }
	 
	 public  Pesos( double pesos) {
		 this.pesos=pesos;
		 
				 
	 }
	
   public double getPesos() {
		return pesos;
	}

	public void setPesos(double pesos) {
		this.pesos = pesos;
	}
	
	public double getDolar() {
		return this.pesos*1/19;
	}

	public void imprimirDolar() {
		System.out.println("el valor de los pesos en dolares : "+this.getDolar());
	}

}

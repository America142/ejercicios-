/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */



package ejercioslibro;

public class Salario {
	private double horas;
	
	public Salario(double horas) {
		this.horas = horas;
		
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
    
	public double getPago() {
		return this.horas *7;
	}
	public void imprimirPago(){
		System.out.println("El pago total es:"+getPago()*19+"Dolares");
	}
}

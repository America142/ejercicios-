/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */


package ejercioslibro;

public class Convertidor2 {
private double kb;
	
	public Convertidor2(double kb) {
		this.kb = kb;
		
	}

	public double getKb() {
		return kb;
	}

	public void setKb(double kb) {
		this.kb = kb;
	}
    
	public double getMb() {
		return this.kb/1000;
	}
	public void imprimirMb(){
		System.out.println("los kb converditos a mb :"+getMb());
	}

}

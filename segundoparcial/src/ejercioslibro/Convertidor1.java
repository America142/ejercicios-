/**
 * Autor:America Yaridsaida Villalobos Rodriguez
 * Fecha:5/abril/2022
 * fcha de modificacion:6/abril/2022
 * descrioccion:
 * 
 * */

package ejercioslibro;

public class Convertidor1 {
	private double mb;

	public Convertidor1(double mb) {
		this.mb = mb;

	}

	public double getMb() {
		return mb;
	}

	public void setMb(double mb) {
		this.mb = mb;
	}

	public double getKb() {
		return this.mb * 8000;
	}

	public void imprimirKb() {
		System.out.println("los mb converditos a kb :" + getKb());
	}
}

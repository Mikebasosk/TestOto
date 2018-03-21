package plm.oto.Test;

public class Triangolo {
	
	/**
	 * 	Classe da impostare di Davide
	 */
	
	private double l1, l2, l3;
	
	public double getLato1(){
		return this.l1;
	}
	public double getLato2(){
		return this.l2;
	}
	public double getLato3(){
		return this.l3;
	}
	
	public void setLato1(double l){
		this.l1 = l;
	}
	public void setLato2(double l){
		this.l2 = l;
	}
	public void setLato3(double l){
		this.l3 = l;
	}
	
	public double Perimetro(){
		return this.l1+this.l2+this.l3;
	}
	
	public double Area(){
		double pd2 = this.Perimetro()/2;
		return Math.sqrt(pd2*(pd2-this.l1)*(pd2-this.l2)*(pd2-this.l3));
	}
}

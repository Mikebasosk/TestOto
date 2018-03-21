package plm.oto.Test;

public class Cerchio {
	private double raggio;
	final double  PIGreco = 3.14;

	public Cerchio (){

	}

	public Cerchio (double raggio){
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public String toString() {
		return "Cerchio [raggio=" + raggio + ", PIGreco=" + PIGreco + "]";
	}


}

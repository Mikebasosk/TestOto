package plm.oto.Test;

public class Quadrato {
	private double lato;

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	public Quadrato(double lato) {
		super();
		this.lato = lato;
	}



	public double calcolaArea() {
		return this.lato *this.lato;

	}

	public double getPerimetro() {
		return this.lato*4;
	}

}

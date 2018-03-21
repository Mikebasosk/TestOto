package plm.oto.Test;

public class Quadrato {
	private int lato;
	private int area;
	private int perimetro;

	public int getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}

	public Quadrato(int lato) {
		super();
		this.lato = lato;
	}

	public int getArea() {
		return area;
	}

	public void calcolaArea() {
		this.area= this.lato *this.lato;

	}

	public int getPerimetro() {
		return perimetro;
	}

	public void calcolaPerimetro() {
		this.perimetro = this.lato *4;
	}




}

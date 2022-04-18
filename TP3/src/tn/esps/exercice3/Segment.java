package tn.esps.exercice3;

public class Segment {
	private int extr1;
	private int extr2;

	public Segment(int extr1, int extr2) {
		if (extr1 > extr2) {
			this.extr1 = extr2;
			this.extr2 = extr1;
		} else {
			this.extr1 = extr1;
			this.extr2 = extr2;
		}
	}

	public int longueur() {
		return extr2 - extr1;
	}

	public boolean appartient(int p) {
		return p > extr1 && p < extr2;
	}

	@Override
	public String toString() {
		return "Segment [extr1=" + extr1 + ", extr2=" + extr2 + "]";
	}

}

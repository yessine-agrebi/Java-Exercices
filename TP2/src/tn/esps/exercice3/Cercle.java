package tn.esps.exercice3;

public class Cercle {
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public Cercle agrandir(int x) {
		return new Cercle(rayon + x);
	}

	public double affiche() {
		return rayon;
	}

	public boolean egal(Cercle c) {
		return rayon == c.rayon;
	}
}

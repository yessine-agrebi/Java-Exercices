package tn.esps.exercice1;

public class Rectangle {
	private float largeur;
	private float longueur;

	public Rectangle(float largeur, float longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}

	public float perimetre() {
		return 2 * (largeur + longueur);
	}

	public double diagonale() {
		return Math.sqrt((longueur * longueur) + (largeur * largeur));
	}

	public void doubler() {
		longueur *= 2;
	}

	public float getLargeur() {
		return largeur;
	}

	
	public float getLongueur() {
		return longueur;
	}

	
	
	
}

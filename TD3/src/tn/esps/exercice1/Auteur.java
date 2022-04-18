package tn.esps.exercice1;

public class Auteur {
	private String nom;
	private String prenom;
	public Auteur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Auteur [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}

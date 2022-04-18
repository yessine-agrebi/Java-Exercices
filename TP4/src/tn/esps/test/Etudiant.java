package tn.esps.test;

public abstract class Etudiant {
	protected String nom;
	protected String prenom;
	protected DateNaissance dateNaiss;

	public Etudiant(String nom, String prenom, DateNaissance dateNaiss) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
	}

	abstract boolean memeActivite(String activite);
}

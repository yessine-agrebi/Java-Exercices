package tn.esps.exercice2;

public abstract class ObjetPostal {
	protected String nomDest;
	protected String adressDest;
	protected int codePostal;
	protected String ville;
	protected boolean recommender;

	public ObjetPostal(String nomDest, String adressDest, int codePostal, String ville, boolean recommender) {
		super();
		this.nomDest = nomDest;
		this.adressDest = adressDest;
		this.codePostal = codePostal;
		this.ville = ville;
		this.recommender = recommender;
	}

	public abstract double calculPrix();

	public void affiche() {
		System.out.println("ObjetPostal [nomDest=" + nomDest + ", adressDest=" + adressDest + ", codePostal="
				+ codePostal + ", ville=" + ville + ", recommender=" + (recommender ? "oui" : "non") + "]");
	}

}

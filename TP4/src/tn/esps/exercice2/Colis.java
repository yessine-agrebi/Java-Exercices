package tn.esps.exercice2;

public class Colis extends ObjetPostal {
	private double poids;

	public Colis(String nomDest, String adressDest, int codePostal, String ville, boolean recommender, double poids) {
		super(nomDest, adressDest, codePostal, ville, recommender);
		this.poids = poids;
	}

	@Override
	public double calculPrix() {
		return ((int) ((poids - 1) / 100) + 1) * 5;
	}

	@Override
	public void affiche() {
		super.affiche();
		System.out.println("Poids " + poids);
		System.out.println("Prix = " + calculPrix());
	}

}

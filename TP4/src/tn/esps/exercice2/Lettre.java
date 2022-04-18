package tn.esps.exercice2;

public class Lettre extends ObjetPostal {
	private boolean expedieeUrgent;

	public Lettre(String nomDest, String adressDest, int codePostal, String ville, boolean recommender,
			boolean expedieeUrgent) {
		super(nomDest, adressDest, codePostal, ville, recommender);
		this.expedieeUrgent = expedieeUrgent;
	}

	@Override
	public double calculPrix() {
		double prix = 3;
		if (expedieeUrgent) {
			prix += 1.5;
		}
		if (recommender) {
			prix += 10;
		}
		return prix;
	}

	@Override
	public void affiche() {
		super.affiche();
		System.out.println("expediee en urgence = " + (expedieeUrgent ? "oui" : "non"));
		System.out.println("Prix = " + calculPrix());
	}

}

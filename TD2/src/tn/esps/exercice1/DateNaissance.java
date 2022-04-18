package tn.esps.exercice1;

public class DateNaissance {
	private int jour;
	private int mois;
	private int annee;

	public DateNaissance(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "DateNaissance [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}

	public int getAnnee() {
		return annee;
	}

}

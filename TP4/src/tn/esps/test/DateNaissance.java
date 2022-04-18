package tn.esps.test;

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
	public int getAnnee() {
		return annee;
	}
	@Override
	public String toString() {
		return "DateNaissance [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
	}
	
}

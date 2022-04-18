package tn.esps.test;

public class EtudiantSportif extends Etudiant implements AffichageEtud {
	private String sport;

	public EtudiantSportif(String nom, String prenom, DateNaissance dateNaiss, String sport) {
		super(nom, prenom, dateNaiss);
		this.sport = sport;
	}

	@Override
	public void affichEtudiant() {
		System.out.println("EtudiantSportif [sport=" + sport + ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss
				+ "]");

	}

	@Override
	boolean memeActivite(String activite) {
			return sport.equals(activite);
		
		
	}

	public String getSport() {
		return sport;
	}

		

}

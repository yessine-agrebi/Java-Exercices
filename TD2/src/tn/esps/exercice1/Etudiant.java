package tn.esps.exercice1;

import java.time.LocalDate;

public class Etudiant {
	private String numCarte;
	private String nom;
	private String prenom;
	private DateNaissance dateNaiss;
	private String grp;

	public Etudiant(String numCarte, String nom, String prenom, int jour, int mois, int annee, String grp) {
		this.numCarte = numCarte;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = new DateNaissance(jour, mois, annee);
		this.grp = grp;
	}

	public int age() {
		LocalDate current_date = LocalDate.now();
		int current_Year = current_date.getYear();
		return current_Year - dateNaiss.getAnnee();

	}

	@Override
	public String toString() {
		return "Etudiant [numCarte=" + numCarte + ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss
				+ ", grp=" + grp + "]";
	}

	public String getNumCarte() {
		return numCarte;
	}

	public String getGrp() {
		return grp;
	}

}

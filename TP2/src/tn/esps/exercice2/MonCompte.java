package tn.esps.exercice2;

public class MonCompte {
	private double solde;
	private static int nombreComptes;

	MonCompte(double x) {
		this.solde = x;
		nombreComptes++;
	}

	MonCompte() {
		solde = 0;
		nombreComptes++;
	}

	public double getSolde() {
		return solde;
	}

	public boolean retrait(double montant) {
		if (montant < solde) {
			solde -= montant;
			return true;
		} else {
			return false;
		}
	}

	public void deposer(double montant) {
		solde += montant;
	}

	public void transferer(double montant, MonCompte c) {
		if(montant < solde) {
			c.deposer(montant);
			retrait(montant);
		}else {
			System.out.println("solde insuffisant");
		}
		
	}
}

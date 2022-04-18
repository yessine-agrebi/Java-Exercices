package tn.esps.exercice1;

public class GroupeEtudiants {
	private Etudiant[] listEtudiants;
	private int nbrEtudiant;

	public GroupeEtudiants(int taille) {
		this.listEtudiants = new Etudiant[taille];
		this.nbrEtudiant = 0;
	}

	public void inscrire(Etudiant etudiant) {
		listEtudiants[nbrEtudiant] = etudiant;
		nbrEtudiant++;
	}

	public Etudiant rechercher(String numCarte) {
		for (int i = 0; i < nbrEtudiant; i++) {
			Etudiant e = listEtudiants[i];
			if (e.getNumCarte().equals(numCarte)) {
				return e;
			}
		}
		return null;
	}

	GroupeEtudiants listeEtudiantGroupe(String groupe) {
		GroupeEtudiants newGroup = new GroupeEtudiants(nbrEtudiant);
		for (int i = 0; i < nbrEtudiant; i++) {
			Etudiant e = listEtudiants[i];
			if (e.getGrp().equals(groupe)) {
				newGroup.inscrire(e);
				;
			}
		}
		return newGroup;
	}

	public void affiche() {
		for (int i = 0; i < nbrEtudiant; i++) {
			Etudiant e = listEtudiants[i];
			System.out.println("les etudiants sont " + e.toString());
		}
	}

}

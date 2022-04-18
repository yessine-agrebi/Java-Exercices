package tn.esps.exercice1;

public class Inscription {
	public static void main(String[] args) {
		GroupeEtudiants newGroup = new GroupeEtudiants(10);

		Etudiant e;

		e = new Etudiant("125", "Ali", "Trabelsi", 27, 12, 2003, "gi1s2");

		newGroup.inscrire(e);

		e = new Etudiant("126", "Amine", "Baklouti", 27, 11, 2005, "gi1s3");

		newGroup.inscrire(e);

		e = new Etudiant("127", "Jihen ", "Ben Salah", 20, 12, 2002, "gi1s1");

		newGroup.inscrire(e);

		e = new Etudiant("128", "Zeineb", "Jmal", 27, 12, 2009, "gi1s4");

		newGroup.inscrire(e);

		e = new Etudiant("129", "Mohamed", "Hachicha", 22, 2, 2008, "gi1s2");

		newGroup.inscrire(e);

		newGroup.affiche();

		GroupeEtudiants gr2 = newGroup.listeEtudiantGroupe("gi1s2");

		gr2.affiche();
	}
}

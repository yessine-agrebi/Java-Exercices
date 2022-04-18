package tn.esps.test;

import java.util.ArrayList;
import java.util.List;

public class TestEtudiantSportif {
	public static void main(String[] args) {
		List<EtudiantSportif> listEtudiant = new ArrayList<>();
		listEtudiant.add(new EtudiantSportif("Yessine", "Agrebi", new DateNaissance(8, 9, 1998), "coding"));
		listEtudiant.add(new EtudiantSportif("Aymen", "Khaled", new DateNaissance(5, 4, 2001), "footbal"));
		listEtudiant.forEach(l -> {
			l.affichEtudiant();
		});
		if (listEtudiant.get(0).memeActivite(listEtudiant.get(1).getSport())) {
			System.out.println("Les deux etudiants possedent le meme sport");
		} else {
			System.out.println("Les deux etudiants ne possedent pas le meme sport");
		}

	}
}

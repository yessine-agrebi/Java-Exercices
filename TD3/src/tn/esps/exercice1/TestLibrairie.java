package tn.esps.exercice1;

import java.util.ArrayList;
import java.util.List;

public class TestLibrairie {
	public static void main(String[] args) {
		List<Auteur> listauteurs = new ArrayList<>();
		listauteurs.add(new Auteur("Yessine", "Agrebi"));
		listauteurs.add(new Auteur("Aymen", "Khaled"));
		List<Livre> livres = new ArrayList<>();
		livres.add(new Livre("blaba", listauteurs, "2020", "ag", 500, 30));
		livres.add(new Livre("hahah", listauteurs, "2021", "ag", 300, 40));

		livres.add(new LivreTechnique("Javascript", listauteurs, "2020", "haha", 500, 30, "cd", "informatique"));
		livres.add(new LivreTechnique("PHP", listauteurs, "2020", "haha", 300, 40, "cd", "informatique"));
		livres.forEach(l -> {
			l.vendre(1);
			l.setPrix(20);
			l.acheter(l.getNbreExemplaires());
			System.out.println(l);
		});
	}
}

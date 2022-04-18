package tn.esps.exercice1;

import java.util.List;

public class LivreTechnique extends Livre {
	private String supportAV;
	private String domaine;

	public LivreTechnique(String titre, List<Auteur> auteurs, String anneeEdit, String nomEditeur, int nbreExemplaires,
			int prix, String supportAV, String domaine) {
		super(titre, auteurs, anneeEdit, nomEditeur, nbreExemplaires, prix);
		this.supportAV = supportAV;
		this.domaine = domaine;
	}

	@Override
	public String toString() {
		return "LivreTechnique [supportAV=" + supportAV + ", domaine=" + domaine + ", toString()=" + super.toString()
				+ "]";
	}

}

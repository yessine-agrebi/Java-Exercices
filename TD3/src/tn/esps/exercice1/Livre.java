package tn.esps.exercice1;

import java.util.List;

public class Livre {
	private String titre;
	private List<Auteur> auteurs;
	private String anneeEdit;
	private String nomEditeur;
	private int nbreExemplaires;
	private int prix;

	
	public Livre(String titre, List<Auteur> auteurs, String anneeEdit, String nomEditeur, int nbreExemplaires,
			int prix) {
		super();
		this.titre = titre;
		this.auteurs = auteurs;
		this.anneeEdit = anneeEdit;
		this.nomEditeur = nomEditeur;
		this.nbreExemplaires = nbreExemplaires;
		this.prix = prix;
	}
	

	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteurs=" + auteurs + ", anneeEdit=" + anneeEdit + ", nomEditeur="
				+ nomEditeur + ", nbreExemplaires=" + nbreExemplaires + ", prix=" + prix + "]";
	}


	

	public List<Auteur> getAuteurs() {
		return auteurs;
	}

	public int getNbreExemplaires() {
		return nbreExemplaires;
	}

	public void setNbreExemplaires(int nbreExemplaires) {
		this.nbreExemplaires = nbreExemplaires;
	}
	public void setPrix(int y) {
		this.prix *= (y / 100f) + 1;
	}

	public void vendre(int n) {
		if(nbreExemplaires > n) {
			nbreExemplaires -= n;
		}else {
			System.out.println("Stock insuffisant");
		}
		
	}

	public void acheter(int x) {
		nbreExemplaires += x;
	}

	
}

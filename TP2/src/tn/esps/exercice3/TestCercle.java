package tn.esps.exercice3;

public class TestCercle {
	public static void main(String[] args) {
		Cercle c1 = new Cercle(3.5);
		Cercle c2 = c1.agrandir(2);
		
		System.out.println(c1.affiche());
		System.out.println(c2.affiche());
		
		if (c1.egal(c2)) {
			System.out.println("les deux cercles sont egaux");
		} else {
			System.out.println("les deux cercles sont differents");
		}
	}
}

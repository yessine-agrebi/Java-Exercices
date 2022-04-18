package tn.esps.exercice1;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(15, 20);
		
		System.out.println("le perimetre est " + r.perimetre());
		
		System.out.println("le diagonale est " + r.diagonale());
		
		r.doubler();
		
		System.out.println("le nouveau longueur = " + r.getLongueur());
		
	}
}

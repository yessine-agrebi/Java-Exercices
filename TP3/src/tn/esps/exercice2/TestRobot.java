package tn.esps.exercice2;

public class TestRobot {
	public static void main(String[] args) {
		Robot r = new Robot(2, 2, 1);
		
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getOrientation());
		
		r.tourneraDroite();
		
		r.avancer();
		
		r.afficheRobot();
	}
}

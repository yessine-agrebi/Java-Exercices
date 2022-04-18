package tn.esps.exercice2;

public class CompteMain {
	public static void main(String[] args) {
		MonCompte b1 = new MonCompte(2000);
		MonCompte b2 = new MonCompte();

		System.out.println(b1.getSolde());
		System.out.println(b2.getSolde());

		System.out.println(b1.retrait(500));
		System.out.println(b2.retrait(400));

		b1.deposer(300);
		b2.deposer(300);

		b1.transferer(200, b2);
		b2.transferer(100, b1);

		System.out.println(b1.getSolde());
		System.out.println(b2.getSolde());

	}
}

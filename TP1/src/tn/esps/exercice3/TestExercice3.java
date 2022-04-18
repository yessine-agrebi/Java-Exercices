package tn.esps.exercice3;

public class TestExercice3 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int[] numbers = { 1, 2, -1, 3, -2, 6, -3, 7, -9 };
		int count = 0;
		int grand = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				count++;
			}
			if (numbers[i] > grand) {
				grand = numbers[i];
			}
		}
		System.out.println("dans ce tableau il y a " + count + " elements négatifs");
		System.out.println("Le plus grand élément est : " + grand);
	}
}

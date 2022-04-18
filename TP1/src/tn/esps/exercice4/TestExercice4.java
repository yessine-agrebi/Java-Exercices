package tn.esps.exercice4;

import java.util.Arrays;

public class TestExercice4 {
	public static void main(String[] args) {
		int[] pairs = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int[] impairs = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] tab = new int[20];
		int t1 = pairs.length;
		int t2 = impairs.length;
		for (int i = 0; i < t1; i++) {
			tab[i] = pairs[i];
		}
		;
		for (int i = 0; i < t2; i++) {
			tab[t1 + i] = impairs[i];
		}
		;
		System.out.println(Arrays.toString(tab));
	}
}

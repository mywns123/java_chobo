package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx10 {

	public static void main(String[] args) {
		int[] score = new int[100];

		Random rnd = new Random(1234567);
		for (int i = 0; i < score.length; i++) {
			score[i] = rnd.nextInt(100) + 1;
		} // end of for
		System.out.println(Arrays.toString(score));

		prnArr(score);

		statScore(score);

	}

	public static void statScore(int[] score) {
		int[] stat = new int[11];
		for (int i = 0; i < score.length; i++) {
			stat[score[i] / 10]++;			
		}
		
//		for (int k = 0; k < 11; k++) {
//		System.out.println(stat[k]);
//		}
		

		for (int i = 0; i < stat.length; i++) {
			System.out.printf("%3d 점 :", i * 10);
			for (int s = 0; s < stat[i]; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void prnArr(int[] score) {
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%3d", score[cnt]);
				cnt++;
			}
			System.out.println();
		}

	} // end of main

} // end of class

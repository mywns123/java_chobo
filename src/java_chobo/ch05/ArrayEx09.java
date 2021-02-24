package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lenovo 2차원 배열
 */
public class ArrayEx09 {

	public static void main(String[] args) {
		int[][] score = new int[4][3];

		System.out.println(Arrays.deepToString(score));

		Random rnd = new Random(123456);
		for (int row = 0; row < score.length; row++) {
			for (int col = 0; col < score[row].length; col++) {
				score[row][col] = rnd.nextInt(100) + 1;
			} // end of for
		} // end of for
		System.out.println(Arrays.deepToString(score));

		prnArr(score);

		int sum = sumArr(score);
		System.out.println("배열 값의 합은" + sum);

		점수구하기(score);

	}

	private static void 점수구하기(int[][] score) {
		// 국어 영어 수학 총점 평균
		for (int j = 0; j <= score.length - 1; j++) {
			int sum = 0;
			double avrge = 0;
			for (int i = 0; i <= score[j].length - 1; i++) {
				sum += score[j][i];
				avrge = sum / score[j].length;
			} // end of for
			System.out.println("총점" + sum + "평균" + avrge);
			System.out.println();
		} // end of for

		// 과목별 총점
		for (int j = 0; j <= score[0].length - 1; j++) {
			int sum = 0;
			for (int i = 0; i <= score.length - 1; i++) {
				sum += score[i][j];
			} // end of for
			System.out.println("과목별총점" + sum);
		} // end of for

	}

	private static int sumArr(int[][] score) {
		int sum = 0;
		for (int row = 0; row < score.length; row++) {
			for (int col = 0; col < score[row].length; col++) {
				sum = sum + score[row][col];
			}
		}
		return sum;
	}

	private static void prnArr(int[][] score) {
		for (int[] intArr : score) {
			for (int s : intArr) {
				System.out.print(s + "\t");
			}
			System.out.println();
		}
	}

}

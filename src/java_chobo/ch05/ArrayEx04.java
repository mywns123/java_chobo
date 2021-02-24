package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 배열 요소의 합계와 평균

		// 랜덤클래스 선언
		Random rnd = new Random(123456);

		// size가 5인 정수형 배열
		int[] intArr = new int[5];

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = rnd.nextInt(20) + 1;

		}
		System.out.println(Arrays.toString(intArr));

		// 1.배열에 있는 값들의 합을 구하시오.
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		System.out.printf("합은 %d%n", sum);

		// 2.배열에 있는 갑들의 평균을 구하시오.
		double j = sum / (intArr.length);
		System.out.printf("평균은 %f", j);

	}

}

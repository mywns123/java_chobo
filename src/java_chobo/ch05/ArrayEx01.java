package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
//		arrary_01();

		char[] chArr = { 'a', 'b', 'c', 'd' };
		System.out.println(Arrays.toString(chArr));
		prnChArr(chArr);

	}

	private static void prnChArr(char[] chArr) {
		System.out.println("method-start");
		for (int i = 0; i < chArr.length; i++) {
			System.out.printf("[%c]", chArr[i]);
		}
		System.out.println();
		System.out.println("mathod-start");
	}

	public static void arrary_01() {
		// 배열
		int[] score = new int[5];
		System.out.println("main-start");
		System.out.println(Arrays.toString(score));// [0,0,0,0,0]

		prnArr(score);
		// [0,0,0,0,0]
		// [0,0,0,0,100]
		score[0] = 10;
		System.out.println(Arrays.toString(score));// [10,0,0,0,100]
		prnArr(score);

		System.out.println(Arrays.toString(score));// [10,0,0,0,100]
		System.out.println("main-end");
	}

	private static void prnArr(int[] arr) { // 주소값이 복사되어 arr가능
		System.out.println("prnArr()-start");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();

		arr[4] = 100;
		System.out.println("prnArr()-end");

	}

}

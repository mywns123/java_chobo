package java_chobo.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		factorial(sc);
		decTobin(sc);
		fact(0);
		sc.close();
	}

	private static int fact(int n) {
		// 종료조건이 반드시 존재 - 재귀호출
		if (n == 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}

	}

	private static void decTobin(Scanner sc) {
		System.out.println("십진수를 입력하세요.(0~255까지 입력)");
		int i = sc.nextInt();

		int[] a = new int[8];
		for (int l = 0; l < a.length; l++) {
			a[l] = i % 2;
			i = i / 2;
			if (i == 1) {
				a[l + 1] = i;
				break;
			} // end of if
		} // end of for
		System.out.printf(Arrays.toString(a));

		System.out.println();

		for (int k = a.length - 1; k >= 0; k--) {
			System.out.print(a[k]);
		}
	}

	private static void factorial(Scanner sc) {
		System.out.println("factorial로 구할 수를 입력하세요. >");
		int i = sc.nextInt();
		int k = 1;
		for (int j = i; j >= 1; j--) {
			k = j * k;
		}
		System.out.printf("%d =  %d%n", i, k);
	}

}

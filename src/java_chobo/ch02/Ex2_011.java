package java_chobo.ch02;

import java.util.Scanner;

public class Ex2_011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		add(sc);
		sub(sc);

		sc.close();
	}

	public static void sub(Scanner sc) {
		// Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("num1 - num2 = " + (num1 - num2));
	}

	public static void add(Scanner sc) {
		System.out.print("두개의 정수를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("두 정수의 합은 " + "" + (num1 + num2));
	}

}

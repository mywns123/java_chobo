package java_chobo.ch04;

public class Ex4_11_for_while {

	public static void main(String[] args) {
		exam01();
		exam02();
		exam03();
		exam04();

	}// end of main

	public static void exam04() {
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.printf("%d * %d = %2d  ", i, j, i * j);
			}
			System.out.println();
		}
	}

	public static void exam03() {
		int row = 0;
		while (row < 10) {
			int col = 0;
			while (col < 10) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}

	public static void exam02() {
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void exam01() {
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
	}

}

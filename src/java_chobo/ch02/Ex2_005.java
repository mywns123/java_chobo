package java_chobo.ch02;

public class Ex2_005 {

	public static void main(String[] args) {
		System.out.println(5 + 3);
		System.out.println(5 - 3);
		System.out.println(5 * 3);
		System.out.println(5 / 3);

		int x = 10;
		int y = 5;
		expression(x, y);
		expression(3, 3);

		System.out.println(100_000);
		// String str = ""; // 빈문자열<>null
		// char ch = ' '; // 빈문자는 허용하지 않음.

		System.out.println(7 + "");
		System.out.println(" " + 7);
		System.out.println("7" + 7);
		System.out.println(7 + 10 + "5");

	}

	private static void expression(int x, int y) {
		System.out.println();
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		System.out.printf("%d - %d = %d%n", x, y, x - y);
		System.out.printf("%d * %d = %d%n", x, y, x * y);
		System.out.printf("%d / %d = %d%n", x, y, x / y);
	}

}

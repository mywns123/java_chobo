package java_chobo.ch03;

public class Operator {

	public static void main(String[] args) {
		// 연산자(단항연산자, 이항연산자, 삼항연산자)

		boolean isMale = false;
		System.out.println(!isMale);

		int sum = 10 + 4;
		System.out.println("sum = " + sum);

		int a = 5;
		int b = 3;
		int c = a > b ? 1 : 0;
		System.out.println(c);

		boolean isGreat = a > b ? true : false;
		System.out.println(!isGreat);

		int max = a > b ? a : b;
		System.out.println(max);

	}

}

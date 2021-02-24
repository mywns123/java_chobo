package java_chobo.ch04;

import java.util.Random;

public class Ex4_07_main_enum_random {

	public static void main(String[] args) {

		// enum_switch();

		// 0.0 <=Math.random() < 1.0
		// 0.0 * 3 <=Math.random() < 1.0 * 3
		// 0.0 <=Math.random() < 3.0
		// 0 <=Math.random() < 3
		// 0 + 1 <=Math.random() < 3 + 1
		// 1 <=Math.random() < 4
		// 1~3사이의 정수를 생성
		System.out.println((int) (Math.random() * 3) + 1);

		Random rnd = new Random();
		System.out.println(rnd.nextInt(3) + 1);

		// 임의의 정수 :0~100
		System.out.println(rnd.nextInt(100) + 1);

		int i = rnd.nextInt(2);
		System.out.println(i + 1);

	}

	public static void enum_switch() {
		Ex4_07_title t = Ex4_07_title.CEO;

		switch (t) {
		case CEO:
			System.out.println("사장");
			System.out.println(t.ordinal());
			break;
		case MANAGER:
			System.out.println("매니저");
			break;
		case STAFF:
			System.out.println("직원");
			break;
		case INTERN:
			System.out.println("인턴");
			break;
		}
	}

}

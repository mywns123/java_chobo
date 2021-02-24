package java_chobo.ch03;

import java.util.Scanner;

public class Ex3_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// exam01(sc);
		
		// 점수를 입력받아서 60점 이상이면 "합격" 그렇지 않으면 "불합격"이
		// 출력되도록 작성하시오.
		// exam03(sc);
		
		// 점수를 입력받아서 90점 이상이면 "수" 80점 이상이면"우" 70점 이상이면"미"
		// 60점 이상이면"양" 그외 "가"가 출력되도록 하시오
		// exam04(sc);
		
		//학생 20명을 입력받아서 결과를 출력
		//exam05(sc);

		int jumsu =sc.nextInt();
		if (jumsu >= 60) {
		
		}
		
		
		
		sc.close();
	}

	public static void exam05(Scanner sc) {
		System.out.println("학생수를 입력하세요.");
		int cnt =sc.nextInt();
		for(int i =0; i <cnt; i++) {
			exam04(sc);
		}
	}

	public static void exam04(Scanner sc) {
		System.out.println("점수를 입력하시오");
		int score = sc.nextInt();
		String result = null;
		if (score >= 90) {
			result = "수";
		} else if (score >= 80) {
			result = "우";
		} else if (score >= 70) {
			result = "미";
		} else if (score >= 60) {
			result = "양";
		} else {
			result = "가";
		}
		System.out.println(result);
	}

	public static void exam03(Scanner sc) {
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();

		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(result);
	}

	public static void exam01(Scanner sc) {
		System.out.println("정수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max = (a > b) ? a : b;
		System.out.println(max);

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
	}

}

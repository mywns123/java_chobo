package java_chobo.ch02;

public class Ex2_012_casting {

	public static void main(String[] args) {
		// 1.정수를 문자로 9 -> '9'
		char ch = (char) (9 + '0');
		System.out.println("정수를 문자로 > " + ch);

		// 2.문자열을 정수로 변환
		int num = Integer.parseInt("77");
		System.out.println("문자열을 정수로 > " + num);
		
		//2.1 문자열을 실수로 변환
		double dNum = Double.parseDouble("77.3");
		System.out.println("문자열을 실수로 > " + dNum);
		
		// 3.정수를 문자열로
		String numStr = Integer.toString(99);
		System.out.println("정수를 문자열로 > " + numStr);
		
		//4. 문자열에서 문자를 추출
		String str = "abcd";
		char chstr = str.charAt(2);
		System.out.println(str +" index = 2인 문자 추출 " + chstr);

		
		//5.문자를 문자열로 변경 'a' => "a"
		System.out.println("문자를 문자열로" + ('a' + ""));
		System.out.println("정수를 문자열로" + (9 + ""));
		System.out.println("정수를 문자열로" + Integer.toString(9));
	}

}

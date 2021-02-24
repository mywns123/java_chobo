package java_chobo.ch03;

public class StringCmp_equal {

	public static void main(String[] args) {
		// 문자열 비교 equals()
		String str01 = new String("abc");
		String str02 = new String("abc");

		if (str01 == str02) {         // 값 비교
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		if (str01.equals(str02)) {    // 내용비교
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

		String str03 = "abc";
		String str04 = "abc";
		
		if(str03 == str04) {          //값 비교.주소가 같음
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		if(str01 == "abc") {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}

}

package java_chobo.ch02;

import java.util.Scanner;

//자동 import ctrl+shift+o

public class Ex2_010_scanner {

	public static void main(String[] args) {
		// 키보드로부터 입력을 받는 클래스 Scanner
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 입력하세요. ");
		int num = sc.nextInt();
		System.out.println("num = " + num);
		
		System.out.print("문자를 입력하세요> ");
		String resStr = sc.next(); //"1000"
		int num1 = Integer.parseInt(resStr); // "1000" -> 1000				
		System.out.println("resStr = " + num1);

		sc.close();
		// Ex2_9.varPrint();
	}

}

package java_chobo.ch04;

import java.util.*;

import javax.swing.JOptionPane;

public class Ex4_15_d0_while {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		Random rnd = new Random(1234567); //시드값 - 정해진 수 출력
		answer = rnd.nextInt(100) + 1;
		// Scanner sc = new Scanner(System.in);
		// String res = JOptionPane.showInputDialog(System.in);
		String res = null;

		do {
			//System.out.println("1과 100사이의 정수를 입력하세요.");
			
			res = JOptionPane.showInputDialog("1과 100사이의 정수를 입력하세요.");
			input = Integer.parseInt(res);

			System.out.println("입력값 : " + input + "answer:" + answer);

			if (input > answer) {
				System.out.println("이하");
			}
			if (input < answer) {
				System.out.println("이상");
			}

		} while (input != answer);

		System.out.println(answer);
	}

}

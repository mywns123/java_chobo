package java_chobo.ch05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayEx11 {

	public static void main(String[] args) {
		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "integer", "정수" } };

		exam01(words);
		exam02(words);

	}// end of main

	public static void exam02(String[][] words) {
		String question;
		String response;
		String msg;
		for (int i = 0; i < words.length; i++) {
			question = String.format("Q%d . %s의 뜻은?", i + 1, words[i][0]);
			response = JOptionPane.showInputDialog(question).trim();

			if (response.equals(words[i][1])) {
				msg = "정답입니다.";
			} else {
				msg = String.format("틀렸습니다. 정답은 %s 입니다.", words[i][1]);
			} // end of if
			JOptionPane.showInputDialog(null, msg);
		} // end of for
	}

	public static void exam01(String[][] words) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d . %s의 뜻은?", i + 1, words[i][0]);

			String text = sc.nextLine();

			if (text.equals(words[i][1])) {
				System.out.printf("정답입니다.%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다.%n", words[i][1]);
			} // end of if
		} // end of for
		sc.close();
	}

}// end of class

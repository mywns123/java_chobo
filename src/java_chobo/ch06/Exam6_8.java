package java_chobo.ch06;

class InitTest {
	static int CV = 1; // -1
	int iv = 1; // -3

	static { // -2
		System.out.println("CV " + CV);
		CV = 2;
		System.out.println("CV " + CV);
	}

	{ // -4
		System.out.println("iv " + iv);
		iv = 3;
		System.out.println("iv " + iv);
	}

	public InitTest() { // -5
		CV = 5;
		System.out.println("CV " + CV);
		iv = 4;
		System.out.println("iv " + iv);
	}

}

public class Exam6_8 {

	public static void main(String[] args) {
		new InitTest();

	}

}

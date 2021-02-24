package java_chobo.ch06;

class Variable {
	int iv; // 인스턴스 변수
	static int Cv; // 클래스 변수

	void method() {
		// int lv = 0; // { } 안에 선언한 변수 -> 지역변수
	} // end of method

} // end of class

public class Ex6_5 {

	public static void main(String[] args) {
		Variable.Cv = 10;
		System.out.println("Variable.Cv = " + Variable.Cv);

		Variable v1 = new Variable();
		v1.iv = 5;
		System.out.println("iv " + v1.iv);
		System.out.println("Cv " + Variable.Cv);

		Variable v2 = new Variable();
		v2.iv = 7;
		System.out.println("iv " + v2.iv);
		System.out.println("Cv " + Variable.Cv);

		Variable.Cv = 20;
		System.out.println("Cv " + Variable.Cv);
		System.out.println("Cv " + Variable.Cv);

	} // end of class

}

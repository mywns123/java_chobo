package java_chobo.ch08;

public class Ex8_12 {

	public static void main(String[] args) {
		try {
		//	method1();
			method2();
		} catch (Exception e) {
			System.out.println("main메서드에서  예외가 처리되었습니다.");
		}
	} // main

	private static int method2() throws Exception {
		try {
			System.out.println("method2()이 호출되었습니다.");
			throw new Exception();
		//	return 0;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		//	return 1;
		} finally {
			System.out.println("method2()의 finally블록이 실행되었습니다.");
		}
	} // method2

	private static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e;
		}
	} // method1

}

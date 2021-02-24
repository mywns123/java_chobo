package java_chobo.ch08;

public class ExceptionEx12 {

	public static void main(String[] args) throws Exception {
//		try {
			mthod1();
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
	}

	private static void mthod1() throws Exception {
//		try {
		mthod2();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

	private static void mthod2() throws Exception {
		throw new Exception("예외 발생");
	}

}

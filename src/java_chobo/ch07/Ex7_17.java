package java_chobo.ch07;

public class Ex7_17 {
	Object iv = new Object() {
		void method() {
		}
	}; //익명클래스
	
	static Object cv = new Object() {
		void method() {
		}
	};//익명클래스

	void method() {
		Object lv = new Object() {
			void method() {
			}
		};//익명클래스
	}
}
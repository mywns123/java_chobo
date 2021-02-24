package java_chobo.ch07.poly;

public class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();

		System.out.println("p.x = " + p.x);
		p.method();

		System.out.println("c.x = " + c.x);
		c.method();
	}

}

package java_chobo.ch07.overriding;

public class Child extends Parent {
	int x = 10;

	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);

	}
}

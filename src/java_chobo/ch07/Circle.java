package java_chobo.ch07;

public class Circle extends Shape {
	Point center;
	int r;

	public Circle() {
		this(new Point(0, 0),100);
//		center = new Point(0, 0);
//		r = 100;
	}

	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}

}

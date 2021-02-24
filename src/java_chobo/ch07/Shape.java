package java_chobo.ch07;

public class Shape {
//	String color = "blue";  //명시적 초기화
	String color;

	public Shape() {
		color = "blue"; // 생성자 초기화
	}

	void drow() {
		// 도형을 그린다
	}

	@Override
	public String toString() {
		return String.format("Shape [color=%s]", color);
	}
	
	
	
	
	
}

package java_chobo.ch06.dto;

public class Tv {
	// 속성 선언(멤버 변수)
	public String color; // 색상
	public boolean ispower; // 전원상태
	public int channel; // 채널

	public Tv() {
		super(); // 부모클래스의 생성자를 호출
	}

	// 기능(멤버메서드)
	public void setpower() {
		this.ispower = !ispower;
	}

	public void channelUp() {
		this.channel++;
	}

	public void channelDown() {
		this.channel--;
	}

	@Override // 부모클래스의 명령 재정의
	public String toString() {
		return String.format("Tv [color=%s, ispower=%s, channel=%s]", color, ispower, channel);
	}

}

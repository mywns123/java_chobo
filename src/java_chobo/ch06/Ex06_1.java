package java_chobo.ch06;

import java_chobo.ch06.dto.Tv;

public class Ex06_1 {

	public static void main(String[] args) {
		Tv t1; // 선언
		t1 = new Tv(); // Ex06_1_Tv 인스턴스화
		
		
		System.out.printf("%s %b %d%n", t1.color, t1.ispower, t1.channel);
		System.out.println(t1);
		System.out.println();
		
		
		t1.color = "red";
		t1.ispower = true;
		t1.channel = 11;		
		System.out.printf("%s %b %d%n", t1.color, t1.ispower, t1.channel);
		System.out.println(t1);
		
		t1.setpower();
		t1.channelUp();
		t1.channelUp();
		t1.channelDown();
		System.out.printf("%s %b %d%n", t1.color, t1.ispower, t1.channel);
		System.out.println(t1);
		
		
		Object o1 = new Tv();
		((Tv)o1).color = "blue";
		((Tv)o1).ispower = true;
		((Tv)o1).channel = 15;		
		
		System.out.println(o1);
		
		
	}

}

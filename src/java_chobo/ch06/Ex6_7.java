package java_chobo.ch06;

import java_chobo.ch06.dto.Data;

class SubData extends Data {

	public SubData() {
		super();
		x = 20;
	}

}

public class Ex6_7 {

	public static void main(String[] args) {
		Data d = new Data();
		System.out.println(" x = : " + d.x);
		d.x = 10;
		System.out.println("main() :x = : " + d.x);

		chang(d.x);

		Data d2 = new Data();
		d2.x = 20;
		System.out.println("main() :x = : " + d2.x);
		chang(d2);
		System.out.println("main() :x = : " + d2.x);

		System.out.println();
		Data d3 = new Data();
		d3.x = 40;

		Data d4 = copy(d3);
		System.out.println("main() d4.x = " + d4.x);

		

	}// end of main

	private static Data copy(Data d) {
		Data temp = new Data();
		temp.x = d.x;
		return temp;
	}

	private static void chang(Data d) {
		d.x = 30;
		System.out.println("change() :x = " + d.x);

	}

	private static void chang(int x) {
		x = 1000;
		System.out.println("change() :x = : " + x);

	}

}// end of class

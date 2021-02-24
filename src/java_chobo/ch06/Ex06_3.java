package java_chobo.ch06;

import java.util.Arrays;

import java_chobo.ch06.dto.Tv;

public class Ex06_3 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];

		System.out.println(Arrays.toString(tvArr));

		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		prnArrTv(tvArr);

		tvArr[0].color = "red";
		tvArr[0].ispower = true;
		tvArr[0].channel = 10;
		prnArrTv(tvArr);

		for (Tv t : tvArr) {
			t.channelUp();
		} // end of for
		prnArrTv(tvArr);

	} // end of main

	private static void prnArrTv(Tv[] tvArr) {
		for (Tv t : tvArr) {
			System.out.println(t);
		} // end of for
		System.out.println();
	} // end of prnArrTv

} // end of class

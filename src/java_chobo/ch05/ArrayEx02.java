package java_chobo.ch05;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] intArr = new int[10];

		Random rnd = new Random();
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = rnd.nextInt(45);
		}
		System.out.println(Arrays.toString(intArr));
	}

}

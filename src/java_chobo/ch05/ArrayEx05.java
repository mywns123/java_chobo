package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[] intArr = { 9, 10, 23, 15, 4, 3, 1, 2, 99, 100 };

		int searchKey = 4;
		int find = linearSearch(intArr, searchKey);
		int find2 = binarySearch(intArr, searchKey);

		System.out.printf("선형검색 : intArr에서 %d를 검색한 결과 %d에 위치함%n", searchKey, find);
		System.out.println(Arrays.toString(intArr));
		System.out.printf("이분검색 : intArr에서 %d를 검색한 결과 %d에 위치함", searchKey, find2);
	}

	private static int binarySearch(int[] intArr, int searchKey) {
		for (int i = 0; i < intArr.length - 1; i++) {
			for (int j = 0; j < intArr.length - i - 1; j++) {
				if (intArr[j] > intArr[j + 1]) {
					int temp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = temp;
				} // end of if
			} // end of for

		} // end of for

		int idx = -1;
		int left = 0;
		int right = intArr.length - 1;
		int mid = 0;
		for (; left <= right;) {
			mid = (left + right) / 2;
			if (intArr[mid] == searchKey) {
				idx = mid;
				break;
			} else if (intArr[mid] > searchKey) {
				right = mid - 1;
			} else if (intArr[mid] < searchKey) {
				left = mid + 1;
			} // end of if

		} // end of for
		return idx;
	}

	private static int linearSearch(int[] intArr, int searchKey) {
		int idx = -1;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] == searchKey) {
				idx = i;
			}
		}
		return idx;
	}

}

package jp.myapp.javadevelopment;

import java.util.Arrays;

public class arrayIndex {

	public static void main(String[] args) {

		String[] mouth = {"January","Febrary","March","Aplil","May","June","July","August","September","Octorber","Noverber","December"};

		for (int i = 0;i < 12;i++) {
			System.out.println(mouth[i]);
		}

		int[] shortArray = new int[5];
		for (int x = 0;x < shortArray.length; x++) {
			shortArray[x] = x + 1;
			System.out.println(shortArray[x]);
		}
		System.out.println(Arrays.toString(shortArray));
	}
}

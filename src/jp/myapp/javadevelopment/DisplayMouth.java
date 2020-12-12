package jp.myapp.javadevelopment;

import java.util.Scanner;

public class DisplayMouth {

	public static void main(String[] args) {
		int mouth;

		Scanner pushOn = new Scanner(System.in);
		System.out.println("pushOn!");
		mouth = pushOn.nextInt();

		switch (mouth) {
		case 1:
			System.out.println("first");
			break;

		case 12:
			System.out.println("End...");
			break;

		default:
			System.out.println("わかんないっすね～");
		}
	}

}
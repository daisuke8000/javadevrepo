package jp.myapp.javadevelopment;

import java.util.Scanner;
public class BmiCalc {

/* BMIを計算するプログラム
 * BMI =  体重  /  ( 身長 * 身長 )
 * 体重 kg 、身長 m
 */

	public static void main(String[] args) {
		double weight, height,bmi;

		//weight = 73;
		//height = 165;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("your weight?");
		weight = stdIn.nextDouble();
		System.out.println("your height?");
		height = stdIn.nextDouble();

		height /= 100;

		bmi = weight / (height * height);
		System.out.println(bmi);

		if (bmi < 18.5) {
			System.out.println("痩せ型です");
		} else if (bmi < 25) {
			System.out.println("普通です");
		} else if (bmi > 25) {
			System.out.println("肥満です");
		}
	}

}

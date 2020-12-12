package jp.myapp.javadevelopment;

import java.util.Scanner;
public class BmiCalc2 {

/* BMIを計算するプログラム
 * BMI =  体重  /  ( 身長 * 身長 )
 * 体重 kg 、身長 m
 */

	public static void main(String[] args) {
		double weight, height,bmi;

		//weight = 73;
		//height = 165;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("`体重は？（Kg）：");
		weight = stdIn.nextDouble();
		System.out.println("`身長は？（cm）：");
		height = stdIn.nextDouble();

		height /= 100;

		bmi = weight / (height * height);
		System.out.println("BMI : "+bmi);

	}

}

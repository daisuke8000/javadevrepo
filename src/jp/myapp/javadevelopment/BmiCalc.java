package jp.myapp.javadevelopment;

public class BmiCalc {

/* BMIを計算するプログラム
 * BMI =  体重  /  ( 身長 * 身長 )
 * 体重 kg 、身長 m
 */

	public static void main(String[] args) {
		double weight, height,bmi;

		weight = 73;
		height = 165;
		
		height /= 100;
		
		bmi = weight / (height * height);
		System.out.println(bmi);

	}

}

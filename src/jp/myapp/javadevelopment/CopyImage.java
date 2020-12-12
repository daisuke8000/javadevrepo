package jp.myapp.javadevelopment;

public class CopyImage {

	public static void main(String[] args) {
		int height, wide;
		height = 100;
		wide = 100;


		String target = getpath();
		int ans1 = calc(height, wide);
		System.out.println(target + ans1 + "");
	}

	public static int calc(int height, int wide) {
		int ans1 = height + wide;
		return ans1;

	}

	public static String getpath() {
		return "Serch now...";
	}

}

package jp.myapp.javadevelopment;

public class CommonMultiple {

//	public static void main(String[] args) {
//		int i = 1;
//		while (i < 100) {
//			if ((i % 2 == 0) && (i % 3 == 0)) {
//				System.out.println(i);
//			}
//			else {
//				System.out.println(">>>>>>>>>>>>");
//			}
//			i++;
//		}
//
//	}


	public static void main(String[] args) {
		int i = 1;
		while (i < 20) {
			if (!((i % 2 == 0) && (i % 3 == 0))) {
				System.out.println(i);
			}
			i++;
		}

	}

}

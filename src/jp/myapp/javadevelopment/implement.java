package jp.myapp.javadevelopment;

interface Control{
	String NAME = "Master";
	int AGE = 100;

	void met1();
	void met2();
}


class Add implements Control{
	public void met1() {
		System.out.println(NAME + "が現れた！");
	}
	public void met2() {
		System.out.println(AGE - 30 + "歳になりました!");
	}
}


public class implement {

	public static void main(String[] args) {
		Add add = new Add();
		add.met1();
		add.met2();
	}

}

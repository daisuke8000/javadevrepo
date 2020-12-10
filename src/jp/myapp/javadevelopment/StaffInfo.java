package jp.myapp.javadevelopment;

class Staff {
	String name;
	int staffid;
	String email;

	public void sayhello() {
		System.out.println("Hello! " + this.name);
	}
}

public class StaffInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff sasaki = new Staff();
		sasaki.name = "Daisuke Sasaki";
		sasaki.staffid = 10;
		sasaki.email = "hoge@ponkotsu.com";
		sasaki.sayhello();
	}

}

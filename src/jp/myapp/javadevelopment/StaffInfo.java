package jp.myapp.javadevelopment;

class Staff {
	String name;
	int staffid;
	String email;

	public void sayhello() {
		System.out.println("Hello! " + this.name);
	}

	public Staff(String name,int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class RemoteStaff extends Staff{
	public String location;
	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid,email);
	}
}

public class StaffInfo {

	public static void main(String[] args) {

		// スタッフ　インスタンス
		Staff sasaki = new Staff("DaisukeSasaki",1,"hoge@emai.com");
		//sasaki.sayhello();
		System.out.println("<<< 社員情報 >>>");
		System.out.println("氏名　：　" + sasaki.getName());
		System.out.println("社員番号　：　" + sasaki.getStaffid());
		System.out.println("Email　：　" + sasaki.getEmail());

		// RemoteStaff　インスタンス
		RemoteStaff hashibira = new RemoteStaff("inosuke",2,"chototsumoushinn@email.com");
		hashibira.location = "tokyo";
		System.out.println("<<< 社員情報 >>>");
		System.out.println("氏名　：　" + hashibira.getName());
		System.out.println("社員番号　：　" + hashibira.getStaffid());
		System.out.println("Email　：　" + hashibira.getEmail());
		System.out.println("勤務地　：　" + hashibira.location);

	}

}

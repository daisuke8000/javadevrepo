package jp.myapp.javadevelopment;

class Computer {
	public String os;
	public int memory;
	public int storage;
}

public class ComputerInfo {

	public static void main(String[] args) {
		//instance
		Computer desktop = new Computer();
		desktop.os = "Windows10";
		desktop.memory = 8;
		desktop.storage = 512;

		//output
		System.out.println("OS: " + desktop.os);
		System.out.println("Memory: " + desktop.memory + "GB");
		System.out.println("Storage: " + desktop.storage + "GB");

		Computer desktop2 = desktop;
		desktop2.os = "ubuntu";

		System.out.println("\nOS: " + desktop2.os);
		System.out.println("Memory: " + desktop2.memory + "GB");
		System.out.println("Storage: " + desktop2.storage + "GB");

		System.out.println("\nOS: " + desktop.os);
		System.out.println("Memory: " + desktop.memory + "GB");
		System.out.println("Storage: " + desktop.storage + "GB");
	}

}

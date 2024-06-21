package myPack;

public class ImportPackage {
	String msg;
	int no;
	public ImportPackage() {
		System.out.println("Default Constructor!");
		msg = "Hello World";
		no = 1;
	}

	public ImportPackage(String msg,int no) {
		System.out.println("Parameterised Constructor!");
		this.msg = msg;
		this.no = no;
	}
	public void show() {
		System.out.println("Inside show!");
		System.out.println("msg = " + msg);
		System.out.println("no = " + no);
	}
}
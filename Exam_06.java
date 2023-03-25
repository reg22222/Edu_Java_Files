import test.*;

class A06{
	private int a;
	A06() {
		a = 10;
	}
	void disp() {
		System.out.println("a = " + a);
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		//A06 ap = new A06();
		//ap.disp();
		//ap.a = 100;
		//ap.disp();
		Test01 t1 = new Test01();
		t1.disp();
		//A06 ap = new A06(1);
	}
}

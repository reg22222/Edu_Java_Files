
class A07{
	int a;
	int b;
	public A07(int t) {
		a = 10;
		b = 20;
	}
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
class B07 extends A07{
	int c;
	int b;
	public B07() {
		super(10);
		c = 30;
		b = 100;
	}
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + this.b);
		System.out.println("c = " + c);
	}
}
public class Exam_07 {	
	public static void main(String[] args) throws Exception {
		B07 ap = new B07();
		ap.disp();
	}

}

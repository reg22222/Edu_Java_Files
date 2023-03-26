class A06{
	protected int a = 10;
}
class B06 extends A06{
	int b = 20;
	//A06 ap = new A06();
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
class C06 extends B06{
	int c = 30;
	//B06 bp = new B06();
	public void disp2() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
public class Exam_06 {

}

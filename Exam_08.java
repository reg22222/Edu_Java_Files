class A08{
	final int a;
	private static int b;
	static {
		//객체생성과 상관없이 프로그램내에서 한번 실행되는 구문
		System.out.println("static구문 사용!!");
	}
	{
		//객체생성시 생성자보다 먼저 불려가서 실행되는 구문
		System.out.println("일반구문 사용!!");
		//a = 100;
	}
	public A08() {
		a = 100;
		System.out.println("default생성자 사용!!");
	}
	public A08(int a, int b) {
		this.a = a;
		System.out.println("A08(int a, int b)생성자 사용!!");
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		A08 ap = new A08();
		A08 bp = new A08(10, 20);
		
		//ap.a = 100;
		
	}
}















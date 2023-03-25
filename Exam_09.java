//import java.lang.*; - jvm이 제일먼저 자동으로 호출하는 패키지
class A09{
	int a = 10;
	public void disp() {
		System.out.println("a = " + a);
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		for(int i=0; i<args.length; ++i) {
			System.out.println(args[i]);
		}
		/*
		//Math.PI = 111;	//final필드라서 못 고친다
		System.out.println("반지름 5인 원의 넓이 : " + 5*5*Math.PI);
		//static멤버라서 클래스이름으로 접근한다
		//접근제한자가 public이라서 어디서든 접근이 가능(import만 되어 있으면)
		//상수선언 : public static final 또는 public final static
		star();
		A09 ap = new A09();
		ap.disp();
		*/
	}
	
	public static void star() {
		System.out.println("*****");
	}
}

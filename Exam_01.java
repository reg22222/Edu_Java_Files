class A01{
	//멤버필드
	int a;
	int b;
	int c, d, e, f, g;
	
	//생성자
	A01(){
		a = 10;
		b = 20;
		c = 30;
		d = 40;
		e = 50;
		f = 60;
		g = 70;		
	}
	A01(int a){
		this();	//A01()생성자를 호출, 반드시 생성자 첫째줄에 나타나야 한다
		this.a = a;//this : 클래스내의 멤버를 지칭할때 쓰는 예약어
	}
	A01(int a, int b){
		this(a);
		//this.a = a;	
		this.b = b;
	}
	
	//멤버메소드
	void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//클래스 멤버와 매개변수간에 충돌이 나지 않는다면 this를 생략해서 사용할 수 있다
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		int a = 10;//자료형  변수명;
		int[] arr = new int[3];//자료형 배열명[] = new 자료형[갯수];
		//arr[0], arr[1], arr[2]
		A01 ap = new A01(10, 20);//자료형 객체명 = new 생성자호출;
		
		//. : 참조연산자, 객체멤버에 접근하려는 연산자
		ap.disp();	//메소드호출		
		
		ap.a = 100;
		ap.b = 200;
		//ap.A(100);	생성자를 직접 호출 안된다
		ap.disp();
		//System.out.println("ap.a = " + ap.a);
		//System.out.println("ap.b = " + ap.b);
	}
}















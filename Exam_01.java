class Outer01{
	//멤버필드
	private int a;
	private static int b;
	
	//static멤버 초기화
	static {
		b = 20;
	}
	
	//생성자
	public Outer01() {
		a = 10;
	}
	
	//멤버메소드
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//System.out.println("c = " + c);
		//바깥클래스에서는 내부 클래스의 멤버에 접근하지 못한다
	}
	
	//중첩클래스, Inner클래스
	class Inner01{
		private int c;
		public Inner01() {
			c = 30;
		}
		public void disp_in() {
			//내부클래스에서는 밖의 클래스 멤버에 마음껏 접근 가능
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
		}
		class Inner01_Inner{}
	}
}
public class Exam_01 {
	public static void main(String[] args) {
		Outer01 ot = new Outer01();
		
		Outer01.Inner01 oi = ot.new Inner01();//일반중첩클래스 객체만들기
		oi.disp_in();
		
	}
}















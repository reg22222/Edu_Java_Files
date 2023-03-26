class Outer02{
	private int a;
	private static int b;
	static {
		b = 20;
	}
	public Outer02() {
		a = 10;
	}
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	static class Inner02{
		private int c;
		public Inner02() {
			c = 30;
		}
		public void disp_in() {
			//System.out.println("a = " + a);
			//static중첩클래스는 바깥 클래스의 멤버 중 static 멤버만 사용 가능
			System.out.println("b = " + b);
			System.out.println("c = " + c);
		}
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Outer02 ot = new Outer02();
		Outer02.Inner02 oi = new Outer02.Inner02();
	}
}











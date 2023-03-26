class Outer04{
	public void aaa() {
		System.out.println("aaa메소드 실행중......");
	}
	public void bbb() {
		System.out.println("ddd메소드 실행중......");
	}
	public void ccc() {
		System.out.println("ccc메소드 실행중......");
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		Outer04 ot = new Outer04() {
			public void bbb() {
				System.out.println("bbb메소드 실행중......");
			}
		};
		ot.aaa();
		ot.bbb();
		ot.ccc();
	}
}

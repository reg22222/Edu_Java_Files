class Outer04{
	public void aaa() {
		System.out.println("aaa�޼ҵ� ������......");
	}
	public void bbb() {
		System.out.println("ddd�޼ҵ� ������......");
	}
	public void ccc() {
		System.out.println("ccc�޼ҵ� ������......");
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		Outer04 ot = new Outer04() {
			public void bbb() {
				System.out.println("bbb�޼ҵ� ������......");
			}
		};
		ot.aaa();
		ot.bbb();
		ot.ccc();
	}
}

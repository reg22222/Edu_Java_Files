class A08{
	final int a;
	private static int b;
	static {
		//��ü������ ������� ���α׷������� �ѹ� ����Ǵ� ����
		System.out.println("static���� ���!!");
	}
	{
		//��ü������ �����ں��� ���� �ҷ����� ����Ǵ� ����
		System.out.println("�Ϲݱ��� ���!!");
		//a = 100;
	}
	public A08() {
		a = 100;
		System.out.println("default������ ���!!");
	}
	public A08(int a, int b) {
		this.a = a;
		System.out.println("A08(int a, int b)������ ���!!");
	}
}
public class Exam_08 {
	public static void main(String[] args) {
		A08 ap = new A08();
		A08 bp = new A08(10, 20);
		
		//ap.a = 100;
		
	}
}















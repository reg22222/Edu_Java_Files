class Outer01{
	//����ʵ�
	private int a;
	private static int b;
	
	//static��� �ʱ�ȭ
	static {
		b = 20;
	}
	
	//������
	public Outer01() {
		a = 10;
	}
	
	//����޼ҵ�
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//System.out.println("c = " + c);
		//�ٱ�Ŭ���������� ���� Ŭ������ ����� �������� ���Ѵ�
	}
	
	//��øŬ����, InnerŬ����
	class Inner01{
		private int c;
		public Inner01() {
			c = 30;
		}
		public void disp_in() {
			//����Ŭ���������� ���� Ŭ���� ����� ������ ���� ����
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
		
		Outer01.Inner01 oi = ot.new Inner01();//�Ϲ���øŬ���� ��ü�����
		oi.disp_in();
		
	}
}















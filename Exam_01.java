class A01{
	//����ʵ�
	int a;
	int b;
	int c, d, e, f, g;
	
	//������
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
		this();	//A01()�����ڸ� ȣ��, �ݵ�� ������ ù°�ٿ� ��Ÿ���� �Ѵ�
		this.a = a;//this : Ŭ�������� ����� ��Ī�Ҷ� ���� �����
	}
	A01(int a, int b){
		this(a);
		//this.a = a;	
		this.b = b;
	}
	
	//����޼ҵ�
	void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//Ŭ���� ����� �Ű��������� �浹�� ���� �ʴ´ٸ� this�� �����ؼ� ����� �� �ִ�
	}
}

public class Exam_01 {
	public static void main(String[] args) {
		int a = 10;//�ڷ���  ������;
		int[] arr = new int[3];//�ڷ��� �迭��[] = new �ڷ���[����];
		//arr[0], arr[1], arr[2]
		A01 ap = new A01(10, 20);//�ڷ��� ��ü�� = new ������ȣ��;
		
		//. : ����������, ��ü����� �����Ϸ��� ������
		ap.disp();	//�޼ҵ�ȣ��		
		
		ap.a = 100;
		ap.b = 200;
		//ap.A(100);	�����ڸ� ���� ȣ�� �ȵȴ�
		ap.disp();
		//System.out.println("ap.a = " + ap.a);
		//System.out.println("ap.b = " + ap.b);
	}
}















//import java.lang.*; - jvm�� ���ϸ��� �ڵ����� ȣ���ϴ� ��Ű��
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
		//Math.PI = 111;	//final�ʵ�� �� ��ģ��
		System.out.println("������ 5�� ���� ���� : " + 5*5*Math.PI);
		//static����� Ŭ�����̸����� �����Ѵ�
		//���������ڰ� public�̶� ��𼭵� ������ ����(import�� �Ǿ� ������)
		//������� : public static final �Ǵ� public final static
		star();
		A09 ap = new A09();
		ap.disp();
		*/
	}
	
	public static void star() {
		System.out.println("*****");
	}
}

class Point2d{
	int x;
	int y;
	public Point2d() {
		x = 100;
		y = 125;
	}
	public void disp() {
		System.out.println("��ǥ : [" + x + " , " + y + "]");
	}
}
class Point3d extends Point2d{
	int z;
	public Point3d() {
		z = 150;
	}
	public void disp() {
		System.out.println("��ǥ : [" + x + " , " + y + " , " + z +"]");
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		Point2d p2 = new Point3d();//��ĳ����
		Point3d p3 = (Point3d)p2;
		p2.disp();
		/*
		//�θ��� �����ڷ� �ڽ��� ��ü�� ����� ���� �Ұ���!!
		//�ٿ�ĳ���� : ��������ȯ
		//��ĳ���õ� �θ�ü�� �ڽ��� ��ü�� ���� �� �ִ�
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		//��ĳ���� �� �θ��� ��ü�� �ڽ��� ������ ���� �ʴ� ����ʵ�� �������� ���Ѵ�
		//System.out.println("p2.z = " + p2.z);
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
		/*
		Point3d p3 = new Point3d();
		Point2d p2 = p3;	
		//�ڽ��� �����ڷ� �θ��� ��ü�� ���� �� �ִ�
		//��ĳ���� : �ڵ�����ȯ
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		//��ĳ���� �� �θ��� ��ü�� �ڽ��� ������ ���� �ʴ� ����ʵ�� �������� ���Ѵ�
		//System.out.println("p2.z = " + p2.z);
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
		
		/*
		Point2d ap = new Point2d();
		Point2d bp = ap;	//���� Ŭ�����̹Ƿ� ���Կ����� �����ϴ�
		//ap.x�� bp.x�� ������ ���� �ִ� ������	
		ap.x = 1000;
		//ap.y�� bp.y�� ������ ���� �ִ� ������
		bp.y = 2000;
		ap.disp();
		bp.disp();
		*/
	}
}

















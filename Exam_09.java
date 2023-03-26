class Point2d{
	int x;
	int y;
	public Point2d() {
		x = 100;
		y = 125;
	}
	public void disp() {
		System.out.println("좌표 : [" + x + " , " + y + "]");
	}
}
class Point3d extends Point2d{
	int z;
	public Point3d() {
		z = 150;
	}
	public void disp() {
		System.out.println("좌표 : [" + x + " , " + y + " , " + z +"]");
	}
}
public class Exam_09 {
	public static void main(String[] args) {
		Point2d p2 = new Point3d();//업캐스팅
		Point3d p3 = (Point3d)p2;
		p2.disp();
		/*
		//부모의 생성자로 자식의 객체를 만드는 것은 불가능!!
		//다운캐스팅 : 강제형변환
		//업캐스팅된 부모객체를 자식의 객체로 만들 수 있다
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		//업캐스팅 된 부모의 객체라도 자신이 가지고 있지 않는 멤버필드는 접근하지 못한다
		//System.out.println("p2.z = " + p2.z);
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
		/*
		Point3d p3 = new Point3d();
		Point2d p2 = p3;	
		//자식의 생성자로 부모의 객체를 만들 수 있다
		//업캐스팅 : 자동형변환
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		//업캐스팅 된 부모의 객체라도 자신이 가지고 있지 않는 멤버필드는 접근하지 못한다
		//System.out.println("p2.z = " + p2.z);
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
		
		/*
		Point2d ap = new Point2d();
		Point2d bp = ap;	//같은 클래스이므로 대입연산이 가능하다
		//ap.x와 bp.x는 동일한 곳에 있는 변수다	
		ap.x = 1000;
		//ap.y와 bp.y는 동일한 곳에 있는 변수다
		bp.y = 2000;
		ap.disp();
		bp.disp();
		*/
	}
}

















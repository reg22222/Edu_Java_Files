interface A11{
	public static final int A = 1;
	public static int B = 2;
	public final int C = 3;
	public int D = 4;
	int E = 5;
	//private int F = 6;
	public abstract void disp();
	public void disp2();// {System.out.println("aaa");}
	void disp3();
	//private void disp4();
	class Inner11{}
}
public class Exam_11 {
	public static void main(String[] args) {
		System.out.println("A11.A = "+ A11.A);
		//A11.A = 100; 
		//A11.B = 100;
		System.out.println("A11.C = " + A11.C);
		
		A11.Inner11 ai = new A11.Inner11();
	}
}

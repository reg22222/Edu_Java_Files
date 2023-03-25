class Bank{
	private String name;
	private double money;
	static float iyul;
	//�Ϲ� ������� ��ü ������ �޸𸮿� �ö�����, static����� 
	//���α׷� ���۽� �޸𸮿� �ö󰣴�.
	static {	//static����� �ʱⰪ�� ���� �ο��ؼ� ����� �� �ִ�.
		Bank.iyul = 0.04f;	
	}
	
	public Bank(String name, double money, float iyul) {
		this.name = name;
		this.money = money;
		Bank.iyul = iyul;
	}
	
	public void setIyul(float iyul) {
		Bank.iyul = iyul;
	}
	
	public void disp() {
		System.out.println(name+"���� ���� �ܾ��� " 
				+ money+"���̰�, ����Ǵ� ������ " + Bank.iyul*100+"% �Դϴ�.");
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		System.out.println("���� ���� ���� ������ " + (Bank.iyul*100) +"% �Դϴ�.");
		/*
		Bank aaa = new Bank("aaa", 1000.0, 0.05f);
		aaa.disp();
		System.out.println("============================");
		Bank bbb = new Bank("bbb", 1000.0, 0.03f);
		//aaa.setIyul(0.03f);
		aaa.disp();
		bbb.disp();
		System.out.println("============================");
		Bank ccc = new Bank("ccc", 1000.0, 0.04f);
		//aaa.setIyul(0.04f);
		aaa.disp();
		//bbb.setIyul(0.04f);
		bbb.disp();
		ccc.disp();
		System.out.println("============================");
		*/
	}
}












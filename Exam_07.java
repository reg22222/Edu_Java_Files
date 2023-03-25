class Bank{
	private String name;
	private double money;
	static float iyul;
	//일반 멤버들은 객체 생성시 메모리에 올라가지만, static멤버는 
	//프로그램 시작시 메모리에 올라간다.
	static {	//static멤버만 초기값을 따로 부여해서 사용할 수 있다.
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
		System.out.println(name+"님의 현재 잔액은 " 
				+ money+"원이고, 적용되는 이율은 " + Bank.iyul*100+"% 입니다.");
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		System.out.println("현재 저희 은행 이율은 " + (Bank.iyul*100) +"% 입니다.");
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












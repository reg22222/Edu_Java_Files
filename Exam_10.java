import java.util.Scanner;

abstract class Protoss{
	//추상메소드를 하나라도 가지면 그 클래스는 추상클래스가 된다
	public abstract void attack(); //추상메소드라고 선언
	//추상메소드는 내용이 없고 이름만 존재하는 메소드
	public void move() {
		System.out.println("이동하는 기능을 구현!!");
	} 
}
class Zealot extends Protoss{
	public void attack() {
		System.out.println("질럿이 공격을 합니다!!");
	}
	public void move() {
		System.out.println("질럿이 이동을 합니다!!");
	}
}
class Dragon extends Protoss{
	public void attack() {
		System.out.println("드라곤이 공격을 합니다!!");
	}
	public void move() {
		System.out.println("드라곤이 이동을 합니다!!");
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Protoss pro;
		
		System.out.print("1.질럿  2.드라곤 : ");
		int select1 = in.nextInt();
		System.out.print("1.공격  2.이동 : ");
		int select2 = in.nextInt();
		
		if (select1 == 1) {
			pro = new Zealot();
		}else {
			pro = new Dragon();
		}
		if (select2 == 1) {
			pro.attack();
		}else {
			pro.move();
		}
	}
}


















import java.util.Scanner;

abstract class Protoss{
	//�߻�޼ҵ带 �ϳ��� ������ �� Ŭ������ �߻�Ŭ������ �ȴ�
	public abstract void attack(); //�߻�޼ҵ��� ����
	//�߻�޼ҵ�� ������ ���� �̸��� �����ϴ� �޼ҵ�
	public void move() {
		System.out.println("�̵��ϴ� ����� ����!!");
	} 
}
class Zealot extends Protoss{
	public void attack() {
		System.out.println("������ ������ �մϴ�!!");
	}
	public void move() {
		System.out.println("������ �̵��� �մϴ�!!");
	}
}
class Dragon extends Protoss{
	public void attack() {
		System.out.println("������ ������ �մϴ�!!");
	}
	public void move() {
		System.out.println("������ �̵��� �մϴ�!!");
	}
}

public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Protoss pro;
		
		System.out.print("1.����  2.���� : ");
		int select1 = in.nextInt();
		System.out.print("1.����  2.�̵� : ");
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


















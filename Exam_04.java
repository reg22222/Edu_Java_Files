import java.util.Scanner;

class Member{
	private String name;
	private String tel;
	
	//setter�޼ҵ�
	public void setName(String name) {
		//�̸��� �ߺ��Ǿ����� Ȯ���� ����
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//getter�޼ҵ�
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	Member(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� " + tel +"�� �Դϴ�.");
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		//3�� ȸ���� �̸��� ��ȭ��ȣ�� �Է¹޾� �����غ���
		Scanner in = new Scanner(System.in);
		//Ŭ���� �迭 �����
		//1. ��ü�� ������ ����
		Member[] mb = new Member[3];
		//mb[0], mb[1], mb[2]
		for (int i=0; i<3; ++i) {
			//2. �� ��ü�� �����ϱ�
			System.out.print("�̸��� �Է� : ");
			String name = in.next();
			System.out.print("��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			mb[i] = new Member(name, tel);
			//�����ڸ� ���� ��ü�� �����߸� ����� �� �ִ�
			
		}
		
		for(int i=0; i<3; ++i) {
			mb[i].disp();
		}
	}
}











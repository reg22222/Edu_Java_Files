import java.util.*;

class RoomMg{
	boolean room[];
	int roomSu;
	Scanner in;
	
	RoomMg(){
		in = new Scanner(System.in);
		System.out.print("���� ���� : ");
		roomSu = in.nextInt();
		room = new boolean[roomSu];
	}
	
	void input() {
		int roomNum;
		while(true) {
			System.out.print("�Խ��Ͻ� ���� ��ȣ : ");
			roomNum = in.nextInt();
			if (roomNum < 1 || roomNum > roomSu) {
				System.out.printf("%dȣ�Ǻ��� %dȣ�Ǳ����� �Է°���\n", 1, roomSu);
				continue;
			}else {
				break;
			}
		}
		if (room[roomNum-1]) {
			System.out.println(roomNum+"ȣ���� ����� �Դϴ�");
		}else {
			room[roomNum-1] = true;
			System.out.println(roomNum+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
		}
	}
	
	void output() {
		int roomNum;
		while(true) {
			System.out.print("����Ͻ� ���� ��ȣ : ");
			roomNum = in.nextInt();
			if (roomNum < 1 || roomNum > roomSu) {
				System.out.printf("%dȣ�Ǻ��� %dȣ�Ǳ����� �Է°���\n", 1, roomSu);
				continue;
			}else {
				break;
			}
		}
		if (room[roomNum-1]) {
			room[roomNum-1] = false;
			System.out.println(roomNum+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
		}else {
			System.out.println(roomNum+"ȣ���� ���� ����Դϴ�");
		}
	}
	
	void view() {
		for(int i=0; i<roomSu; ++i) {
			if (room[i]) {
				System.out.println(i+1+"ȣ���� �����");
			}else {
				System.out.println(i+1+"ȣ���� ���");
			}					
		}
	}
	
	void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);		//���α׷� ������Ѷ� 
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RoomMg mg = new RoomMg();
		while(true) {
			System.out.print("1.�Խ� 2.��� 3.���� 4.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	mg.input();	break;	
			case 2 :	mg.output(); break;
			case 3 :	mg.view(); break;
			case 4 :	mg.exit();
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
			}
		}
	}
}




















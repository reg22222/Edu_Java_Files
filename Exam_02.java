import java.util.*;

class RoomMg{
	boolean room[];
	int roomSu;
	Scanner in;
	
	RoomMg(){
		in = new Scanner(System.in);
		System.out.print("방의 갯수 : ");
		roomSu = in.nextInt();
		room = new boolean[roomSu];
	}
	
	void input() {
		int roomNum;
		while(true) {
			System.out.print("입실하실 방의 번호 : ");
			roomNum = in.nextInt();
			if (roomNum < 1 || roomNum > roomSu) {
				System.out.printf("%d호실부터 %d호실까지만 입력가능\n", 1, roomSu);
				continue;
			}else {
				break;
			}
		}
		if (room[roomNum-1]) {
			System.out.println(roomNum+"호실은 사용중 입니다");
		}else {
			room[roomNum-1] = true;
			System.out.println(roomNum+"호실에 입실하셨습니다.");
		}
	}
	
	void output() {
		int roomNum;
		while(true) {
			System.out.print("퇴실하실 방의 번호 : ");
			roomNum = in.nextInt();
			if (roomNum < 1 || roomNum > roomSu) {
				System.out.printf("%d호실부터 %d호실까지만 입력가능\n", 1, roomSu);
				continue;
			}else {
				break;
			}
		}
		if (room[roomNum-1]) {
			room[roomNum-1] = false;
			System.out.println(roomNum+"호실에서 퇴실하셨습니다.");
		}else {
			System.out.println(roomNum+"호실은 현재 빈방입니다");
		}
	}
	
	void view() {
		for(int i=0; i<roomSu; ++i) {
			if (room[i]) {
				System.out.println(i+1+"호실은 사용중");
			}else {
				System.out.println(i+1+"호실은 빈방");
			}					
		}
	}
	
	void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);		//프로그램 종료시켜라 
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RoomMg mg = new RoomMg();
		while(true) {
			System.out.print("1.입실 2.퇴실 3.보기 4.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :	mg.input();	break;	
			case 2 :	mg.output(); break;
			case 3 :	mg.view(); break;
			case 4 :	mg.exit();
			default : System.out.println("잘못입력하셨습니다. 다시 입력해 주세요");
			}
		}
	}
}




















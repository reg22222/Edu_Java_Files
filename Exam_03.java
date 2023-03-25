import java.util.*;
class Lotto{
	int com[];
	int select[];
	
	Lotto(){
		com = new int[6];
		select = new int[6];
		setCom();
	}
	
	void setCom() {
		for (int i=0; i<6; ++i) {
			com[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; ++j) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	void setAutoSelect() {
		for (int i=0; i<6; ++i) {
			select[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; ++j) {
				if (select[i] == select[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	void setSelect() {
		Scanner in = new Scanner(System.in);
		for (int i=0; i<6; ++i) {
			do{
				System.out.print(i+1+"��° ���� �Է� : ");
				select[i] = in.nextInt();
			}while(select[i]<1 || select[i]>45);
			for(int j=0; j<i; ++j) {
				if (select[i] == select[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	int getCount() {
		int count = 0;
		for(int i=0; i<6; ++i) {
			for(int j=0; j<6; ++j) {
				if (com[i] == select[j]) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	void dispCom() {
		System.out.print("��ǻ�� �� : ");
		for(int i=0; i<5; ++i) {
			System.out.print(com[i] + " , ");
		}
		System.out.println(com[5]);
	}
	
	void dispSelect() {
		System.out.print("����� �� : ");
		for(int i=0; i<5; ++i) {
			System.out.print(select[i] + " , ");
		}
		System.out.println(select[5]);
	}
	
}


public class Exam_03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Lotto lotto = new Lotto();
		while(true) {
			System.out.print("1.�����Է� 2.�ڵ��Է� 3.��ǻ�ͼ��缳�� 4.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :
				lotto.setSelect();
				System.out.println("���᰹�� : " + lotto.getCount() +"�� �Դϴ�.");
				break;
			case 2 :
				lotto.setAutoSelect();
				lotto.dispSelect();
				System.out.println("���᰹�� : " + lotto.getCount() +"�� �Դϴ�.");
				break;
			case 3 :
				lotto.dispCom();
				lotto.setCom();
				break;
			case 4 :
				lotto.dispCom(); 
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!");
			}
		}
	}
}










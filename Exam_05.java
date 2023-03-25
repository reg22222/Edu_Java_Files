import java.util.*;
class SungJuk{
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private int rank;
	SungJuk(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
	}
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void setTot() {
		tot = kor + eng;
	}
	public int getTot() {
		return tot;
	}
	public int getRank() {
		return rank;
	}
	
	public void clearRank() {
		rank = 1;
	}
	public void plusRank() {
		rank++;
	}
	
	void disp() {
		System.out.println(name+"���� ������ " + tot +"���̰�, ������ " + rank+"�� �Դϴ�.");
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�л����� �Է� : ");
		int inwon = in.nextInt();
		SungJuk[] sj = new SungJuk[inwon];		//��ü����
		for(int i=0; i<inwon; ++i) {
			System.out.print("�̸��� �Է� : ");
			String name = in.next();
			System.out.print("���������� �Է� : ");
			int kor = in.nextInt();
			System.out.print("���������� �Է� : ");
			int eng = in.nextInt();
			sj[i] = new SungJuk(name, kor, eng);//��ü����
		}
		
		//i�� ������, j�� �츮���л�����
		for(int i=0; i<inwon; ++i) {
			sj[i].clearRank();					//�������� 1���̶�� �ϰ�,		
			for(int j=0; j<inwon; ++j) {
				if (sj[i].getTot() < sj[j].getTot()) {//�������� �츮�ݴٸ� �л� �������� ������
					sj[i].plusRank();			//�� ������ �ϳ� �÷��ش�
				}
			}
		}
		
		for(int i=0; i<inwon; ++i) {
			sj[i].disp();
		}
	}
}





















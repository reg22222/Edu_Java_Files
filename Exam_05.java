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
		System.out.println(name+"님의 총점은 " + tot +"점이고, 순위는 " + rank+"등 입니다.");
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("학생수를 입력 : ");
		int inwon = in.nextInt();
		SungJuk[] sj = new SungJuk[inwon];		//객체선언
		for(int i=0; i<inwon; ++i) {
			System.out.print("이름을 입력 : ");
			String name = in.next();
			System.out.print("국어점수를 입력 : ");
			int kor = in.nextInt();
			System.out.print("영어점수를 입력 : ");
			int eng = in.nextInt();
			sj[i] = new SungJuk(name, kor, eng);//객체생성
		}
		
		//i는 내성적, j는 우리반학생성적
		for(int i=0; i<inwon; ++i) {
			sj[i].clearRank();					//내성적을 1등이라고 하고,		
			for(int j=0; j<inwon; ++j) {
				if (sj[i].getTot() < sj[j].getTot()) {//내성적이 우리반다른 학생 총점보다 작으면
					sj[i].plusRank();			//내 순위를 하나 올려준다
				}
			}
		}
		
		for(int i=0; i<inwon; ++i) {
			sj[i].disp();
		}
	}
}





















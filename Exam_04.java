import java.util.Scanner;

class Member{
	private String name;
	private String tel;
	
	//setter메소드
	public void setName(String name) {
		//이름이 중복되었는지 확인후 수정
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//getter메소드
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
		System.out.println(name+"님의 전화번호는 " + tel +"번 입니다.");
	}
}
public class Exam_04 {
	public static void main(String[] args) {
		//3명 회원의 이름과 전화번호를 입력받아 관리해보자
		Scanner in = new Scanner(System.in);
		//클래스 배열 만들기
		//1. 객체의 갯수를 정의
		Member[] mb = new Member[3];
		//mb[0], mb[1], mb[2]
		for (int i=0; i<3; ++i) {
			//2. 각 개체를 생성하기
			System.out.print("이름을 입력 : ");
			String name = in.next();
			System.out.print("전화번호를 입력 : ");
			String tel = in.next();
			mb[i] = new Member(name, tel);
			//생성자를 통해 객체를 만들어야만 사용할 수 있다
			
		}
		
		for(int i=0; i<3; ++i) {
			mb[i].disp();
		}
	}
}











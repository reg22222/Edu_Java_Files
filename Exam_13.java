import java.util.*;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = in.nextInt();
		
		String[] name = new String[inwon];
		String[] tel = new String[inwon];
		
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"번째 이름 : ");
			name[i] = in.next();
			System.out.print(i+1+"번째 전화번호 : ");
			tel[i] = in.next();
		}
		
		for(int i=0; i<inwon; ++i) {
			System.out.printf("%s님의 전화번호 : %s\n", name[i], tel[i]);
		}
	}
}

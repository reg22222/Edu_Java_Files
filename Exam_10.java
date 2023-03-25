import java.util.*;
public class Exam_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int com = (int)(Math.random()*100) + 1;
		int co = 0;
		while(true) {
			System.out.print("수를 입력 : ");
			int su = in.nextInt();
			++co;
			if (com == su){
				break;
			}else if (com < su) {
				System.out.println("Down");
			}else {
				System.out.println("Up");
			}
		}
		
		System.out.println(co+"번만에 맞추셨습니다.");
	}
}

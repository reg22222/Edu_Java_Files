import java.util.*;
public class Exam_01 {
	public static void main(String[] args){
		try {
			Scanner in = new Scanner(System.in);
		
			System.out.print("수를 입력 : ");
			int su = in.nextInt();
		}catch(InputMismatchException e) {
			//System.err.println("숫자만 넣기!!");
		}
		
	}
}

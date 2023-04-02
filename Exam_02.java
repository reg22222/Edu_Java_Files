import java.util.*;

public class Exam_02 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("첫번째 수를 입력 : ");
				int su1 = in.nextInt();
				System.out.print("두번째 수를 입력 : ");
				int su2 = in.nextInt();
				
				int res = su1 / su2;
				
				System.out.println("결과 : "+ res);
				break;
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력해야 합니다.");
				in.nextLine();
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}
}

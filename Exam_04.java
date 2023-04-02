import java.util.*;
class MySubException extends Exception {
	
	private String message;
	
	public MySubException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		message = super.getMessage() + "점수는 0점에서 100점 사이값만 넣어야 합니다.";
		return message;
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.print("국어점수를 입력 : ");
			int kor = in.nextInt();
			if (kor<0 || kor>100) {
				throw new MySubException("국어");
			}
			System.out.println("입력하신 국어 점수 : " + kor);
		}catch(MySubException e) {
			System.err.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
			//예외발생시 예외발생된 시점까지 사용된 모든 메소드를 반환해준다
		}
	}
}











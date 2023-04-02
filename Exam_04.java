import java.util.*;
class MySubException extends Exception {
	
	private String message;
	
	public MySubException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		message = super.getMessage() + "������ 0������ 100�� ���̰��� �־�� �մϴ�.";
		return message;
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.print("���������� �Է� : ");
			int kor = in.nextInt();
			if (kor<0 || kor>100) {
				throw new MySubException("����");
			}
			System.out.println("�Է��Ͻ� ���� ���� : " + kor);
		}catch(MySubException e) {
			System.err.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
			//���ܹ߻��� ���ܹ߻��� �������� ���� ��� �޼ҵ带 ��ȯ���ش�
		}
	}
}











import java.util.*;

public class Exam_02 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("ù��° ���� �Է� : ");
				int su1 = in.nextInt();
				System.out.print("�ι�° ���� �Է� : ");
				int su2 = in.nextInt();
				
				int res = su1 / su2;
				
				System.out.println("��� : "+ res);
				break;
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
				in.nextLine();
			}catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}
	}
}

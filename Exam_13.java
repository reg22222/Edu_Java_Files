import java.util.*;

public class Exam_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ο����� �Է� : ");
		int inwon = in.nextInt();
		
		String[] name = new String[inwon];
		String[] tel = new String[inwon];
		
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"��° �̸� : ");
			name[i] = in.next();
			System.out.print(i+1+"��° ��ȭ��ȣ : ");
			tel[i] = in.next();
		}
		
		for(int i=0; i<inwon; ++i) {
			System.out.printf("%s���� ��ȭ��ȣ : %s\n", name[i], tel[i]);
		}
	}
}

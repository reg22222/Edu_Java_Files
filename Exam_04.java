import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է� : ");
		String str = in.next();
		
		int[] alpha = new int[26];
		//0������ A�� ������.. 1������ B�� ������....
		
		for(int i=0; i<str.length(); ++i) {
			char ch = str.charAt(i);
			if (ch>='A' && ch<='Z') {
				alpha[ch-65]++;	//A�� 0����, B�� 1����, C�� 2����....
			}else if (ch>='a' && ch<='z') {
				alpha[ch-97]++;	//a�� 0����, b�� 1����....
			}
		}
		
		for (int i=0; i<alpha.length; ++i) {
			if (alpha[i] != 0) {
				System.out.println((char)(65+i) + " => " + alpha[i]);
				 
			}
		}
	}
}

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("문자열을 입력 : ");
		String str = in.next();
		
		int[] alpha = new int[26];
		//0번방은 A의 갯수를.. 1번방은 B의 갯수를....
		
		for(int i=0; i<str.length(); ++i) {
			char ch = str.charAt(i);
			if (ch>='A' && ch<='Z') {
				alpha[ch-65]++;	//A는 0번방, B는 1번방, C는 2번방....
			}else if (ch>='a' && ch<='z') {
				alpha[ch-97]++;	//a는 0번방, b는 1번방....
			}
		}
		
		for (int i=0; i<alpha.length; ++i) {
			if (alpha[i] != 0) {
				System.out.println((char)(65+i) + " => " + alpha[i]);
				 
			}
		}
	}
}

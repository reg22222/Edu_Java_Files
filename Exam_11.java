import java.util.*;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String name[] = new String[7];
		//배열의 위치는 0번부터 시작!!, name[0], name[1], name[2], .. name[6]
		
		for(int i=0; i<7; ++i) {
			System.out.print(i+1+"번째 멤버 : ");
			name[i] = in.next();
		}
		
		for(int i=0; i<7; ++i) {
			System.out.println(name[i]);
		}
		
		/*
		String name2 = "하하";
		String name3 = "김종국";
		String name4 = "송지효";
		String name5 = "지석진";
		String name6 = "양세찬";
		String name7 = "전소민";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println(name6);
		System.out.println(name7);		
		*/
	}
}

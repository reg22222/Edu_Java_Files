import java.util.*;

public class Exam_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String name[] = new String[7];
		//�迭�� ��ġ�� 0������ ����!!, name[0], name[1], name[2], .. name[6]
		
		for(int i=0; i<7; ++i) {
			System.out.print(i+1+"��° ��� : ");
			name[i] = in.next();
		}
		
		for(int i=0; i<7; ++i) {
			System.out.println(name[i]);
		}
		
		/*
		String name2 = "����";
		String name3 = "������";
		String name4 = "����ȿ";
		String name5 = "������";
		String name6 = "�缼��";
		String name7 = "���ҹ�";
		
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

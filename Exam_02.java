import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�⵵ : ");
		int year = in.nextInt();
		System.out.print("�� : ");
		int month = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//�̴��� ���������� ǥ��
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (int i=1; i<week; ++i) {
			System.out.print("\t");
		}
		for (int i=1; i<=lastDay; ++i) {
			System.out.print(i+"\t");
			week++;
			if (week>7) {
				week = 1;
				System.out.println();
			}
		}
	}
}














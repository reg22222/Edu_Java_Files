import java.util.*;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("년도 : ");
		int year = in.nextInt();
		System.out.print("월 : ");
		int month = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		//이달의 마지막날을 표시
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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














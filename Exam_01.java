import java.util.*;

//Calendar 클래스
public class Exam_01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//Date date = new Date(1999, 1, 1);
		//System.out.println("cal = " + cal);
		/*
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : "+ (cal.get(Calendar.MONTH)+1));
		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("시 : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		*/
		/*
		cal.set(Calendar.YEAR, 2023);
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		cal.set(Calendar.MONTH, 7);   //8월을 가르킨다. 
		System.out.println("월 : "+ (cal.get(Calendar.MONTH)+1));
		cal.set(Calendar.DAY_OF_MONTH, 16);
		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
		*/
		cal.set(2023, 7, 16);//년, 월-1, 일
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일");
		
		}
		
	}
}

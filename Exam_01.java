import java.util.*;

//Calendar Ŭ����
public class Exam_01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//Date date = new Date(1999, 1, 1);
		//System.out.println("cal = " + cal);
		/*
		System.out.println("�⵵ : " + cal.get(Calendar.YEAR));
		System.out.println("�� : "+ (cal.get(Calendar.MONTH)+1));
		System.out.println("�� : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� : " + cal.get(Calendar.MINUTE));
		System.out.println("�� : " + cal.get(Calendar.SECOND));
		*/
		/*
		cal.set(Calendar.YEAR, 2023);
		System.out.println("�⵵ : " + cal.get(Calendar.YEAR));
		cal.set(Calendar.MONTH, 7);   //8���� ����Ų��. 
		System.out.println("�� : "+ (cal.get(Calendar.MONTH)+1));
		cal.set(Calendar.DAY_OF_MONTH, 16);
		System.out.println("�� : " + cal.get(Calendar.DAY_OF_MONTH));
		*/
		cal.set(2023, 7, 16);//��, ��-1, ��
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1 : System.out.println("�Ͽ���"); break;
		case 2 : System.out.println("������"); break;
		case 3 : System.out.println("ȭ����"); break;
		case 4 : System.out.println("������"); break;
		case 5 : System.out.println("�����"); break;
		case 6 : System.out.println("�ݿ���"); break;
		case 7 : System.out.println("�����");
		
		}
		
	}
}

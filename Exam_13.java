import java.util.*;
import java.text.*;
public class Exam_13 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("date = " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		//yy : 2자리년도, yyyy : 4자리년도
		//MM : 월
		//dd : 일
		//HH : 하루를 24시간으로 나눠서 표시
		//mm : 분
		//ss : 초
		//sss : 밀리세컨드
		System.out.println(sdf.format(date));
		
		int money = 10000000;
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("현재 가진 돈 : " + df.format(money));
	}
}

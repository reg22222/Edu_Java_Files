import java.util.*;
import java.text.*;
public class Exam_13 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("date = " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		//yy : 2�ڸ��⵵, yyyy : 4�ڸ��⵵
		//MM : ��
		//dd : ��
		//HH : �Ϸ縦 24�ð����� ������ ǥ��
		//mm : ��
		//ss : ��
		//sss : �и�������
		System.out.println(sdf.format(date));
		
		int money = 10000000;
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("���� ���� �� : " + df.format(money));
	}
}

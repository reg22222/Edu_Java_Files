import java.util.*;
import java.text.*;
class MyThread extends Thread{
	private Date date;
	private SimpleDateFormat sdf;
	
	public MyThread() {
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	public void run() {
		//System.out.println("���� : " + Thread.currentThread());
		while(true) {
			date = new Date();
			System.out.println("����ð� : " + sdf.format(date));
			try {
				Thread.sleep(1000);	//�и������� ������ ���ڸ� �־��ش�
			}catch(InterruptedException e) {}
		}
	}
}

public class Exam_06 {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.setDaemon(true);  	//main�� ������ th��ü�� ������
		//\th.setName("ȫ�浿");
		//th.setPriority(10);
		//priority : 1~10 -> 1�� ���� ����, 10�� ���� ����, 5�� default
		th.start();
		try {
			Thread.sleep(5000);	//�и������� ������ ���ڸ� �־��ش�
			th.join(5000);	//th��ü�� 5�ʰ� ��������ּ���
		}catch(InterruptedException e) {}
		//System.out.println(Thread.currentThread());
	}
}












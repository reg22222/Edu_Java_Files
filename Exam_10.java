import java.io.*;

public class Exam_10 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\weekJava\\study\\day08");
		File file = new File(dir, "aaa.txt");
		
		String msg = "Hello, Java!!";
		//������� : ���Ͽ� ���� ������ �����ϰڴ�.
		FileOutputStream fos = new FileOutputStream(file, true);
		//rewrite �ٽþ�����, ���� append����� ���ϸ�, 2��° �Ű������� true�� �־��ش�
		fos.write('A');
		fos.write(66);
		fos.write(msg.getBytes());//byte�迭���� ��������
	}
}

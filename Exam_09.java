import java.io.*;

public class Exam_09 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\weekJava\\study\\day08");
		File file = new File(dir, "aaa.txt");
		
		file.delete();	//�ش簴ü�� ������ �ٷ� ����
		
		if (file.createNewFile()) {
			//������ ������ ����� true, ������ false�� ��ȯ
			System.out.println("������ ��������ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		
		File imsi = File.createTempFile("temp", ".txt", dir);
		//�ӽ����� �����
		imsi.deleteOnExit();	//���α׷� ����� ���� ����
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
	}
}

import java.io.*;

public class Exam_11 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\weekJava\\study\\day08");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		//FileOutputStream���� fileŬ������ ���� ���� ��� �ǳ�,
		//FileInputStream������ fileŬ������ ���� ���� �ݵ�� �־�� �Ѵ�.
		
		while(true) {
			int res = fis.read();
			if (res<0) break;
			//FileInputStream������ ������ ���� 1byte�� �߶� �����´�
			//�̶�, ������ ���̶�� -1�� ��ȯ, �ƴϸ� �ƽ�Ű�ڵ尪�� ��ȯ�� �ش�
			//����, �ƽ�Ű�ڵ尪�� ������ ����
			//�̶� ������ -1�� EOF ��� �θ���
			System.out.print((char)res);
		}
	}
}

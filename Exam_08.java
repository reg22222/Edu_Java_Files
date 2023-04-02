import java.io.*;

public class Exam_08 {
	public static void main(String[] args) {
		System.out.println("File.separator = " + File.separator);
		System.out.println("File.separatorChar = " + File.separatorChar);
		System.out.println("File.pathSeparator = " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
		
		File f1 = new File("E:"+File.separator+"weekJava"+File.separator 
				+"study"+File.separator+"day08" +File.separator + "aaa.txt");
		//E:\weekJava\study\day08\aaa.txt
		File f2 = new File("E:\\weekJava\\study\\day08\\aaa.txt");
		File f3 = new File("E:\\weekJava\\study\\day08", "aaa.txt");
		File dir = new File("E:\\weekJava\\study\\day08");
		File f4 = new File(dir, "aaa.txt");
		File dir2 = new File("E:"+File.separator+"weekJava"+File.separator 
				+"study"+File.separator+"day08");
		File f5 = new File(dir2, "aaa.txt");
		//���ϰ�ü�� �� ���������ؾ� �ϴ°�? �ƴϴ�.
	}
}

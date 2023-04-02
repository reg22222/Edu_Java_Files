import java.io.*;

public class Exam_13 {
	public static void main(String[] args) throws Exception {
		File dir = new File("E:\\weekJava\\study\\day08");
		File file = new File(dir, "bbb.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		int a = dis.readInt();
		double b= dis.readDouble();
		String msg = dis.readUTF();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("msg = " + msg);
	}
}

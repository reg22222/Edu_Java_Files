import java.io.*;
public class Exam_12 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\weekJava\\study\\day08");
		File file = new File(dir, "bbb.txt");
		
		int a = 10;
		String msg = "æ»≥Á«œººø‰!!";
		double b = 10.23;
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(msg);
		
		dos.close();//flush()
	}
}

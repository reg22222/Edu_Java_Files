import java.io.*;

public class Exam_10 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\weekJava\\study\\day08");
		File file = new File(dir, "aaa.txt");
		
		String msg = "Hello, Java!!";
		//파일출력 : 파일에 무언가 내용을 전달하겠다.
		FileOutputStream fos = new FileOutputStream(file, true);
		//rewrite 다시쓰기기능, 만약 append기능을 원하면, 2번째 매개변수로 true를 넣어준다
		fos.write('A');
		fos.write(66);
		fos.write(msg.getBytes());//byte배열값은 보내진다
	}
}

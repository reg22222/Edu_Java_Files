import java.io.*;

public class Exam_11 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\weekJava\\study\\day08");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		//FileOutputStream에서 file클래스의 실제 값은 없어도 되나,
		//FileInputStream에서의 file클래스의 실제 값은 반드시 있어야 한다.
		
		while(true) {
			int res = fis.read();
			if (res<0) break;
			//FileInputStream에서는 파일의 값을 1byte씩 잘라서 가져온다
			//이때, 파일이 끝이라면 -1을 반환, 아니면 아스키코드값을 반환해 준다
			//참고, 아스키코드값은 음수가 없다
			//이때 나오는 -1을 EOF 라고 부른다
			System.out.print((char)res);
		}
	}
}

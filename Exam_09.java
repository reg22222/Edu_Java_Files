import java.io.*;

public class Exam_09 {
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\weekJava\\study\\day08");
		File file = new File(dir, "aaa.txt");
		
		file.delete();	//해당객체의 파일을 바로 삭제
		
		if (file.createNewFile()) {
			//파일이 없으면 만들고 true, 있으면 false를 반환
			System.out.println("파일을 만들었습니다.");
		}else {
			System.out.println("파일이 이미 존재합니다.");
		}
		
		File imsi = File.createTempFile("temp", ".txt", dir);
		//임시파일 만들기
		imsi.deleteOnExit();	//프로그램 종료시 파일 삭제
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
	}
}

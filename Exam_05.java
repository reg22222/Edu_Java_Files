class MyThread05 extends Thread{
	public void run() {
		System.out.println("MyThread05 클래스가 실행 중 입니다.");
	}
}

class MyThread06 implements Runnable{
	public void run() {
		System.out.println("MyThread06클래스가 실행 중 입니다.");
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		System.out.println("main 클래스 실행중......");
		MyThread06 mth = new MyThread06();
		Thread th = new Thread(mth);
		//Runnable을 상속받은 클래스는 start메소드가 없다.
		//이때, Thread클래스 객체를 만들때 Runnable타입의 객체를 받아 Thread객체를 만들 수 있다
		//그래서 새로운 Thread클래스를 선언하고, 그 새로운 Thread클래스의 start메소드를 실행시키면
		//Runnable을 상속받아 만든 클래스의 run메소드를 새로운 Thread영역에서 실행시킨다
		th.start();
		/*
		MyThread05 th = new MyThread05();
		//th.run();	//단일스레드
		th.start(); //멀티스레드로 처리하라는 명령
		//이 객체(Thread를 상속받은)를 새로운 스레드 영역에서 run메소드를 실행시켜 주세요
		 */
		System.out.println("main 클래스 종료......");
	}
}

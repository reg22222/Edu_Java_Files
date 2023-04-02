import java.util.*;

class UpDownGame extends Thread{
	private int comsu;
	private Scanner in;
	private int time;
	private boolean isGame;
	
	public UpDownGame() {
		in = new Scanner(System.in);
		comsu = (int)(Math.random()*100) + 1;
		time = 0;
		isGame = true;
	}
	
	public void run() {
		while(isGame) {
			time++;
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
	
	public void gameStart() {
		this.start();
		while(true) {
			System.out.print("수를 입력 : ");
			int su = in.nextInt();
			if (su == comsu) {
				break;
			}else if (su < comsu) {
				System.out.println("Up");
			}else {
				System.out.println("Down");
			}
		}
		isGame = false;
		System.out.println(time+"초만에 맞추셨습니다.");
	}
}


public class Exam_07 {
	public static void main(String[] args) {
		UpDownGame game = new UpDownGame();
		//game.start();
		game.gameStart();
	}
	
	
}

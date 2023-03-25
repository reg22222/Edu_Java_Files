import java.util.*;

public class Exam_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; ++i) {
			arr[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; ++j) {
				if (arr[i] == arr[j]) {
					--i;
					break;
				}
			}
		}
		
		int[] select = new int[6];
		for(int i=0; i<select.length; ++i) {
			while(true) {
				System.out.print(i+1+"번째 수 : ");
				select[i] = in.nextInt();
				if (select[i]>=1 && select[i]<=45) {
					break;
				}
			}
			for(int j=0; j<i; ++j) {
				if (select[i] == select[j]) {
					--i;
					break;
				}
			}
		}
		
		int co = 0;
		for(int i=0; i<6; ++i) {
			for (int j=0; j<6; ++j) {
				if (arr[i] == select[j]) {
					++co;
					break;
				}
			}
		}
		
		System.out.print("컴퓨터수 : ");
		for(int i=0; i<arr.length-1; ++i) {
			System.out.print(arr[i] + " , ");
		}
		System.out.println(arr[arr.length-1]);
		System.out.print("입력하신 수 : ");
		for(int i=0; i<select.length-1; ++i) {
			System.out.print(select[i] + " , ");
		}
		System.out.println(select[select.length-1]);
		System.out.println("맞춘갯수 : " + co);
	}
}

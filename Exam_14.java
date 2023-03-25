import java.util.*;

public class Exam_14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		for(int i=0; i<arr.length; ++i) {
			System.out.print(i+1+"¹øÂ° ¼ö : ");
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		
		for(int i=0; i<arr.length-1; ++i) {
			System.out.print(arr[i] + " + ");
		}
		
		System.out.println(arr[4] + " = " + sum);
	}
}

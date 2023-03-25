
public class Exam_12 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];	//arr1[0], arr1[1], arr2[2]
		
		int arr2[] = new int[3]; 	//[] : 배열첨자연산자
		int arr3[];
		arr3 = new int[3];
		arr3[0] = 100;
		
		int arr4[] = new int[] {1, 2, 3, 4};
		//arr4[0] = 1, arr4[1] = 2, arr4[2] = 3, arr4[3] = 4
		
		int arr5[] = {1, 2, 3, 4};//JVM가 알아서 new int[]를 붙혀 실행
		
		int arr6[];
		//arr6 = {1, 2, 3, 4};	//오류발생!! 반드시 선언과 동시에 초기값을 줄때만 사용 가능
		
		int arr7[] = new int[] {1,2,2,3,3,54,4,3,4,4,3,3,4,4,5,6,7,6,5,45,2,2,2,3,4,54,5,6,6,5,5,56,6,6,6,5,5,5,5,5,6,7,65,4,4,54,56,6,5,54,56};
		System.out.println("arr7 배열의 크기 : " + arr7.length);
		
		int a = 10;
		int arr8[] = new int[a];	//상수 및 변수도 선언 가능
		
		//int a=0, b, c;
		//System.out.println(a);
		
	}
}












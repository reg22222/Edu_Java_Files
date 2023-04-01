import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		String data = "홍길동       @              123-1234 @        서울 강남구";
		
		Scanner in = new Scanner(data).useDelimiter("\\s*@\\s*");
		//\\s*@\\s* : @를 중심으로 앞에 공백, 뒤에 공백은 구별자이다.
		System.out.println("이름 : " + in.next());
		System.out.println("전화번호 : " + in.next());
		System.out.println("주소 : " + in.next());
		/*
		String[] member = data.split("@");
		for(int i=0; i<member.length; ++i) {
			System.out.println(member[i]);
		}
		
		/* 요즘은 잘 사용하지 않는 유산클래스
		StringTokenizer st = new StringTokenizer(data, "@");
		//첫번째 매개변수에 data를 넣고, 두번째 매개변수엔 구별자를 넣는다		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		/*
		String str = "Hello, Java!!";
		String str2 = "           Hello, Java!!         ";
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str2.trim().equals(str));
		//str2의 앞뒤의 쓸데없는 공백을 지우고 str과 비교한다
		
		/*
		System.out.println(str.toUpperCase());//전부대문자로
		System.out.println(str.toLowerCase());//전부소문자로
		/*
		System.out.println("str.substring(7) = " + str.substring(7));
		//매개변수가 하나일때 -> 해당위치부터 끝까지
		System.out.println("str.substring(7, 11) = " + str.substring(7,11));
		//매개변수가 두개일때 -> 처음위치부터 두번째되기 전까지
		/*
		byte[] by = str.getBytes();		//문자열을 byte배열로 바꾸기
		for(int i=0; i<by.length; ++i) {
			System.out.println(by[i]);
		}
		String str2 = new String(by);	//byte배열을 문자열로 바꾸기
		System.out.println(str2);
		/*
		System.out.println("Hello로 시작합니까? " + str.startsWith("Hello"));
		System.out.println("Java로 끝이 납니까? "+ str.endsWith("Java"));
		/*
		for(int i=0; i<str.length(); ++i) {
			System.out.println(str.charAt(i));
		}
		/*
		String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		String d = new String("aaa");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(c.equals(d));
		/*
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(c==d);
		*/
	}
}

import java.util.*;

public class Exam_06 {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		
		map.put("유재석", "개그맨");
		map.put("류현진", "야구선수");
		map.put("손흥민", "축구선수");
		map.put("김종국", "가수");
		
		if (map.containsKey("손흥민")) {
			System.out.println("손흥민은 저희 멤버입니다.");
		}
		
		/*
		Enumeration enu = map.keys();	//키값을 모두 가져오기
		while(enu.hasMoreElements()) {	//hasNext()동일한 명령
			Object obj = enu.nextElement();//next() 동일한 명령
			String key = (String)obj;
			Object obj2 = map.get(key);
			String value = (String)obj2;
			System.out.println(key+"님의 직업 : "+ value);
		}
		/*
		System.out.println("김종국의 직업 : " + map.get("김종국"));
		/*
		System.out.println("map의 크기 : " + map.size());
		map.remove("김종국");
		System.out.println("map = " + map);
		/*
		System.out.println("map = " + map);
		map.put("김종국", "개그맨"); //키값이 같으면 수정이 된다
		System.out.println("map = " + map);
		*/
	}
}

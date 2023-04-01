import java.util.*;

public class Exam_05 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("유재석");		//add() : 데이터 삽입
		set.add("김종국");
		set.add("송지효");
		set.add("전소민");
		set.add("하하");
		set.add("지석진");
		set.add("양세찬");
		set.add("유재석");		//중복된 데이터는 덮어써버린다
		
		set.remove("양세찬");		//특정 데이터 삭제!!
		
		Iterator it = set.iterator();
		while(it.hasNext()) {	//현재 데이터가 존재하는지 안하는지
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name);
		}
		/*
		String[] name = new String[set.size()];
		set.toArray(name);
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		/*
		String name = "유재석";
		
		if (set.contains(name)) {
			System.out.println(name+"님은 런닝맨 멤버!!");
		}else {
			System.out.println(name+"님은 런닝맨 멤버가 아닙니다.");
		}
		/*
		 * 
		//System.out.println(set);
		//System.out.println("set의 크기 : " + set.size());
		set.clear();			//데이터 모두 비우기
		//System.out.println("clear한 후 set의 크기 : " + set.size());
		if (set.isEmpty()) {	//데이터 없는지, 있는지
			System.out.println("데이터 없다");
		}else {
			System.out.println("데이터 있다");
		}
		*/
	}
}

















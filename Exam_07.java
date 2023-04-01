import java.util.*;

public class Exam_07 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("하하");
		list.add("송지효");
		list.add("전소민");
		list.add("양세찬");
		list.add("유재석");
		
		//list.remove("전소민");
		list.remove(5);
		System.out.println(list);
		/*
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String name = (String)obj;
			System.out.println(name);
		}
		/*
		String[] name = new String[list.size()];
		list.toArray(name);
		for(int i=0; i<name.length; ++i) {
			System.out.println(name[i]);
		}
		/*
		System.out.println(list.indexOf("지석진"));
		System.out.println(list.lastIndexOf("지석진"));
		/*
		for(int i=0; i<list.size(); ++i) {
			Object obj = list.get(i);
			String name = (String)obj;
			System.out.println(name);
		}
		/*
		System.out.println(list);
		list.add(1, "지석진");
		System.out.println(list);
		*/
	}
}

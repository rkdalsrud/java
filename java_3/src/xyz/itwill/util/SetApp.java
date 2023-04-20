package xyz.itwill.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetApp {
	public static void main(String[] args) {
	
	Set<String> set= new HashSet<String>();
	set.add("홍길동");
	set.add("임꺽정");

	
	System.out.println(set.size());
	set.remove("홍길동");
	System.out.println(set);
	
	Iterator<String> iterator=set.iterator();
	
	while(iterator.hasNext()) {
		String str=iterator.next();
		System.out.println(str);
	}
	for(String str: set) {
		System.out.println(str+"");
			
	}
	System.out.println();
	}
}
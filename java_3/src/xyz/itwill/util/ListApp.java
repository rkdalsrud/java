package xyz.itwill.util;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListApp {
	public static void main(String[] args) {
		List <String> list =new ArrayList<String>();
		
		list.add("홍길동");
		list.add("임꺽정");
		list.add("전우치");
		list.add("일지매");
		
		System.out.println(list.toString());
		System.out.println("==================================");
		
		System.out.println(list.size());
		System.out.println("==================================");
		System.out.println(list.get(2));
		list.add(4,"장길산");
		System.out.println(list);
		list.set(1, "임걱쥬");
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+" ");
		}
		System.out.println(list);
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		for(String str: list) {
			System.out.print(str+" ");
			
	}
		System.out.println("==========================================");
		Collections.sort(list);
		
		list.clear();
		if(list.isEmpty()) {
			System.out.println("저장 없음");
		} 
		System.out.println("----------------------------------------");
		
		List<Integer> numberList=Arrays.asList(10,20,30,40,50);
		System.out.println(numberList);
		
}
}

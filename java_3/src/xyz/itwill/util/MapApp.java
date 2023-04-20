package xyz.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapApp {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("1000", "홍길동");
		map.put("2000", "임꺽정");
		map.put("3000", "전우치");
		map.put("4000", "일지매");
		map.put("5000", "장길산");

		System.out.println(map);
		map.put("2000", "임걱정");
		map.remove("4000");
		System.out.println(map);
		System.out.println("=================");
		String name=map.get("1000");
		System.out.println(name);
		System.out.println("=================");

		Iterator<String> iteratorKey=map.keySet().iterator();
		
		while(iteratorKey.hasNext()) {
			String key=iteratorKey.next();
			String value=map.get(key);
			System.out.println(key+" = "+value);
		}
		for(String key:map.keySet()) {
			System.out.println(
					
					);
		}
	}
}

package xyz.itwill.util;

import java.util.Date;

public class DateApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	
	Date now=new Date();
	System.out.println(now);
	
	String[] day= {"일","월","화", "수", "목", "금","토","일"};
	String printDate=(now.getYear()+1900)+"년"+(now.getMonth()+1)+"월"+now.getDate()+"일"+day[now.getDay()]+"요일";
	System.out.println(printDate);
	
	//long currntTime=now.getTime();
	long currentTime=System.currentTimeMillis();
	Date wantDate=new Date(1999,8,31);
	System.out.println(wantDate);
	
	
	}
}

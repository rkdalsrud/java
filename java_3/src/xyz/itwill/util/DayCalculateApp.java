package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램 작성
//ex) 생년월일 입력[ex. 2000-01-01] >> 2023-04-18
//    [결과]태어난지 <1일>이 지났습니다. 
// => 형식에 맞지 않는 생년월일을 입력한 경우 에러 메세지 출력 후 프로그램 종료
public class DayCalculateApp {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("생년월일 기입 >>");
		String birthDay=sc.nextLine();
		sc.close();
		
		Date birthDate=null;
		try {
			birthDate =dateFormat.parse(birthDay);
		
		} catch (ParseException e) {
			System.out.println("[에러]형식에 맞게 입력해 주세요.");
		} catch (Exception e) {
			System.out.println("예기치 못한 에러 발생");
		}
		long today=System.currentTimeMillis();
		long birthTime=birthDate.getTime();
		System.out.println("[결과] 태어난지 < "+((today-birthTime)/1000/86000)+" > 일 지났습니다. ");
	}
}

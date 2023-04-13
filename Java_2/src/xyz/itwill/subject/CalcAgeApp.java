package xyz.itwill.subject;

import java.util.Date;
import java.util.Scanner;

//키보드로 이름과 태어난 년도를 입력받아 나이를 계산하여 읾과 나이를 출력하는 프로그램 작성
//EX) 이름 입력 >>
/*		태어난 년도 >>2000
 		[결과] 홍길동님의 나이는 24살입니다.
 */
public class CalcAgeApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("이름 입력 >>");
		String name=scanner.nextLine();
		
		System.out.print("태어난 년도 >>");
		int birthYear=scanner.nextInt();
		
		Date now=new Date();
		@SuppressWarnings("deprecation")//경고 제거
		int currentYear=now.getYear()+1900;
		
		int age=currentYear-birthYear+1;
		
		System.out.println("[결과] "+name+"의 나이는 "+age+"입니다.");
		
		scanner.close();
	}
}

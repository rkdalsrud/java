package example;

import java.util.Scanner;

//키보드로 정수값을 5번 입력받아 합계를 계산하여 출력하는 프로그램을 작성하세요.
//ex) 1번째 정수값 입력 >> 10
//    2번째 정수값 입력 >> 20
//    3번째 정수값 입력 >> 30
//    4번째 정수값 입력 >> 40
//    5번째 정수값 입력 >> 50
//    [결과]합계 = 150
public class TotalOneExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("1. 정수를 입력하시오 >> ");
		int i=scanner.nextInt();
		
		System.out.print("2. 정수를 입력하시오 >> ");	
		int j=scanner.nextInt();
		System.out.print("3. 정수를 입력하시오 >> ");
		int p=scanner.nextInt();
		System.out.print("4. 정수를 입력하시오 >> ");
		int r=scanner.nextInt();
		System.out.print("5. 정수를 입력하시오 >> ");
		int u=scanner.nextInt();
		System.out.println("[결과]"+(i+j+p+r+u));
	}

	}

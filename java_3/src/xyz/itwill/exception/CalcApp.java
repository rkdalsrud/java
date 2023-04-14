package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {
	public CalcApp() throws InputMismatchException, ArithmeticException{
		Scanner scanner=new Scanner(System.in);
		System.out.println("첫번째 정수값 입력>>");
		//입력값을 정수값으로 변환하여 반환하는 메소드
		int num1=scanner.nextInt();
		
		System.out.println("두번째 정수값 입력>>");
		int num2=scanner.nextInt();
		
		System.out.println("[결과]"+num1+"/"+num2+" = "+(num1/num2));
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		try {
			new CalcApp();		
		} catch(InputMismatchException | ArithmeticException  e){
			System.out.println("똑바로 입력하세요");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}

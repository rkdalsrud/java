package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//키보드로 정수값을 입력 받아 저장된 비밀번호와 비교하여 비교결과를 출력하는 프로그램
public class PasswordMatchApp {
	public static void main(String[] args) {
		/*
		int password=123456;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("비밀번호 입력 >>");
		int number=scanner.nextInt();
		
		if(password==number) {
		System.out.println("로그인이 되었습니다.");
		} else {
			System.out.println("비밀번호 다시 입력하세요");
		}
		scanner.close();
		*/
		int password=123456;
		
		Scanner scanner = new Scanner(System.in);
		try {		
		System.out.println("비밀번호 입력 >>");
		int number=scanner.nextInt();
		if(number!=password) {
			//인위적으로 예외 객체를 생성하여 발생시키는 명령
			
			throw new PasswordMismatchException("결과가 틀림");
		}
			System.out.println("맞음");
		} catch (InputMismatchException e) {
			System.out.println("숫자만 가능");
		} catch (PasswordMismatchException e) {
		System.out.println(e.getMessage());
		}
		catch (Exception e) {
		System.out.println("예기치 못한 에러");
		} finally {
		scanner.close();
	}
}
}
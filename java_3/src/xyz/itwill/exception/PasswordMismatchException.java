package xyz.itwill.exception;
//프로그램 개발자가 직업 선언한 예외 클래스
public class PasswordMismatchException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public PasswordMismatchException() {
		// TODO Auto-generated constructor stub
	}
	public PasswordMismatchException(String message) {
		//
		super(message);
	}
	
	
}

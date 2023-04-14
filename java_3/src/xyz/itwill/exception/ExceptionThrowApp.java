package xyz.itwill.exception;

public class ExceptionThrowApp {
	public static void display() throws ArrayIndexOutOfBoundsException {
		int[] array= {10,20,30,40,50};
		
			for(int i=0;i<=array.length;i++) {
			System.out.println("array["+i+"] = "+array[i]);//예외발생 - 예외객체 생성
			
		}	
	}
	
		public static void main(String[] args) {
			try {
				display();//같은 클래스의 정적메소드는 클래스 표현없이 메소드 호출
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외");
			}
	}
}

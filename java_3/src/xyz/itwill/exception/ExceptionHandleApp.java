package xyz.itwill.exception;



public class ExceptionHandleApp {
	public static void main(String[] args) {
		int[] array= {10,20,30,40,50};
		try {
		//배열 요소의 첨자가 사용범위를 벗어난 경우 
		for(int i=0;i<=array.length;i++) {
			System.out.println("array["+i+"]"+array[i]);
		}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("[에러]"+e.getMessage());
		
			e.getStackTrace();
		} finally {
			System.out.println("[메세지]예외 발생과 상관없이 무존건 실행될 명령");
		}
		
	} 
	  
}
    
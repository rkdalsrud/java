package xyz.itwill.lang.thread;


                                                  

public class SingleThreadApp {
	public static void main(String[] args) {
		System.out.println("SingleThreadApp 클래스의 main() 메소드 시작");
		
		
		System.out.println("["+Thread.currentThread().getName()
				+"] 스레드에 의해 main() 메소드의 명령실행");
		
		System.out.println("SingleThreadApp 클래스의 main() 메소드 종료");
	}
}

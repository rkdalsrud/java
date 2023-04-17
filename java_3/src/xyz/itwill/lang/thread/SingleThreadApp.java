package xyz.itwill.lang.thread;


                                                  

public class SingleThreadApp {
	public static void main(String[] args) {
		/*
		System.out.println("SingleThreadApp 클래스의 main() 메소드 시작");
		
		//현재명령을 읽어 처리하는 스레드에 대한 스레드객체를 반환하는 메소드
		//thread.getname(): 스레드 객체된 스레드의 이름(식별자)를 반환하는 메소드
		System.out.println("["+Thread.currentThread().getName()
				+"] 스레드에 의해 main() 메소드의 명령실행");
		
		System.out.println("SingleThreadApp 클래스의 main() 메소드 종료");
		*/
		for(char i='A';i<='Z';i++) {
			System.out.println(i);
		}
		new SingleThread().display();
	}
}

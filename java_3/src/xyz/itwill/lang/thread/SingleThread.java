package xyz.itwill.lang.thread;

public class SingleThread {
	public void display() {
		/*
		System.out.println("SingleThread 클래스의  display() 메소드 시작");
		
		//메소드의 명령을 모두 실행한 후 다시 현재 위치로 되돌아와 나머지 명령 실행
		//new SingleThread().display();
		
		System.out.println("SingleThread 클래스의  display() 메소드 종료");
		*/
		for(char i='a';i<='z';i++) {
			System.out.println(i);
		}
	}
}

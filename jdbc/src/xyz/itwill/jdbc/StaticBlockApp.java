package xyz.itwill.jdbc;

public class StaticBlockApp {
	public static void main(String[] args) throws ClassNotFoundException {
		//1.classloader 프로그램을 이용하여 클래스(class 파일)를 읽어 메모리에 저장
		//2.new 연산자로 메모리에 저장된 클래스 	
		 
	//	StaticBlock sb=new StaticBlock();
	 
	// sb.display(); 
	 Class.forName("xyz.itwill.jdbc.StaticBlock");
	 //StaticBlock sb=new StaticBlock();
	 //sb.display(); 
	 
	}
}

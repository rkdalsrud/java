package xyz.itwill.net;

import java.io.IOException;
import java.net.ServerSocket;

//TCP 프로그램 : ServerSocket 클래스와 Socket 클래스를 이용하여 작성
// => 서버와 클라이언트가 소켓을 사용하여 1:1로 연결되어 데이타를 송수신하는 네트워크 프로그램

//서버(Server) : 외부의 컴퓨터(클라이언트)가 접속할 수 있는 환경과 서비스를 제공하기 위한 컴퓨터
// => ServerSocket 클래스를 사용하여 서버 프로그램 작성
//클라이언트(Client) : 서버에 접속하여 서비스를 제공받을 수 있는 컴퓨터
// => Socket 클래스를 사용하여 클라이언트 프로그램 작성

//ServerSocket 클래스를 사용하여 사용 가능을 포트번호를 검색하는 프로그램 작성
public class ServerSocketApp {
	public static void main(String[] args) {
		for(int i=2000;i<=9000;i+=1000) {
		try {
			ServerSocket serverSocket= new ServerSocket(i);
			System.out.println("["+i+"] 번째 포트는 네트워크 프로그램에서 사용가능합니다.");
		} catch(IOException e) {
			System.out.println("["+i+"] 번째 포트는 네트워크 프로그램에서 사용불가능합니다.");
		}
		
		}
	}
}
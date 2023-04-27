package xyz.itwill.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;


//NTP 서버에 접속하여 서버에서 보내온 날짜와 시간을 제공받아 출력하는 클라이언트 프로그램 작성
public class TimeClientApp {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			//Socket 클래스 : TCP 프로그램에서 다른 컴퓨터와의 연결을 위한 정보를 저장하기 위한 
			//클래스 - 다른 컴퓨터의 소켓과 연결되어 값을 송수신할 수 있는 입출력 스트림 제공
			// => Socket 클래스의 Socket(String host, int port) 생성자를 이용하여 매개변수에
			//접속 컴퓨터(서버)의 네트워크 식별자(호스트이름 또는 IP 주소)와 활성화된 포트번호를
			//전달하여 Socket 객체 생성 - 서버 접속
			// => UnknownHostException 및 IOException 발생 - 일반 예외이므로 반드시 예외 처리
			Socket socket=new Socket("192.168.13.3", 2000);
				
			//System.out.println("socket = "+socket);
			
			//InputStream stream=socket.getInputStream();t
			InputStream stream=socket.getInputStream();
			ObjectInputStream in=new ObjectInputStream(stream);
			Date date=(Date)in.readObject();
			
			System.out.println("서버에서 보내온 날짜와 시간 = "+new SimpleDateFormat("yyyy년mm월dd일 HH:MM:SS").format(date));
			
			
			//Socket.close() : Socket 객체를 제거하는 메소드 - 접속 해제
			socket.close();
		}catch (UnknownHostException e) {
			System.out.println("[에러]서버를 찾을 수 없습니다.");
		}  catch (IOException e) {
			System.out.println("[에러]서버에 접속 할 수 없습니다.");
		}
	}
}

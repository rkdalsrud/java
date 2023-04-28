package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//채팅 서버 프로그램 - 다중 스레드 프로그램
// 클라이언트에서 보내온 메세지를 전달받아 접속된 모든 클라이언트에게 전달하는 기능
//클라이언트와 연결된 소켓은 새로운 스레드를 생성하여 독립적으로 입출력되도록 설정
public class chatServerApp {
	//현재 접속중인 모든 클라이언트의 소켓정보를 저장한 List 객체를 저장하기 위한 필드 
	private List<SocketThread> clientList;
	
	public chatServerApp() {
		ServerSocket chatServer=null;
		
		try {
			chatServer=new ServerSocket(5000);
			System.out.println("채팅 서버 동작중 ...");
			
			//ArrayList 객체를 생성하여 필드에 저장
			clientList=new ArrayList<>();
			
			while(true) {
				try {
				Socket socket=chatServer.accept();
				
				System.out.println("[접속로그]"+socket.getInetAddress().getHostAddress()+"의 컴퓨터에서 서버에 접속 하였습니다.");
				
				//SocketThread 객체 생성-클라이언트와 연결된 소켓 객체가 저장
				//thread 클래스를 상복받은 스레드 클래스
				SocketThread socketThread=new SocketThread(socket);
				
				//새로운 메소드는 run 메소드를 호출하여 명령을 독립적으로 실행
				socketThread.start();
				
				//list 객체의 요소로 SocketThread 객체 추가
				clientList.add(socketThread);
				} catch(IOException e) {
					System.out.println("[에러로그] 클라이언트의 접속 관련 문제가 발생하였습니다.");
				}
			}
			
		} catch(IOException e) {
			System.out.println("서버가 정상적으로 동작되지 않습니다.");
		}
	
	}
	public static void main(String[] args) {
		new chatServerApp();
	}
	
	//현재 접속중인 클라이언트에게 메세지를 전달
	public void sendMessage(String message) {
		
		//List 객체에 저장된 요소(SocketThread 객체)를 차례대로 제공받아 반복 처리
		for(SocketThread socketThread : clientList) {
			
			//외부클래스는 내부클래스로 객체를 생성하여 접근제한자에 상관없이 필드와 메소드 접근 가능
			socketThread.out.println(message);
			
			
		}
	}
	
	//클라이언트와 연결된 소켓을 이용하여 입출력 기능을 제공하기 위한 클래스 
	//-> 독립적인 입력 또는 출력 기능을 제공하기 위해 새로운 스레드를 생성하여 명령을 실행할 수 있도록 스레드 
	public class SocketThread extends Thread {
		private Socket client;// 클라이언트와 연결된 소켓 객체를 저장하기 위한 필드
		
		//클라이언트에게 보내온 메세지를 읽기 위한 입력 스트림을 저장
		private BufferedReader in;
		
		//클라이언트에게 메세지를 보내기 위한 출력 스트림을 저장
		private PrintWriter out;
		
		public SocketThread(Socket client) {
			this.client=client;
		}
		
		
		//새로운 스레드가 실행할 명령을 작성하기 위한 메소드 
		//->클라이언트에서 보내온 메세지를 전달받아 모든 클라이언트에게 전달하는 명령을 작성
		@Override
		public void run() {
			//클라이언트의 대화명을 저장하기 위한 변수 선언
			String aliasName="";
			
			try {
			//소켓의 입력스트림을 제공받아 대량의 문제데이터를 읽을 수 있는 입력스트림으로 확장하여 필드에 저장
				in=new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			//소켓의 출력스트림을 제공받아 대량의 문제데이터를 전달할 수 있는 출력스트림으로 확장하여 필드에 저장
			
				out= new PrintWriter(client.getOutputStream(),true);
			
			//클라이언트에서 보내온 대화명을 반환받아 변수에 저장
			//=>클라이언트가 대화명을 보내오기 전까지 스레드 일시 중지
				aliasName=in.readLine();
	
			//현재 접속중인 모든 클라이언트에게 입장 메세지 전달(out 이용시엔 한명만 받을 수 있음)
			//=>내부클래스에서는 외부클래스의 필드 또는 메소드를 접근제한자와 상관없이 접근 가능	
				sendMessage("["+aliasName+"] 님이 입장했습니다.");
			
			//클라이언트에서 보내온 메세지를 전달받아 현재 접속중인 모든 클라이언트에게 전달
			//클라이언트가 접속을 종료하기 전까지 반복처리
				while(true) {
				sendMessage("["+aliasName+"]"+in.readLine());
				}
			
			} catch(IOException e) {
				//클라이언트가 접속 종료시 명령 작성
				//List 객체에서 접속중인 클라이언트의 정보 삭제
				clientList.remove(this);
				sendMessage("["+aliasName+"]님이 퇴장하셨습니다.");
				
				System.out.println("[해제로그]"+client.getInetAddress().getHostAddress()+"의 컴퓨터에서 서버에 접속해제 하였습니다.");
				
				
			}
			
		}
	}

}



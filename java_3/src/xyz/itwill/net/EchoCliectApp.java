package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.naming.ldap.SortKey;

//키보드로 메세지를 입력받아 접속 서버에 전달하는 클라이언트 프로그램 작성
public class EchoCliectApp {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("전달 메세지 입력 >> ");
		String message=in.readLine();
		
		try {
			Socket	socket =new Socket("192.168.13.3",3000);
			
			BufferedWriter out= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			out.write(message);
			out.flush();
			socket.close();
		} catch (IOException e) {
			System.out.println("서버에 접속할 수 없습니다.");
		}
		
		
	}
}
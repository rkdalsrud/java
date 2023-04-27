package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//
public class MessageSendApp {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("전달 메세지 입력 >> ");
		String message=in.readLine();
		
		DatagramSocket socker=new DatagramSocket();
		InetAddress address=InetAddress.getByName("192.168.13.3");
		
		byte[] data=message.getBytes();
		
		DatagramPacket packet=new DatagramPacket(data, data.length, address, 4000);
		
		socker.send(packet);
		
		socker.close();
		System.out.println("연결 컴퓨터에게 메세지 보냈습니다.");
	}
}

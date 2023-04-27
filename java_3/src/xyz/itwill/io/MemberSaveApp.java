package xyz.itwill.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//회원정보를 파이렝 전달하여 저장하는 프로그램 작성
public class MemberSaveApp {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("c:/data/member.txt"));
		
		
		out.writeObject(new Member("abc","홍길동","010-7373-0449"));
		out.writeObject(new Member("dfg","전우치","010-7854-0449"));
		out.writeObject(new Member("asd","강호동","010-1234-0449"));
		
		out.close();
		
		System.out.println("c:/data/object.txt 파일에 회원정보를 저장했습니다.");
	}
}

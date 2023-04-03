package basic;

//import: 다른 패키지의 클래스를 불러오기 위해 사용하는 키워드
import java.util.Scanner;

//system.out :출력스트림을 사용하여 값을 화면에 전달하는 기능을 제공하는 객체
//system.in: 키보드로부터 전달된 값을 입력 스트림을 사용하여 프로그램에 전달하는 기능을 제공

public class ScannerApp {
	public static void main(String[] args) {
		//Scanner 클래스 : 입력스트림을 전달받아 원하는 값을 입력받기 위한 기능을 제공하는 클래스
		Scanner	scanner=new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		String name=scanner.nextLine();
		//주의= 키보드로 입력된 값이 정수값이 아닌 경우 예외(Exception) 발생-프로그램 강제 종료
		System.out.print("나이 입력 >> ");
		int age=scanner.nextInt();
		System.out.println("[결과]"+name+"님의 나이는 "+age+"살 입니다.");
		scanner.close();
	}
}
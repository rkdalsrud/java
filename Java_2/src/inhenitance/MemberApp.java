package inhenitance;

public class MemberApp {
	public static void main(String[] args) {
		Member member1=new Member();
		member1.setId("rkdalsrud");
		member1.setName("강민똥");
		member1.display();
		System.out.println("==========================");
		Member member2=new Member("rkdalsrud1","강민응");
		member2.display();
		
		
		/*
		Member member1=new Member();
		
		member1.setId("abc123");
		member1.setName("홍길동");
		
		member1.display();
		
		Member member2=new Member("xyz789","임꺽정");
		member2.display();
		
		/*Member member1=new Member();
		
		member1.setId("abc123");
		member1.setName("홍길동");
		
		member1.display();
		System.out.println("=============================================================");
		Member member2=new Member("xyz789", "임꺽정");
		member2.display();
		System.out.println("=============================================================");
		*/
	}
}
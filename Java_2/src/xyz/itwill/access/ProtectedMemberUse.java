package xyz.itwill.access;

public class ProtectedMemberUse {
	public void run() {
		PackageMember member=new PackageMember();
		
		member.num=1;
		member.display();
		
				
	}
}

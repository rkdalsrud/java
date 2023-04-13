package xyz.itwill.access;

public class PrivateMemberUse {
	public void run() {
		PublicMember member=new PublicMember();
		
		
		member.num=100;
		member.num=100;
		
	}
}

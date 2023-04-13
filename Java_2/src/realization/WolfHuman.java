package realization;

//인터페이스를 상속받은 자식클래스는 인터페이스에 선언된 모든 추상메소드를 반드시 오버라이드 선언
public class WolfHuman extends Human implements Wolf {

	@Override
	public void fastWalk() {
		// TODO Auto-generated method stub
		System.out.println("[늑대]네 발로 빠르게 달릴 수 있는 능력");
	}

	@Override
	public void cryLoudly() {
		// TODO Auto-generated method stub
		System.out.println("[늑대]큰소리로 울부짖을 수 있는 능력");
		
	}
	public void change() {
		System.out.println("[늑대인간]변신할 수 있는 능력");
	}
}

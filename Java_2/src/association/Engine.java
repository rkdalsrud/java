package association;


public class Engine {
	private String fualType;
	private int displacement;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public Engine(String fualType, int displacement) {
		super();
		this.fualType = fualType;
		this.displacement = displacement;
	}

	public String getFualType() {
		return fualType;
	}

	public void setFualType(String fualType) {
		this.fualType = fualType;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	//엔진정보(필드값)를 출력하는 메소드
	public void displayEngine() {
		System.out.println("연료타입 = "+fualType);
		System.out.println("배기량 = "+displacement);
	}
}

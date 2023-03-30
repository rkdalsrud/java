package basic;

public class VarirableApp {
	public static void main(String[] args) {
		int  su;
		su=100;
	
		System.out.print("초기값=");
	System.out.println(su);//변수에 저장된 값을 화면에 출력
	
	su=200;
	System.out.print("변경값=");
	System.out.println(su);
	
	System.out.println("==========================================");
	int num=100;//변수 선언 및 초기값 저장
	
	System.out.println("num="+num);
	System.out.println("올해는 "+2+0+2+3+"년입니다.");
	System.out.println(2+0+2+3+"년은 토끼띠해입니다.");//실행은 되지만 결과가 원하는대로 안나옴
	System.out.println(2+0+2+3+"년은 토끼띠해입니다.");
	System.out.println(""+2+0+2+3+"년은 토끼띠해입니다.");
	System.out.println("==========================================");

	int num1=100, num2=200;
	System.out.println("연산결과= "+num1+num2);//실행은 되지만 결과가 원하는대로 안나옴
	System.out.println("연산결과= "+(num1+num2));
	System.out.println("연산결과= "+num1*num2);
	System.out.println("연산결과="+(num1*num2)); //*할 경우 괄호 치는 것을 권장
	System.out.println("==========================================");
	
	int kor=88,eng=90; //int tot=88+90 - 이렇게 하지말것!
	int tot= kor+eng; //int tot=88+90 점수가 변동할 수 있기 때문에 앞처럼 써줘야 함, 연산 결과를 변수에 저장
	System.out.println("점수합계="+tot);
	System.out.println("==========================================");
	//변수에 값이 저장되어 있지 않은 상태에서 변수를 사용할 경우 에러 발생
	int count=10;
	System.out.println("count= "+count);
	
	}

}


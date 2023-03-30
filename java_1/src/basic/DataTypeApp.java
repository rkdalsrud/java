package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		System.out.println("<<정수형(IntegerType)>>");
		System.out.println("정수형(10진수 100) ="+100);//숫자값-10진수 정수형 리터럴
		//println() 메소드는 정수값을 무조건 10진수로 변환하여 출력
		System.out.println("정수형(8진수 100) ="+0100);//0숫자값-8진수 정수형 리터럴
		System.out.println("정수형(16진수 100) ="+0x100);//0x100숫자값-16진수 정수형 리터럴
		System.out.println("정수형(10진수 100) ="+100L);//숫자값 L - 10진수 정수형 리터럴(8Byte)-LongType
		
		System.out.println("정수값 ="+21221);
		//4Byte로 표현 가능한 정수값 : -2147483615~2147483647
		//=> Byte로 표현 불가능한 정수값을 사용한 경우 에러 발생 
		//그럴 땐 숫자 뒤에 L붙여주면 에러 발생x
		System.out.println("정수값 ="+2147483648L);
		
		byte a1=127;
		short a2=32767;
		int a3=2147483647;
		System.out.println("a1="+a1);
		//int a5=100L; 값에 대한 손실이 발생할 수 있으므로 에러 발생
		System.out.println("==========================================");
		System.out.println("실수값(4Byte) ="+12.3F); //실수값F >>4Byte 실수형 리터럴(FloatType)
		System.out.println("실수값(8Byte) ="+12.3F); //실수값 >>8Byte 실수형 리터럴(DoubleType)
		System.out.println("실수값(8Byte) ="+12.3F); //실수값 >>8Byte 실수형 리터럴(DoubleType)
		System.out.println("실수값(8Byte) ="+0.000000123);
		
		//실수값을 지수형태로 표현하여 사용 가능
		float b1=1.23456789F;//가수부를 표현하기 위한 크기(정밀도) : 7자리
		//뒷자리 9가 오버플로어되서 9가 8에 영향을 미쳐 8이 9가 된다.
		double b2=1.23456789;//가수부를 표현하기 위한 크기(정밀도):15자리

		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		
		
	}
}
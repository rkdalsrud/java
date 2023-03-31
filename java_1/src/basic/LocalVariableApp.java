package basic;

public class LocalVariableApp {
	public static void main(String[] args) {
		int  num1=100;
		
		
		//임의 블럭
		{
			int num2=200;
			System.out.println("임의블럭=========");
			System.out.println(num1+"1"+num2+"2");
		}
		int num2=200;
		System.out.println("임의블럭=========");
		System.out.println(num1+"1"+num2+"2");      
	}
}


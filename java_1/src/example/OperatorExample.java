package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		int sec=245678;
		int min= sec/60;
		int hour= min/60;
		int day= hour/24;
		
		sec %= 60;
		min %= 60;
		hour %=24;
		System.out.println("23456788초는");
		           
		
		
		
		
		


		System.out.println("===============================================");
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요.


		System.out.println("===============================================");
	}
}
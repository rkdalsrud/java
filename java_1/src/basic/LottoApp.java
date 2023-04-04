package basic;

//1~45 범위의 정수형 난수값을 6개 제공받아 출력하는 프로그램 작성
public class LottoApp {
	public static void main(String[] args) {
		int[] lotto= new int[6];
		
		
		
		for(int i=0;i<lotto.length;i++) {
			while(true) {
			lotto[i]=(int)(Math.random()*45)+1;
			
			
			boolean result=true; // false:미중복 true:중복
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					result=true;
					break;
				}
			}
			if(!result) break; //새로운 난수값이 기준 난수값과 중복되지 않는 경우 while 구문종료
			}
		}
		for(int i=0;i<lotto.length;i++) {
			for(int j=i+1;j<lotto.length;j++) { 
				if(lotto[i] >    lotto[j]) {
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
					
				}
			}
		}
		
		System.out.print("행운의 숫자 >>");
		
		for(int number : lotto) {
			System.out.print(number+" ");
		}
		System.out.println();
}
}

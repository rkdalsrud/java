package basic;

public class ForApp {
	public static void main(String[] args) {
		
		int tot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
			System.out.println("1~100범위의 합계는"+tot);

		}
		int begin=90, end=80;
		if(begin>end) {
			int temp=begin;
			begin=end;
			end=temp;
		}
		
		int sum=0;
		for(int i=begin;i<=end;i++) {
			sum+=i;
		}
		System.out.println(begin+"~"+end+"범위의 정수들의 합계 = "+sum);
}
}

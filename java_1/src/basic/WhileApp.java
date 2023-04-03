package basic;

public class WhileApp {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			System.out.println("Java programming");
			i++;
		}
		System.out.println("======================================================================");
	int j=1, tot=0;
	do {
		tot=j;
		j++;
	} while(j<=100);
	System.out.println("1~100 범위의 정수들의 합계 = "+tot);
	System.out.println("===========================");
	int cnt=0, gae=1;//cnt:접는 횟수 ,gae: 사각형의 모양 갯수
	while(gae<500) {
		cnt++;
		gae*=2;
	}
	
	System.out.println(cnt+"번 접으면 "+gae+"개의 사각형이 만들어집니다.");
	System.out.println("===========================");
	
	}
}
	
	


package example;



public class ArrayExample {
	
		public static void main(String[] args) {
			//사람들의 나이를 저장한 배열 생성하여 참조변수에 저장		
			int[] age= new int [] {27,16,22,36,57,60,43,23,14,29,44,52,59,51,39,33,11};
			
			//배열에 저장된 모든 사람들의 나이 평균을 계산하여 출력하세요.
			
			int tot=0;
			for(int i=0;i<age.length;i++) {
				tot += age[i];
			}
			double ave= (double)tot/ age.length;
			System.out.println("총 평균 = "+ave);
			System.out.println("======================================");
			System.out.println();
			
			
			
			
			System.out.println("===============================================================");
			//배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
			//ex) 10대 = 3명
			//    20대 = 4명
			//    ...
			//    60대 = 1명
			
			int[] cnt=new int[6];
			
			
			
			
			/*int count10=0,count20=0,count30=0,count40=0,count50=0,count60=0;
			
			for(int element : age) {
				if(element >=60) {
					count60++;
				} else if (element >=50) {
					count50++;
					
				}else if (element >=40) {
					count40++;
					
				}else if (element >=30) {
					count30++;
					
				}else if (element >=20) {
					count20++;
					
				}else if(element >=10) {
					count10++;
			
				}
			
			}	
			System.out.println("10대 = "+count10);	
			System.out.println("20대 = "+count20);	
			System.out.println("30대 = "+count30);	
			System.out.println("40대 = "+count40);	
			System.out.println("50대 = "+count50);	
			System.out.println("60대 = "+count60);	
			*/
			
			
			System.out.println("===============================================================");
		
		}
}
		
		




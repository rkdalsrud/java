package java_example;

public class Variable {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println("*");
				if(i==j) {
					System.out.println(" ");
				}
				
			}
		}
	
	}	
}

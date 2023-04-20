package xyz.itwill.util;

public class NonGenericApp {
	public static void main(String[] args) {
		NonGeneric nonGeneric1=new NonGeneric();
		
		
		nonGeneric1.setField(100);//오토박싱: 값->원시형
		Integer returnObject1=(Integer)nonGeneric1.getField();
		
		System.out.println(returnObject1);
		
		NonGeneric nonGeneric2=new NonGeneric();
		nonGeneric2.setField(12.34);
		Double returnObject2=(Double)nonGeneric2.getField();
		
		System.out.println(returnObject2);
		
		if(nonGeneric2.getField() instanceof Double) {
			Double retuDouble2=(Double)nonGeneric2.getField();
		}
		System.out.println("==================================");
		
		NonGeneric nonGeneric3= new NonGeneric();
		
		nonGeneric3.setField("홍길동");
		String  returnObject3=(String)nonGeneric3.getField();
		System.out.println(returnObject3);
		
		
	}

}

package xyz.itwill.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class LottoSetApp {
	public static void main(String[] args) {
		Set<Integer> lottoset=new HashSet<Integer>();
		Random random=new Random();
		
		while(true) {
			lottoset.add(random.nextInt(45)+1);
			if(lottoset.size()==6) break;
		}
		Integer[] lotto=lottoset.toArray(new Integer[0]);
	
		Arrays.sort(lotto);
	}
}

package 챕터5연습문제;

import java.util.Random;

public class Example4풀이 {
private void name() {
	
	Random random = new Random();
	int [] count = new int[6];
	for (int i=0; i<10000; i++) {
		
		
		
		count[random.nextInt(6)]++;
		
				// 위와 동일
				//int ranNum = random.nextInt(6);
				//count[ranNum]++;
		
		
		
		
	}
	
	for(int i =0; i<count.length; i++) {
		System.out.println(count[i] + "");
	
	}
	
		
	}
	
	
	
}

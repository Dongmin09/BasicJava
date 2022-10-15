package 챕터5연습문제;

import java.util.Random;
import java.util.Scanner;

public class example4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int number[] = new int[6];
		int dice = random.nextInt(6) + 1;

		System.out.println("--------------");
		System.out.println("면----------빈도");
		System.out.println("---------------");

		boolean run = true;
		int count = 0;
		int dicea = 0;
		int diceb = 0;
		int dicec = 0;
		int diced = 0;
		int dicee = 0;
		int dicef = 0;

		while (run) {
			for (int i = 0; i < number.length; i++) {
				if (number[dice] == number[i]) {

					count++;
					
					number[count] = random.nextInt(6)+1;

					// lottoNum[num] = random.nextInt(45) + 1;
				}
				
				

				if (number[i] == 1 && dice==1) {

					dicea++;

				} else if (number[i] == 2 && dice==2) {

					diceb++;

				}

				else if (number[i] == 3 && dice==3) {

					dicec++;

				}

				else if (number[i] == 4 && dice==4) {

					diced++;

				}
				
				else if (number[i] == 5 && dice==5) {

					dicee++;

				}
				
				else if (number[i] == 6 && dice==6) {

					dicef++;

				}
				
				
				
				
				
			}
			
			if (count == 100) {

				run = false;
			}
			

			

		}

		System.out.println("1면 :         " + dicea);
		System.out.println("2면 :         " + diceb);
		System.out.println("3면 :         " + dicec);
		System.out.println("4면 :         " + diced);
		System.out.println("5면 :         " + dicee);
		System.out.println("6면 :         " + dicef);

	

}



/*
 * 
 * Random random = new Random();
	int[] count = new int[6];
 * 	
 * for (int i=0; i<10000; i++) {
 * 		int number = random.nextInt(6) +1;
 * 		
 * 		if( number ==1){
 * 			count[0]++;
 * 		} else if (number ==2){
 * 
 * 			count[1]++;
 * 		}
 * 
 * else if (number ==3){
 * 
 * 			count[2]++;
 * 		}
 * 
 * else if (number ==4){
 * 
 * 			count[3]++;
 * 		}
 * 
 * else if (number ==5){
 * 
 * 			count[4]++;
 * 		}
 * 
 * else{
 * 
 * count[5]++;
 * }
 * 
 * }
 * 
 * }
 * 
 * for(int i=0; i<count.length; i++){
 * 	System.out.println("6면 :         " + dicef);
 * 	
 * }
 * 	
 * 
 * 
 * 
 * 
 *  
 *  
 *  
	
	
	






*/



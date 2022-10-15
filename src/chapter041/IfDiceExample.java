package chapter041;

import java.util.Random;

public class IfDiceExample {
public static void main(String[] args) {
	
	//int num = (int) (Math.random() * 6) +1;
	
	
	Random random = new Random();
	int num = random.nextInt(6) + 1;
	
	
	if(num==1)
	{
	System.out.println("주사위 1이 나왔습니다.");	
	}
	
	else if(num==2)
	{
	System.out.println("주사위 2가 나왔습니다");
	
	}
	
	else if(num==3)
	{
	System.out.println("주사위 3가 나왔습니다");
	
	}
	
	else if(num==4)
	{
	System.out.println("주사위 4가 나왔습니다");
	
	}
	
	else if(num==5)
	{
	System.out.println("주사위 5가 나왔습니다");
	
	}
	
	else {
		
		System.out.println("6이 나왔습니다");
	}
	
	
	
	}
}


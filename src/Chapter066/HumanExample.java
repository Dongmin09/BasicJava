package Chapter066;

public class HumanExample {
public static void main(String[] args) {
	
	Human human = new Human();
	HumanExample2 example2 = new HumanExample2();
	
	// 9번째 라인보다 나중이 실행된다고 가정
	example2.testHuman(human);
	System.out.println(human.age);
	
	
	
	
	
	human.age = 10;
	
	
	
}
}

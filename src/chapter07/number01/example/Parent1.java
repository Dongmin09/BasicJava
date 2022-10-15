package chapter07.number01.example;

public class Parent1 {

	
	public String nation;
	
	public Parent1() {
		
		this("대한민국");
		System.out.println("Parent1() Call");
		
		
	}
	
	
	public Parent1(String nation) {
		
		this.nation = nation;
		System.out.println("Parent1(String nation) Call");
	}
	
}

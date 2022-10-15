package Chapter08.Example선생님문제;

public class Student implements Comparable<Student> {
	
	private String name;
	private int age;

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {

		return "Student [name=" + name + ", age =" + age + "]";
	}

	public Student(String name, int age) {

		this.name = name;
		this.age = age;

	}
	
	@Override
	public int compareTo(Student o) {
		
		
		// 이름을 오름차순으로 정렬 내림차순으로 정렬시 this.머시기 뒤에 '-' 마이너스를 붙이면 바뀜
		// if(-this.name.compareTo(o.name)>0)
		
		if(this.name.compareTo(o.name)>0) {
			
			return -1;
			
			
		}
		
		else if(this.name.compareTo(o.name)<0) {
			
			return 1;
		}
		else {
			
			return 0;
		}
		
		
		
		
		
		/*
		// 나이가 많은 순서
		if(this.age > o.age) {
			return -1;
			
		} 
		
		else if(this.age < o.age) {
			
			return 1;
		} 
		
		else {
			
			return 0;
		}
		
		*/
		
		/* 나이가 적은순서
		if(this.age > o.age) {
			return 1;
			
		} 
		
		else if(this.age < o.age) {
			
			return -1;
		} 
		
		else {
			
			return 0;
		}
		
		*/
		// return this.name.compareTo(o.name);
		

	}

}

package chapter11.study1.equals;

import java.util.Objects;

public class Member {

	private String id;
	private int mileage;
	private String name;

	// Value Object (데이터를 저장하는 객체)

	public Member(String id, String name, int mileage) {
		super();
		this.id = id;
		this.mileage = mileage;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	
	
/*	@Override
	public boolean equals(Object obj) {
		if (this == obj) {

			return true;

		}

		if (!(obj instanceof Member)) {

			return false;

		}

		Member member = (Member) obj;

		if (this.id.equals(member.id) && this.name.equals(member.name)) {

			return true;

		}

		return false;

	}
*/
	
	
	
}

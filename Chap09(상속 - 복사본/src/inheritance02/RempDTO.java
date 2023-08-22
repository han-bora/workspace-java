package inheritance02;

public class RempDTO extends Employee {
	
	public RempDTO() {
		super();
	}
	
	public RempDTO(String name, int age, String phone, String empData, String dept) {
		super (name, age, phone, empData, dept);    //부모 생성자 호출
	
	}

}

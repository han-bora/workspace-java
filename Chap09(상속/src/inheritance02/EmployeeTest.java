package inheritance02;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RempDTO dto = new RempDTO();
		System.out.println(dto);
		
		
		//상속관계에서 초기화
		RempDTO dto2 = new RempDTO("이순신", 30, "010-1234-5678", "2023-07-01", "개발팀");
		System.out.println(dto2);

	}

}

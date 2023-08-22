package constructor03;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기본생성자호출
		
		Student student = new Student();
		System.out.println(student);
		
		System.out.println();
		
		//매개변수 두개 있는 생성자 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2);
		
		System.out.println();
		
		//매개변수 string형 하나 있는 생성자 호출
		Student student3 = new Student("신사임당");
		System.out.println(student3);
		
		System.out.println();
		
		//매개변수 int형 하나 있는 생성자 호출
		Student student4 = new Student(
				40);
		System.out.println(student4);
		
	
		

	}

}

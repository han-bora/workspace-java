package constructor;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student(); 
		System.out.println(student.showStudentInfo());
		
		
		Student student2 = new Student(202307, "이순신", 3);
		System.out.println(student2.showStudentInfo());
		
		
		
		

		
		
	}

}


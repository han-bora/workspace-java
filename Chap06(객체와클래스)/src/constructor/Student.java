package constructor;

public class Student {

	int studentId;
	String studentName;
	int grade;

	public Student() {
		System.out.println("기본생성자 호출");
	}

	public Student(int studentId, String studentName, int grade) {
		//생성자 초기화
		
		this.studentId=studentId;
		this.studentName=studentName;
		this.grade=grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentId + "이고," + grade + "학년 입니다.";
	}

}

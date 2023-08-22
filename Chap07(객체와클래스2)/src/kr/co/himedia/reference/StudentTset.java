package kr.co.himedia.reference;

public class StudentTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student(100, "이순신");
		student.setKoreaSubject("국어", 100);
		student.setMathSubject("수학", 80);
		student.showScore();

		Student student2 = new Student(200, "신사임당");
		student2.setKoreaSubject("국어", 90);
		student2.setMathSubject("수학", 80);
		student2.showScore();

	}

}

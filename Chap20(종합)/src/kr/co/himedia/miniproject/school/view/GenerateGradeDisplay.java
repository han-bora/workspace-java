
package kr.co.himedia.miniproject.school.view;

import java.util.ArrayList;

import kr.co.himedia.miniproject.school.School;
import kr.co.himedia.miniproject.school.Score;
import kr.co.himedia.miniproject.school.Subject;
import kr.co.himedia.miniproject.utils.Constant;

public class GenerateGradeDisplay {

	School school = School.getInstances();
	
	public static final String TITLE = "과목 학점 결과 >>> \n";
	public static final String LINE = "-------------------------------------------------------------\n";
	public static final String HEADER = "이름	 \t학번 \t필수	\t 점수 \t 학점\n";
	public static final String LINE2 = "=============================================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getDisplay() {
		ArrayList<Subject> subjects = school.getSubjects();
		
		for (Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			makefooter(subject);
		}
		
		return buffer.toString();
	}

	private void makefooter(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	private void makeBody(subject subject) {
		
		ArrayList<Student> students = subject.getStudents();
		for (int i = 0, i<students.size() i++) {
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			
			if(student.getStudentName().length() >= 6) {
				buffer.append("\t");
			}else {
				buffer.append("\t\t");
			}
			
			buffer.append(student.getStudnetId());
			buffer.append("\t");
			buffer.append(student.getMajorSubject().getSubjectName());
			GetScoreGrade(student, subject);
			
			buffer.append("\n";)
		}
	}
	
	private void GetScoreGrade(Student student, Subject subject) {
		ArrayList<Score> scoreList = student.getScores();
		int majorId = student.getMajorSuvject().getSubjectId();
		
		GradeEvalution[] gradeEvalutions = {new BasicEvalution(), new MajorEvalution()};
		
		for (int i =0; i<scoreList.size()); i++ {
			Score score = scoreList.get(i);
			
			if (score.getSubject().getSubjectId() == subject.getSubjectId()) {
				String grade;
				
				if (score.getSubject().getSubjectId()==majorId) {
					grade = gradeEvalutions[Constant.SAB_TYPE].getGrade(score.getScore());
				}else {
					grade=gradeEvalutions[Constant.AB_TYPE].getGrade(score.getScore());
				}
				buffer.append(score.getScore());
				buffer.append("\t");
				buffer.append(":");
				buffer.append("\t");
				buffer.append("grade");
				
				buffer.append("\n");
			}
			
		}
		
		
		
		
	}

	private void makeHeader(Subject subject) {
		buffer.append(subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.TITLE);
		buffer.append(GenerateGradeDisplay.LINE);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.LINE2);
	
		
	}
}
























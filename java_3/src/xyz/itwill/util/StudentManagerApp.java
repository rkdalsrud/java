package xyz.itwill.util;

import java.util.List;

public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager=new StudentManager();
		
		//저징매체ㅔㅇ 학생정보를 삽이바는 메소드 호툴
		manager.insertStudent(new Student(1000, "홍길동"));
		manager.insertStudent(new Student(2000, "임꺽정"));
		manager.insertStudent(new Student(3000, "전우치"));
		manager.insertStudent(new Student(4000, "일지매"));
		
		if (manager.insertStudent(new Student(5000,"장길산"))) {
			System.out.println("학생정보 삽입");
		} else {
			System.out.println("이미 저장된 학생정보임");
		}
		System.out.println("=============================");
		
		List<Student> studenList=manager.selectStudentList();
		
		for(Student student: studenList) {
			System.out.println(student);
		}
		System.out.println("=============================");
		
	}
}

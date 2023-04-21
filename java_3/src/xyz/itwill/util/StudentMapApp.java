package xyz.itwill.util;

import java.util.ArrayList;
import java.util.List;

public class StudentMapApp {
	public static void main(String[] args) {
		List<Student> studentListOne=new ArrayList<Student>();
		studentListOne.add(new Student(1000,"홍길동"));
		studentListOne.add(new Student(2000,"임꺽정"));
		studentListOne.add(new Student(3000,"전우치"));
		studentListOne.add(new Student(4000,"일지매"));
		studentListOne.add(new Student(5000,"장길산"));
		
		List<Student> studentsListTwo=new ArrayList<>();
		studentsListTwo.add(new Student(6000,"유재석"));
		studentsListTwo.add(new Student(7000,"강호동"));
		studentsListTwo.add(new Student(8000,"신동엽"));
		studentsListTwo.add(new Student(9000,"김용만"));
		
	}

}

package inhenitance;

//학생정보(학생번호, 학생이름, 수강과정)를 저장하기 위한 클래스
//=> 학생번호와 학생이름 관련 속성과 행위는 AcademyPerson 클래스를 상속받아 사용
public class AcademyStudent extends AcademyPerson {
	private String coures;
	
	public AcademyStudent() {
		// TODO Auto-generated constructor stub
	}

	public AcademyStudent(int num, String name, String coures) {
		super(num, name);
		this.coures = coures;
	}

	public String getCoures() {
		return coures;
	}

	public void setCoures(String coures) {
		this.coures = coures;
	}
	@Override
	public void display() {
		System.out.println("학생 번호 = "+getNum());
		System.out.println("학생 이름 = "+getName());
		System.out.println("수강 과목 = "+coures);
	}
}


/*public class AcademyStudent extends AcademyPerson {
	private String course;
	
	public AcademyStudent() {
		// TODO Auto-generated constructor stub
	}

	public AcademyStudent(int num, String name, String course) {
		super(num, name);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public void display() {
		System.out.println("학생번호 = "+getNum());
		System.out.println("학생이름 = "+getName());
		System.out.println("수강과정 = "+course);
	}
}
*/
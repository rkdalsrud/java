package xyz.itwill.util;

import java.util.Scanner;
import java.util.regex.Pattern;

//정규표현식(RegualarExpression) : 메타문자(Meta Character), 회피문자(Escape Character)등을
//사용하여 일정한 규칙의 문자열을 표현하는 방법 - 사용자 입력값에 대한 검증 
/*
^문자 : 문자(열)로 시작됨을 의미
문자$ : 문자(열)로 종료됨을 의미
. : 임의의 문자 하나를 의미(\ 문자는 표현 불가능)
[문자1문자2문자3] : 나열된 문자 중 하나를 의미
[^문자1문자2문자3] : 나열된 문자를 제외한 문자 중 하나를 의미
[문자1-문자2] : [문자1]에서 [문자2] 범위의 문자 중 하나를 의미
문자열1|문자열2|문자열3 : 나열된 문자열 중 하나를 의미
문자열+ : 문자열이 1번이상 반복됨을 의미 
문자열* : 문자열이 0번이상 반복됨을 의미 
문자열? : 문자열이 0번 또는 1번 존재함을 의미
문자열{숫자} : 문자열이 [숫자]만큼 반복됨을 의미
문자열{숫자1,숫자2} : 문자열이 [숫자1]부터 [숫자2] 범위만큼 반복됨을 의미
(?!)문자열 : 문자열에서 대소문자를 구분하지 않음을 의미
(?=문자열) : 문자열이 반드시 포함됨을 의미
(!=문자열) : 문자열이 반드시 포함되지 않음을 의미
*/

/*
\s : 공백이 있는 문자열을 의미
\S : 공백이 없는 문자열을 의미
\w : 영문자,숫자,특수문자(_)의 문자로만 구성된 문자열을 의미
\W : 영문자,숫자,특수문자(_)의 문자를 제외한 나머지 구성된 문자열을 의미
\d : 숫자 형태의 문자로만 구성된 문자열을 의미
\D : 숫자 형태의 문자를 제외한 문자로 구성된 문자열을 의미
\메타문자 : 메타문자을 일반문자로 표현됨을 의미 -  ex) \. : 문자 .
*/

//키보드로 사용자에게 값을 입력받아 형식에 맞는 값인지를 비교하여 출력하는 프로그램
// => 형식에 맞지 않는 값이 입력될 경우 에러 메세지 출력 후 프로그램 종료
public class RegualarExpressionApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*
		//사용자에게 아이디를 입력받아 형식에 맞는 값인지를 비교
		//아이디 형식(패턴) : 영문자로 시작되며 영문자,숫자,특수문자(_)의 조합으로 
		//6~20 범위의 문자들로 구성된 문자열 
		System.out.print("아이디 입력 >> ");
		String id=scanner.nextLine();
		
		if(id==null || id.equals("")){
		System.out.println("에러 아이디 다시 입력");
			System.exit(0);
		}
		//아이디 패턴을 정규표현식으로 표현하여 저장
		String idReg="^[a-zA-Z][a-zA-Z0-9_]\z{5,19}";//5~19 라고 한건 ^로 하나를 표현했기 떄문
		
		
		if(!Pattern.matches(idReg,id)) {
			System.out.println("아이디 형식에 안맞음");
			System.exit(0);
		}
		System.out.println("형식에 맞게 아이디 입력함");
		scanner.close();
		*/
		System.out.println("이메일 입력 >>");
		String email=scanner.nextLine();
		if(email==null || email.equals("") || email.equals("@")) {
			System.out.println("다시입력");
			System.exit(0);
		
		String emailReg="^([a-zA-Z0-9_-]+@)";
		
		}
	}
}
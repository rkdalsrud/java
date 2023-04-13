package realization;

public class JdbcApp {
	public static void main(String[] args) {
		/*
		JdbcMysql mysql=new JdbcMysql();
		
		mysql.delete();
		mysql.insert();
		mysql.select();
		mysql.update();
		*/
		
		//시스템 변경에 따른 클래스 교체시 메소드 호출 명령 변경
		/*
		JdbcOracle oracle=new JdbcOracle();
		
		oracle.add();
		oracle.modify();
		oracle.remove();
		oracle.serach();
		*/
		
		//Jdbc jdbc=new JdbcMysql();
		Jdbc jdbc=new JdbcOracle();
		
		jdbc.insert();
		jdbc.delete();
		jdbc.select();
		jdbc.update();
	}
}

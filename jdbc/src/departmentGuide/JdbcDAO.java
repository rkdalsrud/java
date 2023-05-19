package departmentGuide;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

public class JdbcDAO {
	private static PoolDataSource pds;
	
	static {
		//PoolDataSource 객체를 반환받아 필드에 저장
		pds=PoolDataSourceFactory.getPoolDataSource();
		try {
			//PoolDataSource 객체에 Connection 객체를 미리 생성하여 저장
			pds.setConnectionFactoryClassName("oracle.jdbc.driver.OracleDriver");
			pds.setURL("jdbc:oracle:thin:@www.itwill.xyz:1521:xe");
			pds.setUser("jdbc_team01");
			pds.setPassword("jdbc_team01");
			pds.setInitialPoolSize(15);
			pds.setMaxPoolSize(20);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//PoolDataSource 객체(DBCP 객체)에 저장된 Connection 객체 중 하나를 반환하는 메소드
	public Connection getConnection() {
		Connection con=null;
		try {
			con=pds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//매개변수로 JDBC 관련 객체를 전달받아 제거하는 메소드
	public void close(Connection con) {
		try {
			//Connection 객체 제거 : PoolDataSource 객체에게 다시 Connection 객체를 되돌려주는 기능 구현
			if(con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

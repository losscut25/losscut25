package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCUtil {
	//field
	String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
	String user = "scott";
	String password = "tiger";
	//method
	public Connection getConnection() {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		//1.JDBC Driver등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("1.JDBC Driver등록");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//2.연결 Connection얻기
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("2.연결Connection얻기-성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	// 커넥션반환
	public static void close(Connection conn) {
		try {
			if(conn!=null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection자원반납");
	}
	// PreparedStatement 반환
	public static void close(PreparedStatement stmt) {
		try {
		if(stmt!=null) {stmt.close();}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	// Statement 반환
	public static void close(Statement stmt) {
		try {
			if(stmt!=null) {stmt.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// ResultSet 반환
	public static void close(ResultSet rs) {
	try {
		if(rs!=null) {rs.close();}
		}
	 catch (SQLException e) {
		e.printStackTrace();
	 		}
		}
}
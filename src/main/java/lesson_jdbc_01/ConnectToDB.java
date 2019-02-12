package lesson_jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

import oracle.jdbc.driver.OracleDriver;

public class ConnectToDB {

	public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USER = "MA_STUDENT";
	public static final String PASS = "KOLOBOK";

	/**
	 * Get a connection to database
	 * 
	 * @return Connection object
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Locale.setDefault(Locale.ENGLISH);
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}

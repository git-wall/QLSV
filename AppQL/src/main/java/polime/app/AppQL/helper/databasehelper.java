package polime.app.AppQL.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class databasehelper {
	public static Connection openConnection() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionUrl = "jdbc:sqlserver://localhost;database=AppQL;";
		String username = "demo";
		String password = "123";
		Connection con = DriverManager.getConnection(connectionUrl, username, password);
		return con;
	}
}

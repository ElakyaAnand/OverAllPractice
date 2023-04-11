package must_know_Concepts_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Working_With_Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://root@localhost/selenium");
		Statement statement= connection.createStatement();
		ResultSet resultset=	statement.executeQuery("Select * from register");
		while(resultset.next())
		{
			System.out.println("The ID is " + resultset.getInt(1)+ " The Name is:" + resultset.getString(2));
		}

	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class MakeConnection {
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	MakeConnection()throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","ThendralM");
			statement = connection.createStatement();
			int i=statement.executeUpdate("create table task(empno integer,ename varchar(20),dept integer)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
	}

}

public class TestConnection {
	public static void main(String[] args) throws Exception{
		new MakeConnection();
	}
}

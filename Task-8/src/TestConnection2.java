import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class MakeConnection2 {
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	MakeConnection2() throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","ThendralM");
			statement = connection.createStatement();
			int i1=statement.executeUpdate("insert into task values(001,'Diana',236)");
			int i2=statement.executeUpdate("insert into task values(001,'charles',237)");
			int i3=statement.executeUpdate("insert into task values(001,'merlins',238)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
	}

}
public class TestConnection2 {
	public static void main(String[] args)throws Exception {
		new MakeConnection2();
	}
}

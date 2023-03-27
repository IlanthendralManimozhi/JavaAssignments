import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class MakeConnection3 {
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	MakeConnection3() throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","ThendralM");
			statement = connection.createStatement();
			resultSet=statement.executeQuery("select* from task");
			while(resultSet.next())
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		
	}

}
public class TestConnection3 {
	public static void main(String[] args) throws Exception{
		new MakeConnection3();
	}
}

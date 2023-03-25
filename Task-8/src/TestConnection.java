import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class MakeConnection {
	Connection con;
	Statement stmt;
	ResultSet rs;

	MakeConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","ThendralM");
			stmt = con.createStatement();
			int i=stmt.executeUpdate("create table task(empno integer,ename varchar(20),dept integer)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class TestConnection {
	public static void main(String[] args) {
		new MakeConnection();
	}
}

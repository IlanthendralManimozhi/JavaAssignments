import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class MakeConnection2 {
	Connection con;
	Statement stmt;
	ResultSet rs;

	MakeConnection2() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","ThendralM");
			stmt = con.createStatement();
			int i1=stmt.executeUpdate("insert into task values(001,'Diana',236)");
			int i2=stmt.executeUpdate("insert into task values(001,'charles',237)");
			int i3=stmt.executeUpdate("insert into task values(001,'merlins',238)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
public class TestConnection2 {
	public static void main(String[] args) {
		new MakeConnection2();
	}
}

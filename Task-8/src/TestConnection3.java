import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class MakeConnection3 {
	Connection con;
	Statement stmt;
	ResultSet rs;

	MakeConnection3() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","ThendralM");
			stmt = con.createStatement();
			rs=stmt.executeQuery("select* from task");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
public class TestConnection3 {
	public static void main(String[] args) {
		new MakeConnection3();
	}
}

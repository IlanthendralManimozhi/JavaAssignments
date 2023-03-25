import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * make connection create table insert the values
 * @author ilanthendralmanimozhi
 *
 */
class MakeConnection4 {
	Connection con;
	Statement stmt;
	ResultSet rs;

	MakeConnection4() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","ThendralM");
			stmt = con.createStatement();
			//int i=stmt.executeUpdate("create table COFFEES(COF_NAME varchar(20),SALES integer,TOTAL integer)");
			int i1=stmt.executeUpdate("insert into COFFEES values('Colobian',0,0)");
			int i2=stmt.executeUpdate("insert into COFFEES values('French_Roast',0,0)");
			int i3=stmt.executeUpdate("insert into COFFEES values('Espresso',0,0)");
			int i4=stmt.executeUpdate("insert into COFFEES values('Colobian_Decaf',0,0)");
			int i5=stmt.executeUpdate("insert into COFFEES values('French_Roast_Decaf',0,0)");
			rs=stmt.executeQuery("select* from COFFEES");
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class Transactionpairs {

    public static void main(String[] args) {
    	new MakeConnection4();
        String url="jdbc:mysql://localhost/acedb";//to get connection
        Connection con=null;
        Statement stm;
        PreparedStatement updateSales;
        PreparedStatement updateTotal;
        // to update values
        String updateString="update COFFEES set SALES=? where COF_NAME like ?";
        String updateStatement="update COFFEES set TOTAL=? where COF_NAME like ?";
        String query="select COF_NAME,SALES,TOTAL from COFFEES";
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","ThendralM");
            updateSales=con.prepareStatement(updateString);
            updateTotal=con.prepareStatement(updateStatement);
            int[] salesForWeek= {175,150,60,155,90};
            String[] coffees= {"Colobian","French_Roast","Espresso","Colobian_Decaf","French_Roast_Decaf"};
            int len =coffees.length;
            con.setAutoCommit(false);
            for(int i=0;i<len;i++) {
            	//update values
                updateSales.setInt(1, salesForWeek[i]);
                updateSales.setString(2, coffees[i]);
                updateSales.executeUpdate();
                updateTotal.setInt(1, salesForWeek[i]);
                updateTotal.setString(2, coffees[i]);
                updateTotal.executeUpdate();
            }
            con.commit();
            con.setAutoCommit(true);
            updateSales.close();
            updateTotal.close();
            stm=con.createStatement();
            ResultSet rs=stm.executeQuery(query);
            while(rs.next()) {
                String c=rs.getString("COF_NAME");
                int s=rs.getInt("SALES");
                int t=rs.getInt("TOTAL");
                System.err.println(c+" "+s+" "+t);
            }
            stm.close();
            con.close();
        } catch(SQLException ex) {
            ex.printStackTrace();
            if(con!=null) {
                try {
                    System.out.println("TRANSACTION BEING");
                    System.err.println("rolled back");
                    con.rollback();
                } catch (SQLException excep) {
                    excep.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

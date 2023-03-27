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
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	MakeConnection4() throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/acedb","root","ThendralM");
			statement = connection.createStatement();
			//int i=stmt.executeUpdate("create table COFFEES(COF_NAME varchar(20),SALES integer,TOTAL integer)");
			int i1=statement.executeUpdate("insert into COFFEES values('Colobian',0,0)");
			int i2=statement.executeUpdate("insert into COFFEES values('French_Roast',0,0)");
			int i3=statement.executeUpdate("insert into COFFEES values('Espresso',0,0)");
			int i4=statement.executeUpdate("insert into COFFEES values('Colobian_Decaf',0,0)");
			int i5=statement.executeUpdate("insert into COFFEES values('French_Roast_Decaf',0,0)");
			resultSet=statement.executeQuery("select* from COFFEES");
			while(resultSet.next())
				System.out.println(resultSet.getString(1)+" "+resultSet.getInt(2)+" "+resultSet.getInt(3));
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
	}

}

public class Transactionpairs {

    public static void main(String[] args) throws Exception{
    	new MakeConnection4();
        String url="jdbc:mysql://localhost/acedb";//to get connection
        Connection connection=null;
        Statement statement;
        PreparedStatement updateSales;
        PreparedStatement updateTotal;
        // to update values
        String updateString="update COFFEES set SALES=? where COF_NAME like ?";
        String updateStatement="update COFFEES set TOTAL=? where COF_NAME like ?";
        String query="select COF_NAME,SALES,TOTAL from COFFEES";
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,"root","ThendralM");
            updateSales=connection.prepareStatement(updateString);
            updateTotal=connection.prepareStatement(updateStatement);
            int[] salesForWeek= {175,150,60,155,90};
            String[] coffees= {"Colobian","French_Roast","Espresso","Colobian_Decaf","French_Roast_Decaf"};
            int len =coffees.length;
            connection.setAutoCommit(false);
            for(int i=0;i<len;i++) {
            	//update values
                updateSales.setInt(1, salesForWeek[i]);
                updateSales.setString(2, coffees[i]);
                updateSales.executeUpdate();
                updateTotal.setInt(1, salesForWeek[i]);
                updateTotal.setString(2, coffees[i]);
                updateTotal.executeUpdate();
            }
            connection.commit();
            connection.setAutoCommit(true);
            updateSales.close();
            updateTotal.close();
            statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(query);
            while(rs.next()) {
                String c=rs.getString("COF_NAME");
                int s=rs.getInt("SALES");
                int t=rs.getInt("TOTAL");
                System.err.println(c+" "+s+" "+t);
            }
            statement.close();
            connection.close();
        } catch(SQLException ex) {
            ex.printStackTrace();
            if(connection!=null) {
                try {
                    System.out.println("TRANSACTION BEING");
                    System.err.println("rolled back");
                    connection.rollback();
                } catch (SQLException excep) {
                    excep.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
			connection.close();
		}
    }
}

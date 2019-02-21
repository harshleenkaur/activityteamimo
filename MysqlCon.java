import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class MysqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");     //forName is for registering the driver
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","admin");
			 Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	 ResultSet rs = stmt.executeQuery("select * from customers ");
	 
	       rs.afterLast();                                   //points to the last record
	 
	 while(rs.previous())                                    //for traversing the data
	 {
		 System.out.println(rs.getInt(1)+ " " +rs.getString(2));
	 }
	 
	 System.out.println("*************************************************************");
	// rs.absolute(50);                                            //move to the 3rd record
	// System.out.println(rs.getInt(1)+ " " +rs.getString(2));
	 System.out.println("*************************************************************");
	 rs.relative(10);
	 System.out.println(rs.getInt(1)+ " " +rs.getString(2));
	 System.out.println("*************************************************************");
	 int i = rs.getRow();                                     //get cursor position
	 System.out.println("cursor position" +i);
	 
	 //cleanup
		 rs.close();     
		 stmt.close();  
		 con.close();//close the connection
		 
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }
			 
 }
	}

//by default this program is non scrollable(moves in forward direction)....(scrollable(both backward and forward) and non scrollable are the types of ResultSet

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con ;
		PreparedStatement pstmt;
		//Statement stmt;
		ResultSet rs;
		int cnt=0;
		String sqlUpdate;
		
		
		 try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");     //forName is for registering the driver
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","admin");
	
		    sqlUpdate = "UPDATE employees " + "Set jobtitle=?" + "where employeeNumber=?";
		    pstmt=con.prepareStatement(sqlUpdate);
		     //prepare data for update
		    
		    Scanner s = new Scanner(System.in);
		    		System.out.println("enter employeed id:");
		    int eid = s.nextInt();  //1702
		    System.out.println("enter new job title: ");
		    String strm = s.next(); //sales manager
		    pstmt.setString(1, strm);
		    pstmt.setInt(2,eid);
		    
		    int rowAffected = pstmt.executeUpdate();
		    System.out.println("row affected"+rowAffected);
		    strm ="Sales Head";
		    eid = 1370;
		    pstmt.setString(1, strm);
		    con.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Connection con;
     PreparedStatement pstmt;
     ResultSet rs;
     int cnt = 0;
     String sqlUpdate;
     
     try
     {
    	 Class.forName("com.mysql.cj.jdbc.Driver");     //forName is for registering the driver
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","admin");
    	 sqlUpdate = "UPDATE candidates " + "Set first_name=?" + "where id=?";
		    pstmt=con.prepareStatement(sqlUpdate);
		     //prepare data for update
		    Scanner sc = new Scanner(System.in);
    		System.out.println("enter candidate id:");
    int id = sc.nextInt();  
    sc.nextLine();
    System.out.println("enter candidate name:");
    String stm  = sc.next();  
    sc.nextLine();
    pstmt.setString(1, stm);
    pstmt.setInt(2,id);
    
    int rowChanged = pstmt.executeUpdate();
    System.out.println("row affected"+rowChanged);
    
    stm ="jean";
    id =2;
    pstmt.setString(1,stm);
    pstmt.setInt(2,id);
    rowChanged = pstmt.executeUpdate();
    System.out.println("row affected" +rowChanged);
    con.close();
 }
 catch(Exception e)
 {
	 System.out.println(e);
 }
}

}
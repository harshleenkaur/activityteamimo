import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		ResultSet rs;
		int cnt=0;
		
		 try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");     //forName is for registering the driver
			 Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/classicmodels","root","admin");
			 String str = "insert into offices values(8,'Bangalore','+91 650 219 3456','Mg Road','Utility Building','KA','India','56001','NA')";
			 stmt=con1.createStatement();
			 int rowcount=stmt.executeUpdate(str);
			if (rowcount >0)
{
	System.out.println("Recorded Inserted Successfully");
}
			 String str1 = "select count(officeCode) from offices";
			 rs=stmt.executeQuery(str1);
			 while(rs.next())
			 {
				 cnt=rs.getInt(1);
			 }
			 System.out.println("Total no of records : "+cnt);
			 con1.close();
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

}

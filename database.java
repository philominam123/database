import java.sql.*;
class database 
{
	public static void main (String[] args)
	{
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
		
		   String sql = "insert into employee values(22242, 'James Turner', 'Engineer', 50000)";

		   Statement st = con.createStatement();
		   int n = st.executeUpdate(sql);
		   String sqlQuery = "SELECT ename, job from employee where empno='2222'";
		   ResultSet resultSet = statement.executeQuery(sqlQuery);
		   
		   resultSet.close(); 
		   st.close();
		   con.close(); 

		   if(n==1)
		   {
		   	System.out.println("Record inserted");
		   }
		   else
		   {
		   	System.out.println("Record Not inserted");
		   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

import java.sql.*;

import org.mariadb.jdbc.Driver;
public class Insert {

	static final String DB_LINK = "jdbc:mariadb://localhost/ooplab";
	public static void main(String[] args) throws Exception{
		Connection con = null;
		try{
			new Driver();
			con=DriverManager.getConnection(DB_LINK,"root","vishu");
			Statement smt=con.createStatement();
			String sampleQuery = "Insert into student (RollNo,Name,Age) values (?,?,?)";
			PreparedStatement statement = con.prepareStatement(sampleQuery);
			statement.setString(1, "01");
			statement.setString(2, "Joseline");
			statement.setString(3, "23");
			 
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
			
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			con.close();
		}

	}

}

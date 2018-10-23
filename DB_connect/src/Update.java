import java.sql.*;

import org.mariadb.jdbc.Driver;
public class Update {

	static final String DB_LINK = "jdbc:mariadb://localhost/ooplab";
	public static void main(String[] args) throws Exception{
		Connection con = null;
		try{
			new Driver();
			con=DriverManager.getConnection(DB_LINK,"root","vishu");
			Statement smt=con.createStatement();
			String sampleQuery = "update student set Name=?, Age=?  where RollNo=?";
			PreparedStatement statement = con.prepareStatement(sampleQuery);
			statement.setString(1, "Joselin");
			statement.setString(2, "24");
			statement.setString(3, "1");
			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing student was updated successfully!");
			}
			
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			con.close();
		}

	}

}

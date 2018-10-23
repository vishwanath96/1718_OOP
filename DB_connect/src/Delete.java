import java.sql.*;

import org.mariadb.jdbc.Driver;
public class Delete {

	static final String DB_LINK = "jdbc:mariadb://localhost/ooplab";
	public static void main(String[] args) throws Exception{
		Connection con = null;
		try{
			new Driver();
			con=DriverManager.getConnection(DB_LINK,"root","vishu");
			Statement smt=con.createStatement();
			String sampleQuery = "delete from student where RollNo=?";
			PreparedStatement statement = con.prepareStatement(sampleQuery);
			statement.setString(1, "1");
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			}
			
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			con.close();
		}

	}

}

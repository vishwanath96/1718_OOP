import java.sql.*;
import org.mariadb.jdbc.Driver;
public class MainApp{

	static final String DB_LINK = "jdbc:mariadb://localhost/ooplab";
	public static void main(String[] args)  throws Exception {
		Connection con = null;
		try{
			new Driver();
			con=DriverManager.getConnection(DB_LINK,"root","vishu");
			Statement smt=con.createStatement();
			String sampleQuery = "Select * from student";
			ResultSet results = smt.executeQuery(sampleQuery);
			while(results.next()){
				System.out.println("--->" + results.getNString("RollNo") + "  " + results.getString(2));
			}
			
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			con.close();
		}

	}

}

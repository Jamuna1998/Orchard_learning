package JDBC;
import java.sql.*;

public class Test {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/worker_database", "root", "130698@Jam");
			Statement s=con.createStatement();
			ResultSet r=s.executeQuery("select * from worker");
			
			while(r.next()) {
				System.out.println(r.getString("ID") + " " + r.getString("first_name") + " " + r.getString("last_name") + " "
						+ r.getString("salary") + " " +r.getString("joining_date")+" "+ r.getString("department"));
				
			}
			con.close();
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}



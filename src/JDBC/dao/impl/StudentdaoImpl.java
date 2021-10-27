package JDBC.dao.impl;
import java.sql.*;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

//import com.Exception.SQLException.DatabaseConnectionFailedException;
import JDBC.Exception.StudentDaoException.StudentDaoException;
import JDBC.dao.Studentdao;
import JDBC.entity.Student;

public class StudentdaoImpl implements Studentdao{

	@Override
	public boolean insertStudentToDB(Student student) throws StudentDaoException {
		boolean isInserted=false;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "130698@Jam");
			String insertQuery="insert into Student values(?,?,?);";
			PreparedStatement ps =con.prepareStatement(insertQuery);
			
			ps.setString(1, student.getStudent_id());
			ps.setString(2, student.getStudent_name());
			ps.setString(3,student.getbranch());
			
			ps.execute();
			ps.close();
			con.close();
			isInserted=true;
			
		}
		catch(SQLException e) {
			throw new StudentDaoException("Error connection to DB");
		}
		return isInserted;
	}

	@Override
	public List<Student> getAllStudentsFromDB() {
		
		ArrayList<Student> students=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "130698@Jam");
			String selectQuery="select * from Student;";
			PreparedStatement ps=con.prepareStatement(selectQuery);
			
			ResultSet r=ps.executeQuery();
			while (r.next()) {   
                
               String id=r.getString("student_id");
               String name=r.getString("student_name");
               String branch=r.getString("branch");
               Student student=new Student(id,name,branch);
               students.add(student);
            }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return students;	
	}

}

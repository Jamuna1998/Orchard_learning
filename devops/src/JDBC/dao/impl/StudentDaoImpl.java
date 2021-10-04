package JDBC.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBC.dao.StudentDao;
import JDBC.entity.Student;
import JDBC.exception.StudentDoaException;
import JDBC.exception.StudentServiceException;

public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean insert(Student student) throws StudentDoaException{
		boolean insert=false;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			String inserQuery="insert into Student values(?,?,?);";
			PreparedStatement ps=con.prepareStatement(inserQuery);
			
			ps.setInt(1, student.getRollno());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getMarks());
			
			ps.execute();
			ps.close();
			con.close();
			insert=true;
		}
		catch(SQLException e) {
			throw new StudentDoaException("Error in DB");
		}
		
		return insert;
	}

	@Override
	public List<Student> getStudentsFromDb() throws StudentServiceException {
	ArrayList<Student> students=new ArrayList<>();
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
		String selectQuery="select * from Student;";
		PreparedStatement ps=con.prepareStatement(selectQuery);
		
		ResultSet r=ps.executeQuery();
		while(r.next()) {
			int rollno=r.getInt("rollno");
			String name=r.getString("name");
			int marks=r.getInt("marks");
			
			Student student=new Student(rollno,name,marks);
			students.add(student);		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return students;
	}

}

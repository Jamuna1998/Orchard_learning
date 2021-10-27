package JDBC.dao;

import java.util.List;

import JDBC.Exception.StudentDaoException.StudentDaoException;
import JDBC.entity.Student;

public interface Studentdao {

	boolean insertStudentToDB(Student student) throws StudentDaoException;
	List<Student> getAllStudentsFromDB();
}

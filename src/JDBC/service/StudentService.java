
package JDBC.service;

import java.util.List;

import JDBC.entity.Student;

import JDBC.Exception.StudentServiceException.StudentServiceException;

public interface StudentService {
	
	public boolean insertStudentToDB(Student student) throws StudentServiceException;
	List<Student> getAllStudentsFromDB() throws StudentServiceException;

}

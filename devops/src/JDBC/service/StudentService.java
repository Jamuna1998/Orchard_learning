package JDBC.service;

import java.util.List;

import JDBC.entity.Student;
import JDBC.exception.StudentServiceException;

public interface StudentService {

	public boolean insert(Student student) throws StudentServiceException;
	List <Student> getStudentsFromDb() throws StudentServiceException;
}

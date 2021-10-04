package JDBC.dao;

import java.util.List;

import JDBC.entity.Student;
import JDBC.exception.StudentDoaException;
import JDBC.exception.StudentServiceException;

public interface StudentDao {

	boolean insert(Student student) throws StudentDoaException;
	List <Student> getStudentsFromDb() throws StudentServiceException;

}

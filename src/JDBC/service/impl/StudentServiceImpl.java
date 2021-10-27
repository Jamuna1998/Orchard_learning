package JDBC.service.impl;

import java.util.List;


import JDBC.Exception.StudentDaoException.StudentDaoException;
import JDBC.Exception.StudentServiceException.StudentServiceException;
import JDBC.dao.Studentdao;
import JDBC.dao.impl.StudentdaoImpl;
import JDBC.entity.Student;
import JDBC.service.StudentService;

public class StudentServiceImpl implements StudentService{


private static Studentdao studentdao=new StudentdaoImpl();
	
	@Override
	public boolean insertStudentToDB(Student student) throws StudentServiceException {
		try {
			return studentdao.insertStudentToDB(student);		
			}
		catch(StudentDaoException e) {
			throw new StudentServiceException("Error in database");
		}
	
		
	}

	@Override
	public List<Student> getAllStudentsFromDB() throws StudentServiceException{
	
		return studentdao.getAllStudentsFromDB();
	
}
}

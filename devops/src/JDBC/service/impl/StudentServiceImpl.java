package JDBC.service.impl;

import java.util.List;

import JDBC.dao.StudentDao;
import JDBC.dao.impl.StudentDaoImpl;
import JDBC.entity.Student;
import JDBC.exception.StudentDoaException;
import JDBC.exception.StudentServiceException;
import JDBC.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private static StudentDao studentdao=new StudentDaoImpl();
	@Override
	public boolean insert(Student student) throws StudentServiceException{
		
		try {
			return studentdao.insert(student);
		} catch (StudentDoaException e) {
			e.printStackTrace();
			throw new StudentServiceException("Error connecting");
		
	}
	
	}
	@Override
	public List<Student> getStudentsFromDb() throws StudentServiceException {
		
		return studentdao.getStudentsFromDb();
		
		
		
	}
}

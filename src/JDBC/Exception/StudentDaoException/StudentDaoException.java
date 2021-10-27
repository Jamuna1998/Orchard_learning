package JDBC.Exception.StudentDaoException;

public class StudentDaoException extends Exception {

	String str;
	public StudentDaoException(String str) {
		this.str=str;
	}
	
	public String ToString(String str) {
		return str;
		
	}
}

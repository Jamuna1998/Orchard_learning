package JDBC.Exception.StudentServiceException;

public class StudentServiceException extends Exception {

	String str;
	public StudentServiceException(String str) {
		this.str=str;
	}
	
	public String ToString(String str) {
		return str;
		
	}
}

package JDBC.exception;

public class StudentServiceException extends Exception {

	private static final long serialVersionUID = 1L;
	String str;
	public StudentServiceException(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "StudentServiceException [str=" + str + "]";
	}
	

}

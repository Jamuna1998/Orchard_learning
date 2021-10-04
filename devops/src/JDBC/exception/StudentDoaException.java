package JDBC.exception;

public class StudentDoaException extends Exception {


	
	private static final long serialVersionUID = 1L;
	String str;
	
	
	public StudentDoaException(String str) {
		super();
		this.str = str;
	}


	@Override
	public String toString() {
		return "StudentDoaException [str=" + str + "]";
	}
	

}

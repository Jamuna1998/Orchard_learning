package JDBC.entity;

import java.util.Scanner;

public class Student {
	Scanner in=new Scanner(System.in);
	
	private String student_id;
	private String student_name;
	private String branch;
	public Student() {
		super();
	}
	
	public Student(String id,String name,String branch) {
		super();
		this.student_id=id;
		this.student_name=name;
		this.branch=branch;
	}
	
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public void setbranch(String branch) {

		this.branch = branch;
	}
	public String getStudent_id() {
		return student_id;
	}
	public String getStudent_name() {
	
		return student_name;
	}
	
	public String getbranch() {
		return branch;
	}
	
	
	

}

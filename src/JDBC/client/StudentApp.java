package JDBC.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import JDBC.Exception.StudentServiceException.StudentServiceException;
import JDBC.entity.Student;
import JDBC.service.StudentService;
import JDBC.service.impl.StudentServiceImpl;

public class StudentApp {
	
	
	private static StudentService ss=new StudentServiceImpl();	
	private static Student s=new Student();
	private static Scanner in=new Scanner(System.in);

	public static void main(String[] args) {
	
		
		Student student=getStudent();
		boolean isInserted=false;
		
		try {
		 isInserted = ss.insertStudentToDB(student);
		}
		 catch (StudentServiceException e) {
			
			System.out.println(e.getLocalizedMessage());
		}
		if(isInserted) {
			System.out.println("Data inserted successfully");
		}
		else {
			System.out.println("Error inserting");
		}
		
		List<Student> students=new ArrayList<Student>();
		
		try {
			students=ss.getAllStudentsFromDB();
		}
		catch (StudentServiceException e) {
			
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		displayStudents(students);
	
	}
	 private static void displayStudents(List<Student> students) {
		if(students!=null) {
			System.out.println("Student_Usn " + " Student_name "+" Student_branch ");
			for(Student st:students) {
				System.out.println(st.getStudent_id()+"\t\t"+st.getStudent_name()+ "\t\t" + st.getbranch());
			}
		}
		else {
			System.out.println("no data");
		}
		
	}

	static Student getStudent() {
		System.out.println("Enter student id");
		s.setStudent_id(in.nextLine());
		System.out.println("Enter student name");
		s.setStudent_name(in.nextLine());
		System.out.println("Enter student branch");
		s.setbranch(in.nextLine());
		
		return new Student(s.getStudent_id(),s.getStudent_name(),s.getbranch());
	}
}


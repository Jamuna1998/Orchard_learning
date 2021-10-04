package JDBC.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import JDBC.entity.Student;
import JDBC.exception.StudentServiceException;
import JDBC.service.StudentService;
import JDBC.service.impl.StudentServiceImpl;

public class StudentApp {
	
	private static StudentService ss=new StudentServiceImpl();
	private static Student s=new Student();
	private static Scanner in=new Scanner(System.in);

	public static void main(String[] args) {
		Student student= getStudent();
		
		boolean insert=false;
		
		try {
		
			insert=ss.insert(student);
		}
		catch(StudentServiceException e) {
			e.printStackTrace();
		}
		if(insert) {
			System.out.println("Student data inserted!!");
		}
		else {
			System.out.println("Error inserting Student data");
		}

	
	List <Student> students=new ArrayList<Student>();
	try {
		students=ss.getStudentsFromDb();	
		}
	catch(StudentServiceException e) {
		e.printStackTrace();
	}
	catch(Exception e1) {
		e1.printStackTrace();
	}
	displayStudents(students);

}
	private static void displayStudents(List<Student> students) {
		if(students!=null) {
			System.out.println("student details");
			for(Student st:students) {
				System.out.println(st.getRollno()+st.getName()+st.getMarks());
			}
		}
		else {
			System.out.println("No data to display");
		}
		
	}
	private static Student getStudent() {
		s.setRollno(in.nextInt());
		s.setName(in.next());
		s.setMarks(in.nextInt());
		
		return new Student(s.getRollno(),s.getName(),s.getMarks());
		
	}

}

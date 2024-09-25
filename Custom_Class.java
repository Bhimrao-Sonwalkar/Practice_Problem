package Java8_InterviewProblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * problem ::
 * 
 * Find out how many girls got more than 60 marks in 5th standard using stream api
 * 
 * Input::
 * new Student("G1",65,"Fifth","Female"),
 * new Student("G2",70,"Sixth","Female"),
 * new Student("B1",64,"Fifth","Male"),
 * new Student("B2",69,"Fifth","Male"),
 * new Student("G3",75,"Fifth","Female"),
 * new Student("G4",50,"Tenth","Female");
 * 
 * Output:: 
 * Count of girls :: 2
 * 
 * Student [Name=G1,Marks=65,standard="fifth",gender=Female],
 * Student [Name=G3,Marks=75,standard="fifth",gender=Female] 
 * 
 * 
 * 
 * 
 */




public class Custom_Class {
	
	public static void main(String[]args) {
		
		List<student>list=Arrays.asList(new student("G1",65,"Fifth","Female"),
				  new student("G2",70,"Sixth","Female"),
				  new student("B1",64,"Fifth","Male"),
				  new student("B2",69,"Fifth","Male"),
				  new student("G3",75,"Fifth","Female"),
				  new student("G4",50,"Tenth","Female"));
		
		List<student>filterlist=list.stream().filter(e->e.getStandard().equalsIgnoreCase("Fifth") && e.getGender().equalsIgnoreCase("Female")).filter(e->e.getMarks()>60).collect(Collectors.toList());
		
		long count=filterlist.stream().count();
		
		System.out.println("Count of girls::"+count);
		filterlist.forEach(System.out::println);
	}
	
	

}


class student{
	
	private String name;
	private int marks;
	private String standard;
	private String gender;
	
	public student() {
		// TODO Auto-generated constructor stub
	}

	public student(String name, int marks, String standard, String gender) {
		super();
		this.name = name;
		this.marks = marks;
		this.standard = standard;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + ", standard=" + standard + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
}
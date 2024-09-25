package Java8_InterviewProblem;

import java.util.stream.Collectors;
import java.util.*;

/*
 * Question:: Find the Average salary of each department using stream APIS
 */

class EmployeDetails
{
	
	private String name;
	private String deparment;
	private double salary;
	
	public EmployeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeDetails(String name, String deparment, double salary) {
		this.name = name;
		this.deparment = deparment;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeDetails [name=" + name + ", deparment=" + deparment + ", salary=" + salary + "]";
	}
	
}

public class AverageSalaryOFEachDepartment {
	
	/*
	 * Question:: Find the Average salary of each department using stream APIS
	 */
	
	public static void main(String[]args) {
		
		List<EmployeDetails>employe=Arrays.asList(
				new EmployeDetails("Alice","HR",50000),
				new EmployeDetails("Bob","IT",60000),
				new EmployeDetails("Charlie","HR",70000),
				new EmployeDetails("David","IT",75000 ),
				new EmployeDetails("Eve","Finance",80000),
				new EmployeDetails("Frank","Finance",85000));
		
		Map<String, Double> averageSalary = employe.stream().
				collect(Collectors.groupingBy
						(EmployeDetails::getDeparment,
								Collectors.averagingDouble(EmployeDetails::getSalary)));
		
		averageSalary.forEach((deparment,avgsalary)->
		{
			System.out.println("Deparment::"+deparment+", Average salary ::"+avgsalary);
		});
		}
		
		
	
		
		
		
		
	}



class Employee
{
	int empID;
	String name;
	int salary;
	
	public Employee(int empID, String name , int salary){
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	
	//setters
	public void setID(int empID){
		this.empID = empID;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	//getters
	public int getID(){
		return empID;
	}
	public String getName(){
		return name;
	}
	public int getsalary(){
		return salary;
	}
}

public class TestEmployee{
	public static void main(String [] args)
	{
		Employee E1 = new Employee(213 , "Shikar" , 43000);
		Employee E2 = new Employee(543 , "Aslif" ,35000);
		
		System.out.println("The employee details are: " + "Employee ID was " +E1.getID() + ", name of the employee was " + E1.getName());
		System.out.println("The employee details are: " + "Employee ID was " +E2.getID() + ", name of the employee was " + E2.getName());
	}
}
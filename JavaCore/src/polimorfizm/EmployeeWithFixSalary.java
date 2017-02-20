package polimorfizm;

public class EmployeeWithFixSalary implements Salary{

	public int salary() { 
		System.out.print("Salary of emoloyee with fix rate: ");
		return 45*40;
	}
	
	

}

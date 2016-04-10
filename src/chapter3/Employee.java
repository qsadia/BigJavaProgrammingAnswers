package chapter3;

/**
 * @author mahfuzs
 *
 */
public class Employee {
	
	public String name;
	public double salary;
	
	/**
	 * Constructs an employee with name and salary.
	 * @param employeeName
	 * @param currentSalary
	 */
	public Employee(String employeeName, double currentSalary) {
		this.name = employeeName;
		this.salary = currentSalary;
	}

	/**
	 * Raise salary by a percentage.
	 * @param byPercent
	 */
	public void raiseSalary(double byPercent) {
		this.salary = this.salary + this.salary * byPercent;	
	}
	
	/**
	 * Returns employee name.
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns current salary.
	 * @return salary
	 */
	public double getSalary() {
		return this.salary;
	}	
	
}

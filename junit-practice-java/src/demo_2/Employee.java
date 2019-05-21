package demo_2;

public class Employee {
	
	private double monthlySalary;
	private String name;
	private int age;
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(double monthlySalary, String name, int age) {
		super();
		this.monthlySalary = monthlySalary;
		this.name = name;
		this.age = age;
	}
	public Employee() {
		super();
	}
	
	

}

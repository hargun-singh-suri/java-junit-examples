package demo_2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestEmployeeService {
	
	Employee employee = new Employee();
	EmployeeService employeeServiceOne = new EmployeeServiceImpl();

	@Test
	public void testCalculateYearlySalary() {
		employee.setAge(28);
		employee.setMonthlySalary(10000);
		employee.setName("Hargun");
		double yearlySalary = employeeServiceOne.calculateYearlySalary(employee);
		System.out.println("Calculate Yearly salary");
		assertEquals(10000*12, yearlySalary, 0.0);
	}

	@Test
	public void testCalculateYearlyAppraisal() {
		employee.setAge(28);
		employee.setMonthlySalary(10000);
		employee.setName("Hargun");
		double yearlyAppraisal = employeeServiceOne.calculateYearlyAppraisal(employee);
		System.out.println("Calculate Yearly appraisal");
		assertEquals(500, yearlyAppraisal, 0.0);
	}
}

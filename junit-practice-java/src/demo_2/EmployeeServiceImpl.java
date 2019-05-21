package demo_2;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public double calculateYearlySalary(Employee empDetails) {
		double yearlySalary = 0;
		yearlySalary = empDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}

	@Override
	public double calculateYearlyAppraisal(Employee empDetails) {
		double yearlyAppraisal = 0;

		if (empDetails.getMonthlySalary() >= 10000) {
			yearlyAppraisal = 500;
		} else {
			yearlyAppraisal = 1000;
		}

		return yearlyAppraisal;
	}

}

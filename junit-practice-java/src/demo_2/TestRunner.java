package demo_2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

	public static void main(String args[]) {

		Result result = JUnitCore.runClasses(TestEmployeeService.class);
		result.getFailures().forEach(fail -> System.out.println(fail.toString()));
		System.out.println(result.wasSuccessful());

	}

}

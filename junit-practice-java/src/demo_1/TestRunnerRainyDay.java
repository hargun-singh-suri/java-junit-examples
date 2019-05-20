package demo_1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunnerRainyDay {

	public static void main(String args[]) {
		/*
		 * # Use runClasses method of JUnitCore class of JUnit to run the test case of
		 * the created test class.
		 */
		/* # Get the result of test cases run in Result Object. */
		Result result = JUnitCore.runClasses(TestMessageUtilRainyDay.class);

		/* # Get failure(s) using the getFailures() method of Result object. */
		result.getFailures().forEach(failure -> System.out.println(failure.toString()));

		/* # Get Success result using the wasSuccessful() */
		System.out.println(result.wasSuccessful());
	}
}

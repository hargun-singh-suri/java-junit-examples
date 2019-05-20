package demo_1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMessageUtilRainyDay {

	String message = "Hello World";

	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		message = "Tweaking The Value";
		assertEquals(message, messageUtil.printMessage());
	}

}

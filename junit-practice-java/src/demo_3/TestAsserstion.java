package demo_3;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestAsserstion {
	
	@Test
	public void testAssestions() {
		
		/*Test data*/
		String stringOne = new String("Hargun");
		String stringTwo = new String("Hargun");
		String stringThree = "suri";
		String stringFour = "suri";
		String stringFive = null;
		
		int valOne = 12;
		int valTwo = 13;
		
	    String[] expectedArray = {"one", "two", "three"};
	    String[] resultArray =  {"one", "two", "three"};
	    
	   //Check that two objects are equal
	    System.out.println("two objects are equal");
	    assertEquals(stringOne, stringTwo);
	    
	   //Check that a condition is true
	    System.out.println("condition is true");
	    assertTrue(valOne < valTwo);
	    
	   //Check that a condition is false
	    System.out.println("condition is false");
	    assertFalse(valOne > valTwo);
	    
	   //Check that an object isn't null
	    System.out.println("object isn't null");
	    assertNotNull(stringOne);
	    
	   //Check that an object is null
	    System.out.println("object is null");
	    assertNull(stringFive);
	    
	   //Check if two object references point to the same object
	    System.out.println("references point to the same object");
	    assertSame(stringThree,stringFour);
	    
	   //Check if two object references not point to the same object
	    System.out.println("object references not point to the same object");
	    assertNotSame(stringThree,stringOne);
	    
	   //Check whether two arrays are equal to each other
	    System.out.println("two arrays are equal to each other");
	    assertArrayEquals(expectedArray,resultArray);

	}
}

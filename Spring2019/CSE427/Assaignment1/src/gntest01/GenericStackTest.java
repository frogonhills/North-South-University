package gntest01;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenericStackTest {

	@Test
	public void isEmpty_test() {
		Stack<String> myStringStack = new Stack<String>();
		
		
		
		
		boolean s = myStringStack.isEmpty();
		assertEquals(true , s);
		assertTrue(s);
		
		myStringStack.push("alif");
		myStringStack.push("shifat");
		
		boolean p = myStringStack.isEmpty();
		assertEquals(false , p);
		assertFalse(p );
		myStringStack.empty();
		
		assertEquals(true , s);
		assertTrue(s);
		
	}
	
	public void push_test(){
		Stack<String> myStringStack = new Stack<String>();
		
		
		int br = myStringStack.push(null);
		assertEquals(1 , br);
		
		br = myStringStack.push("rahim");
		assertEquals(0 , br);
		
		
	}

	

}

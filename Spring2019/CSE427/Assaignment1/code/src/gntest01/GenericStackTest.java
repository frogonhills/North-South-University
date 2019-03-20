package gntest01;



import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



import static org.junit.Assert.*;



public class GenericStackTest {

	
	
	
	/// isEmpty() -> if its empty 
	/// pop() -> pop item from Stack
	/// push(item) -> push item in Stack
	/// empty(empty) -> make the Stack Empty
	/// getSize() -> Size of stack
	
	
	
	
	
	
	
	Stack<Integer> poptest = new Stack<Integer>();
	Stack<String> myStringStack = new Stack<String>();
	Stack<Integer> evm = new Stack<Integer>();
	Stack<Double> dvm = new Stack<Double>();
	Stack<Float> ft = new Stack<Float>();
	
	
	
	
	
	
	
	
	
	
	public static int[] intArray = { 1, 3, 4 , 5 , 22 , 0 , 44,1001 , -23 , 76  }; /// 10 elements
	public static String[] stringArray = { "AUG", "M24", "ShotGun" , "Vector" , "M-416", "UZI" , "AKM","SCAR-L" ,"KAR-98" , "ump-9" , null }; /// 11 elements
	public static double[] doubleArray = { 1.1, 3.3, 4 , 5.5  , 22.66, 0 , 44,1001 , -23 , 76 , 11 }; /// 10 elements
	public static Float[] floatArray =  { 1.3f, 3.6f, 4.6f , 5.1f , 22.3f, 0.1f , 44.4f , null ,1001.3f , -23.6f , 76.3f  }; /// 10 elements
	
	
	
	@Test
	public void isEmpty_test() {
		
		
		
		
		
		
		
		
		
		
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
		
		
		
		
		
		
		
		
		assertTrue(myStringStack.isEmpty());
		assertTrue(evm.isEmpty());
		assertTrue(dvm.isEmpty());
		assertTrue(ft.isEmpty());
		
		
		
		
		
		
		
		for(int i = 0 ; i<stringArray.length;i++){
			myStringStack.push(stringArray[i]);
		}
		for(int i = 0 ; i<intArray.length;i++){
			evm.push(intArray[i]);
		}
		for(int i = 0 ; i<doubleArray.length;i++){
			dvm.push(doubleArray[i]);
		}
		for(int i = 0 ; i<floatArray.length;i++){
			ft.push(floatArray[i]);	
		}
		
		
		
		
		
		
		assertFalse(myStringStack.isEmpty());
		assertFalse(evm.isEmpty());
		assertFalse(dvm.isEmpty());
		assertFalse(ft.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
		
		
		
		
	
	@Test
	public void pop_test(){
		
		
		poptest.push(14);
		assertFalse(poptest.isEmpty());
		assertEquals(poptest.peek() , poptest.pop());
		assertTrue(poptest.isEmpty());
		
		
		
		evm.push(100);
		assertEquals(evm.peek() , evm.pop());
		
		

		for(int i = 0 ; i<stringArray.length;i++){
			myStringStack.push(stringArray[i]);
			assertEquals(myStringStack.peek() , myStringStack.pop());
		}
		
		
		for(int i = 0 ; i<intArray.length;i++){
			evm.push(intArray[i]);
			assertEquals(evm.peek() , evm.pop());
		}
		
		
		for(int i = 0 ; i<doubleArray.length;i++){
			dvm.push(doubleArray[i]);
			assertEquals(dvm.peek() , dvm.pop());
		}
		
		
		for(int i = 0 ; i<floatArray.length;i++){
			ft.push(floatArray[i]);	
			assertEquals(ft.peek() , ft.pop());
		}
		
		
		
		
		
		
		
		
		
		
		
		///
		for(int i = 0 ; i<stringArray.length;i++){
			myStringStack.push(stringArray[i]);
		}
		
		for(int i = 9  ; i>stringArray.length;i--){
			assertEquals(myStringStack.peek() , stringArray[i]);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	@Test
	public void push_test(){
		
		
		
		
		
		
		
		
		myStringStack.push("alif");
		assertEquals(myStringStack.peek(), "alif");
		myStringStack.empty();
		
		
		
		
		
		for(int i = 0 ; i<stringArray.length;i++){
			myStringStack.push(stringArray[i]);
		}
		assertEquals(myStringStack.getSize(),stringArray.length);
		
		
		
		
		for(int i = 0 ; i<intArray.length;i++){
			evm.push(intArray[i]);
		}
		assertEquals(evm.getSize(),intArray.length);
		
		
		
		for(int i = 0 ; i<doubleArray.length;i++){
			dvm.push(doubleArray[i]);
		}
		assertEquals(dvm.getSize(),doubleArray.length);
		
		
		
		for(int i = 0 ; i<floatArray.length;i++){
			ft.push(floatArray[i]);
		}
		assertEquals(ft.getSize(),floatArray.length);
		
		
		
		
		
		
		
		
		int null_push_check = myStringStack.push(null);
		assertEquals(1 , null_push_check);
		
		null_push_check = myStringStack.push("rahim");
		assertEquals(0 , null_push_check);
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	@Test
	public void nullTest(){
		
		
		assertEquals(myStringStack.peek(), null);
		assertEquals(myStringStack.getSize(), 0);
		
		
		
		myStringStack.push("hdd");
		myStringStack.push("ssd");
		myStringStack.pop();
		myStringStack.pop();
		
		
		
		assertEquals(myStringStack.peek(), null);
		assertEquals(myStringStack.getSize(), 0);
		
		
		
		
		int br = myStringStack.push(null);
		assertEquals(1 , br);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void SizeTest(){
		
		assertEquals(evm.getSize(),0);
		evm.push(1);
		evm.push(77);
		assertEquals(evm.getSize(),2);
		
	}
	

	

}

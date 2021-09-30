package A01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Stacktest {

	private Stack stack;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
@Before
public void init() {
	stack = new Stack(); //create new stack.
	
	
}
	@Test
	public void test100() {
		stack.push(0);
		stack.push(1);
		
		assertEquals(2,stack.getSize());
		
	}

	
	@Test
	public void test102(){
	stack.push(3);
	stack.push(10);
	stack.push(5);
	assertEquals(5,stack.top());
	}
	
	
	@Test
	public void test103(){
	stack.push(6);
	stack.push(101);
	stack.push(501);
	stack.pop();
	stack.pop();
	assertEquals(6,stack.top());
	}
	
	
	@Test
	public void test104() {
		stack.push(-1);
		stack.push(10012);
		stack.pop();
		stack.pop();
		stack.pop();
		
	}
		
	@Test
	public void test105() {
		
		stack.top();
			
	}
	
	@Test
	public void test106() {
		try {
			
			stack.push(-13948);
		}
		catch(Exception e){
			fail("Test Failed");
			System.out.println(e);
		}
		
		
		
	}
	
	@Test
	public void test107() {
		
		for(int i=0;i<10000;i++) {
			
			stack.push(i);
		}
		assertEquals(10000,stack.getSize());
		
		
	}
	
	@Test
	public void test108() {
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.pop();
		stack.pop();
		assertEquals(3, stack.pop());
		
	}
	
	
	
	
	
	@Test
	public void test109() {
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(0);
		stack.pop();
		stack.pop();
		boolean notEmpty = false;
		if(stack.top()!=-1) {
			notEmpty=true;
		}
		assertTrue(notEmpty);
	}
	@Test
	public void test110() {
		boolean notEmpty = false;
		//stack.display();
		
		if(stack.top()!=-1) {
			notEmpty=true;
		}
		assertFalse(notEmpty);
	}
	
	@Test
	public void test111() {
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(0);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		assertEquals(-1,stack.top());
	}
	
	
	@Test
	public void test112() {
		stack.push(5);
		stack.push(4);
		stack.pop();
		stack.push(3);
		stack.push(2);
		stack.pop();
		stack.push(1);
		stack.push(0);
		stack.pop();
		stack.push(8);
		stack.push(10);
		stack.pop();
		String result = new String();
		for(int i = 0; i<stack.getSize(); i++)
		result = result + stack.pop()+" ";
		result = result + Integer.toString(stack.getSize());
		System.out.println(result);
		assertEquals("8 1 2", result);
		
	}
	
	
	@Test
	public void test113() {
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(1,stack.head.next.next.key);
		assertEquals(2,stack.head.next.key);
	}
	
	}
package A01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Queuetest {

	
	private Queue queue;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void init() {
		
		queue = new Queue();
	}

	@Test
	public void test100() {
		queue.enqueue(5);
		queue.enqueue(6);
		assertEquals(5,queue.head.key);
	}
	
	@Test
	public void test101() {
	queue.enqueue(5);
	queue.enqueue(6);
	queue.dequeue();
	assertEquals(6,queue.head.key);
	}
	
	@Test
	public void test102() {
		
		
		queue.enqueue(503);
		queue.dequeue();
		queue.dequeue();
		//Exception expected
	}
	
	@Test
	public void test103() {
		for(int i=0;i<10000;i++) {
			queue.enqueue(i);
		}
		assertEquals(0,queue.head.key);
		
	}
	
	@Test
	public void test104() {
		for(int i=0;i<10000;i++) {
			queue.enqueue(i);
		}
		assertEquals(10000,queue.size);
	}
	
	@Test
	public void test105() {
		
		for(int i=0;i<1000;i++) {
			queue.enqueue(i);
		}
		
		for(int i=0;i<999;i++) {
			queue.dequeue();
		}
		
		assertEquals(999,queue.head.key);
	}
		
	
	@Test
	public void test106() {
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(3);
		queue.display();
		queue.enqueue(8);
		queue.dequeue();
		
		assertEquals(3,queue.size);
		assertEquals(1,queue.head.key);
	}
	
	
	@Test
	public void test107() {
		
		queue.enqueue(1);
		
		
		assertNotNull(queue.head);
		
	}
	
	@Test
	public void test108() {
		
		for(int i=0;i<1000;i++) {
			queue.enqueue(i);
		}
		int[] array=new int [1000];
		
		
		
		for(int i=0;i<1000;i++) {
			array[i]=queue.head.key;
			queue.head=queue.head.next;
			
		}
		for(int i=0;i<1000;i++) {
		assertEquals(array[i],i);
		}
			
		}
		
		@Test
		public void test109() {
			
			for(int i=0;i<1000;i++) {
				queue.enqueue(i);
			}
			Queue.Node temp = queue.head;
			
			for(int i=0;i<1000;i++) {
				assertEquals(i,temp.key);
				temp=temp.next;
				
			}
		
		
	}
		
		@Test
		public void test110() {
			assertEquals(-1,queue.dequeue());
			queue.enqueue(3);
			assertEquals(3,queue.dequeue());
			
		}

}

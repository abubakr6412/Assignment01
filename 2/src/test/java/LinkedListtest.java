

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;

import org.junit.runners.AllTests;
import org.junit.runners.MethodSorters;



public class LinkedListtest {
	private LinkedList list;
	
	@Before
	public void init() {
		
		list=new LinkedList(); 
		
	}

	//-----------------------------------------
	@Test
	public void inputTest100() {

		

		try {
				list.pushFront(250);
				list.pushBack(376);
				
				assertEquals(250,list.head.key);
				
			}
			
			catch(Exception e){
				System.out.println(e);
			}
	
	}
	
	@Test
	public void inputTest101() {

		

		try {
				list.pushFront(250);
				list.pushFront(376);
				list.pushFront(234);
				list.pushFront(423);
				list.display();
				
				assertEquals(234,list.head.next.key);
				//list.deleteList();
			}
			
			catch(Exception e){
				System.out.println(e);
			}
		
	}
	
	@Test
	public void inputTest103() {
		
		

		try {
				list.pushBack(250);
				list.pushFront(376);
				list.pushBack(441);
				list.pushFront(123);
				list.display();
				
				assertEquals(441,list.head.next.next.next.key);
				
			}
			
			catch(Exception e){
				System.out.println(e);
			}
		
	}
	
	
	@Test
	public void inputTest104() {
		
		

		try {
				list.pushBack(10);
				
				assertEquals(10,list.head.key);
				
			}
			
			catch(Exception e){
				System.out.println(e);
			}
		
	}
	
	
	@Test
	public void inputTest105() {
		

		try {
				list.pushBack(10);
				list.popBack();
				assertEquals(null,list.head);
				
			}
			
			catch(Exception e){
				System.out.println(e);
			}
		
		
	}
	
	@Test
	public void inputTest106() {
		
		list.pushFront(0);
		list.pushFront(2);
		list.popFront();
		
		assertEquals(0,list.head.key);
				
				
			
			
			
		
		
	}
	@Test
	public void inputTest107() {
		
		
				
		 assertNotNull(list);
			
			
		
		
	}
	
	@Test
	public void inputTest108() {
		
		
				
		
		list.pushFront(0);
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pop(0);
		
		assertEquals(3,list.head.key);
			
		
		
	}
	
	@Test
	public void inputTest109() {
		
		
				
		
			
		list.pushBack(0);	
		list.pushBack(1);	
		list.pushBack(2);	
		list.pushBack(3);	
		list.popBack();
	
		assertEquals(2,list.head.next.next.key);
		
		
	}
	
	
	
	@Test
	public void inputTest110() {
		
		
				
		 //list.popFront();
		 //list.popBack();
			
		list.pushBack(0);	
		list.pushBack(1);	
		list.pushBack(2);	
		list.pushBack(3);	
		list.pop(2);
		list.display();
		assertEquals(1,list.head.next.key);
		
		
	}
	
	@Test
	public void inputTest111() {
		
		
	
			
		list.pushBack(0);	
		list.pushBack(1);	
		list.pushBack(2);	
		list.pushBack(3);	
		list.pop(4);
		
		
		
	}
	
	@Test
	public void inputTest112() {
		
		
				
		 list.popFront();
		 list.popBack();
		 list.pop(0);
			
		
		
		
		
	}
	
	 //list.popFront();
	 //list.popBack();
	
	//-------------------------------
	}
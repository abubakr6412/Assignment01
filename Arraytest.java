package A01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Arraytest{
	
	private Array array;
	@Before
	public void init() {
		array = new Array(); //create an array
	}

	@Test
	public void test100()
	{
		Array array = new Array();
		Array.insert(1,0);
		Array.insert(2,2);
		Array.insert(3,3);
		Array.insert(4,4);
		Array.display();
	}

        @Test
        public void test101()
	{
		Array array = new Array();
		Array.insert(100,0);
		Array.insert(102,1);
		Array.insert(103,2);
		Array.insert(104,3);
		
		Array.delete(2);
                Array.delete(3);
                assertFalse(Array.linearSearch(3));
	}

        @Test 
        public void test102()
	{
		Array array = new Array();
		
		Array.insert(0,0);
		Array.insert(1,1);
		Array.insert(2,-1);
		System.out.println("NullPointerException");	
	}

        @Test
        public void test103()
	{
		Array array = new Array();
		Array.insert(0,0);
		Array.insert(1,1);
		Array.insert(2,101);
     	System.out.println("NullPointerException");
		
	}

        @Test
        public void test104()
	{
		Array array = new Array();
		Array.insert(100,0);
		Array.insert(102,1);
		Array.insert(103,2);
		Array.insert(104,3);
		
		Array.delete(1);
                assertTrue(Array.linearSearch(1));
	}

        @Test
        public void test105()
	{
		Array array = new Array(); 
		Array.insert(50,0);
		Array.insert(55,1);
		assertTrue(Array.linearSearch(55));
	
	}

        @Test
        public void test106()
	{
		Array array = new Array();
		Array.insert(10,0);
		Array.insert(17,1);
		Array.insert(3,2);
		Array.insert(20,3);
		Array.bubbleSort();
		
		int[] arr = {3,10,17,20};
		assertArrayEquals(Array.array,arr);
	}

        @Test
        public void test107()
	{
		Array array = new Array();
		Array.insert(10,0);
		Array.insert(17,1);
		Array.insert(3,2);
		Array.insert(20,3);
		Array.bubbleSort();
		
                boolean bool = false;
		int[] newarr = {3,10,17,20};
		
                for(int i = 0; i < array.size;i++)
                 {
                      if(Array.array[i] == newarr[i])
                      {
                          bool = true;
                      }
                 }
	}

        @Test
        public void test108()
	{
		Array array = new Array();
		Array.insert(10,0);
		Array.insert(15,1);
		Array.insert(11,2);
		Array.insert(14,3);
		assertTrue(Array.binarySearch(11, 0, array.size));
	}

       @Test
       public void test109()
	{
		Array array = new Array();
		Array.insert(-1,0);
		Array.insert(-2,1);
		Array.insert(-3,2);
		Array.insert(-2,3);
		assertTrue(Array.binarySearch(-1, 0, 4));
	}

       @Test
       public void test110()
	{
		Array array = new Array();
		Array.insert(-1,0);
		Array.insert(-2,1);
		Array.insert(-3,2);
		Array.insert(-2,3);
		assertTrue(Array.binarySearch(-1, 0, 4));
	}

        @Test
        public void test111()
	{
		Array array = new Array();
		Array.insert(20,0);
		Array.insert(33,1);
		Array.insert(12,2);
                Array.insert(10,3);
                Array.insert(5,4);
                Array.insert(43,5);
		
		for(int i = 0; i < array.size; i++)
		{
		    if(Array.array[i] == 10)
		    {
		       assertEquals(10,Array.array[i]);
		    }
		}
	
	}

}

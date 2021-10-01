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
		
		array.insert(1,0);
		array.insert(2,2);
		array.insert(3,3);
		array.insert(4,4);
		array.display();
	}

        @Test
        public void test101()
	{
		
		array.insert(100,0);
		array.insert(102,1);
		array.insert(103,2);
		array.insert(104,3);
		
		array.delete(2);
        array.delete(3);
        assertFalse(array.linearSearch(3));
	}

        @Test 
        public void test102()
	{
		
		
		array.insert(0,-1);
		array.insert(1,1);
		array.insert(2,2);
		System.out.println("NullPointerException");	
	}

        @Test
        public void test103()
	{
		
        	array.insert(0,0);
    		array.insert(1,101);
    		array.insert(2,102);
         	System.out.println("NullPointerException");
		
	}

        @Test
        public void test104()
	{
		
		array.insert(100,0);
		array.insert(102,1);
		array.insert(103,2);
		array.insert(104,3);
		
		array.delete(1);
        assertFalse(array.linearSearch(1));
	}

        @Test
        public void test105()
	{
		
		array.insert(50,0);
		array.insert(55,1);
		assertTrue(array.linearSearch(55));
	
	}

        @Test
        public void test106()
	{
		array.insert(10,0);
		array.insert(17,1);
		array.insert(3,2);
		array.insert(20,3);
		array.bubbleSort();
		
		int[] arr = {3,10,17,20};
		assertArrayEquals(array.array,arr);
	}

        @Test
        public void test107()
	{
		
		array.insert(10,0);
		array.insert(17,1);
		array.insert(3,2);
		array.insert(20,3);
		array.bubbleSort();
		
                boolean bool = false;
		int[] newarr = {3,10,17,20};
		
                for(int i = 0; i < array.size;i++)
                 {
                      if(array.array[i] == newarr[i])
                      {
                          bool = true;
                      }
                 }
	}

        @Test
        public void test108()
	{
		
		array.insert(10,0);
		array.insert(15,1);
		array.insert(11,2);
		array.insert(14,3);
		array.display();
		assertTrue(array.binarySearch(11, 0, array.size));
	}

       @Test
       public void test109()
	{
		
		array.insert(-6,0);
		array.insert(-4,1);
		array.insert(-8,2);
		array.insert(-9,3);
		assertTrue(array.binarySearch(-4, 0, 3));
	}

  

        @Test
        public void test110()
	{
		
		array.insert(20,0);
		array.insert(33,1);
		array.insert(12,2);
        array.insert(10,3);
        array.insert(5,4);
        array.insert(43,5);
		
		for(int i = 0; i < array.size; i++)
		{
		    if(array.array[i] == 10)
		    {
		       assertEquals(10,array.array[i]);
		    }
		}
	
	}

}

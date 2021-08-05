package com.practice1;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;  

public class Example {

	ArrayList<String> obj;
	
	@Before //@BeforeClass
	public  void mtbeforeClass()
	{
		obj= new ArrayList();  
		//System.out.println("Inside BeforeClass");
		System.out.println("Inside Before");
	}
	    
	/*
		 * @Before public void mtBefore() { System.out.println("Inside Before"); }
		 */
	     
    @Test  
    public void testAdd() 
    {  
        obj.add("Emma");  
        obj.add("Ronan");  
        obj.add("Antonio");  
        obj.add("Paul");  
        System.out.println("Inside testAdd()"+" "+ obj);
        assertEquals("Adding 4 student to list", 4, obj.size());  
    }  
	      
    @Test  
    public void testSize() 
    {  
    	System.out.println("Inside testSize()"+" "+ obj);
        obj.add("Kishan");  
        obj.add("Ronan");  
        obj.add("Antonio");  
        obj.add("Antonio");  
	    assertEquals("Checking size of List", 4, obj.size());  
	}  
	      
    @Test  
    public void testRemove() 
    {  
        obj.add("Antonio");  
        obj.add("Paul");  
        obj.remove("Paul");  
        assertEquals("Removing 1 student from list", 1, obj.size());  
    }  
	      
    @Test  
    public void removeAll() {  
        obj.removeAll(obj);  
    }  
}


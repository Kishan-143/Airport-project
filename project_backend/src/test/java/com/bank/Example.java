package com.bank;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;  

public class Example {

	ArrayList<String> obj;
	Bank db;
	
	@Before //@BeforeClass
	public  void mtbeforeClass()
	{
		db = new Bank();
		System.out.println("Inside Before");
	}
	    
	/*
		 * @Before public void mtBefore() { System.out.println("Inside Before"); }
	    
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
	   */  
    @Test  
    public void testTransactionSize1() 
    {  
    	db.do_transaction(1500, 1000, 1001);
    	db.do_transaction(5000, 1002, 1003);
    	System.out.println("Inside testAdd()");
        assertEquals("Adding 2 transactions ", 2, db.get_transaction_no(db.get_transactionList()));  
    }  
    /*
    @Test  
    public void testTransactionSize2() 
    {  
    	db.do_transaction(1500, 1000, 1001);
    	db.do_transaction(5000, 1002, 1003);
    	db.do_transaction(5000, 1002, 1003);
    	System.out.println("Inside testAdd()");
        assertEquals("Adding 2 transactions ", 3, db.get_transaction_no(db.get_transactionList()));  
    } 
    */ 
    
    @Test  
    public void testTransaction() 
    {  
    	ArrayList<Object[ ]> x = new ArrayList<Object[ ] >();
    	Object[] y = new Object[3];

    	y[0] = 1500;
    	y[1] = 1000;
    	y[2] = 1001;
    	x.add(y);
    	db.do_transaction(1500, 1000, 1001);
    	
    	y[0] = 5000;
    	y[1] = 1002;
    	y[2] = 1003;
    	x.add(y);
    	    	
    	db.do_transaction(5000, 1002, 1003);

    	y[0] = 5000;
    	y[1] = 1002;
    	y[2] = 1003;
    	x.add(y);
    	db.do_transaction(5000, 1002, 1003);

    	System.out.println("Inside testTransaction()");
    	System.out.println(db.get_transactions());
    	assertEquals("Adding 3 transaction",x,db.get_transactions());
    }  

/*    @Test  
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
    */
}


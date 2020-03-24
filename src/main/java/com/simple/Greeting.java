package com.simple;



/**
 * Display a greeting
 */
public class Greeting 
{

    public static void main( String[] args )
    {
        Greeting msg = new Greeting();
       System.out.println(msg.getStatus());
    }
    
    public String getMessage(String name) {
    	if (name == null) {
    		return null;
    	} else {
    		return String.format("Hello, %s and welcome!", name);
    	}
    }
    
    public String getStatus(){
    	
    	return "GOOD";
    	
    }
}

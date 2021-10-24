package oopsDemo.src.main.java.com.revature.oops.model;

public class ValueExtention extends FindValue{
	@Override
	 public void Add(int a,int b)// Override 
	    { 
	        int c=a*b; 
	        System.out.println("the method override "+c); 
	    } 
}

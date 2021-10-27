package oopsDemo.src.main.java.com.revature.oops.driver;

import oopsDemo.src.main.java.com.revature.oops.model.FindValue;
import oopsDemo.src.main.java.com.revature.oops.model.ValueExtention;
import oopsDemo.src.main.java.com.revature.oops.services.HumanActivity;

public class MainClass {

	public static void main(String[] args) {
		FindValue fVal = new FindValue(); 
		System.out.println("for FindValue class"); 
		fVal.Add(2,3); //addition of two integers 
		fVal.Add(2.3f,2.7f); // addition of two floats 
		
		
		ValueExtention valExt = new ValueExtention(); 
		System.out.println("From ValueExtention which is inherited from FindValue class"); 
		valExt.Add(2,3); // multiplication of two integers 
		
		HumanActivity hActivity = new HumanActivity();// constructor created, object Instantiation 
		hActivity.run(); 
		hActivity.walk(); 
		hActivity.throwException(2,3);

	}

}

package oopsDemo.src.main.java.com.revature.oops.services;

import oopsDemo.src.main.java.com.revature.oops.interfaces.Activity;

public class HumanActivity implements Activity {

	@Override
	public void run() {
		System.out.println("the system is Running");
		
	}

	@Override
	public void walk() {
		System.out.println("the system is Walking");
		
	}
	
	public int throwException(int a, int b) {//throws exception 
		int result = a + b;
		if(result == 6) {
			throw new ArithmeticException();
		}
		return result;
	}
}

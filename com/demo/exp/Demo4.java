package com.demo.exp;

//user defined class 
class InvalidPasswordException extends Exception{
	
	public InvalidPasswordException(String msg) {
            super(msg);
	}
}
public class Demo4 {
	
	public static void validate(String username,String pwd) throws InvalidPasswordException
	{
		String cpwd="keerthi@123";
		
		if(!pwd.equals(cpwd))
		{
			throw new InvalidPasswordException("plase enter valid pswrd");
		}
		
		
		else {
			System.out.println("welcome to home page");
		}	
	}
	
public static void main(String[] args) {
	
	String username="keerthi";
	String pwd="keerthi@123";
	try {
		validate(username, pwd);
	} catch (InvalidPasswordException e) {
		
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
	System.out.println("remaing 1000 lines o fcode");
}
}

package com.demo.inheritance;

class Father{
	
	public void meet()
	{
		System.out.println("wants to meet bpth children");
	}
	
}
class Elder extends Father{
	
	  public void usa()
	  {
		  System.out.println("gng abrd...want to meet dada");
	  }
}
public class Younger extends Father{
   
	public void bdy()
	{
		System.out.println("tdy is my bdy..want to meet dada");
	}
	
	public static void main(String[] args) {
		
		Younger y= new Younger();
		y.meet();
		y.bdy();
		
		Elder ed= new Elder();
		ed.meet();
		ed.usa();
	}
}

package com.demo.inheritance;
//multilevel

class Grandpha{
	
	public void tales()
	{
		System.out.println("without tales we cant sleep");
	}
}
class Dad extends Grandpha {
	
	public void house()
	{
		System.out.println("hey son..dont woorry we have 2bhk");
	}
	
	public void property()
	{
		System.out.println("we have 10000 crore property");
	}
}

public class GrandChild extends Dad{
  
	public void enjying()
	{
		System.out.println("i want enjoy...and sleep...and parties");
	}
	public static void main(String[] args) {
		
		GrandChild gc= new GrandChild();
		gc.enjying();
		gc.property();
		gc.house();
		gc.tales();
	}
}

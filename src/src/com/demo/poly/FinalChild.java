package com.demo.poly;


 class ParentFinal{
 	int age=88;
	
	public  void getAge(int age)
	{
		this.age=++age;
		System.out.println("my parnet age is :"+this.age);
	}
}
public class FinalChild extends ParentFinal{
	@Override
	public void getAge(int age)
	{
		this.age=--age;
		System.out.println("my child  age is :"+this.age);
	}
	public static void main(String[] args) {
		FinalChild fc= new FinalChild();
		fc.getAge(77); //77,76,78,87,86,89,88
	}
}

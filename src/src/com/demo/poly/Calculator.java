package com.demo.poly;
//overlaoding
public class Calculator {
   
	public void addition(int a,int b,int c)
	{
		System.out.println("adddition of 3 int values :"+(a+b+c));
	}
	public void addition(int a,int b)
	{
		System.out.println("addition of two int values :"+(a+b));
	}
	public void addition(float a,float b)
	{
		System.out.println("addition of two float values :"+(a+b));
	}
	public void addition(int a,float b)
	{
		System.out.println("addition of  int,float values :"+(a+b));
	}
	public void addition(float a,int b)
	{
		System.out.println("addition of float, int values :"+(a+b));
	}
	public static void main(String[] args) {
		
		Calculator ct= new Calculator();
		ct.addition(12,89,45);
		ct.addition(23,89);
		//ct.addition(34.7, 48.89);
		ct.addition(45, 90.4f);
		ct.addition('a', 'a');//type promotion
		
	}
}

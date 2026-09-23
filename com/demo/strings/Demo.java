package com.demo.strings;

public class Demo {

	public static void main(String[] args) {
     
//		String name="bahubali"; //immutable
//		 name=name.concat("devasena"); //bahubali devasena
//		System.out.println(name);
		
//		String st1="bahubali";
//		String st2="bahubali";
//		
//		System.out.println(st1==st2);//t f
//		System.out.println(st1.equals(st2));//f t
//		
//		String str1= new String("capgemini");
//		String str2= new String("capgemini");
//		
//		System.out.println(str1==str2);//t f 
//		System.out.println(str1.equals(str2));// t f
		
		
//		String a="bahubali";
//		String b="bahu"+"bali";//compiltime merge
//		
//		System.out.println(a==b);//t f
//		System.out.println(a.equals(b));// f t
		
		
//		String a="bahubali";
//		String b="bahu";
//		String c=b+"bali";//not merged at compiltime
//		
//		System.out.println(a==c);//t f
//		System.out.println(a.equals(c));// f t
		
		String name1= new String("bahubali");
		String name="bahubali";
		
		System.out.println(name==name1);// t f
		System.out.println(name.equals(name1));// f t
		
	}
}

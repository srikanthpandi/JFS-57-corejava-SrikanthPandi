package com.demo.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo3w {
public static void main(String[] args) {	
	HashMap<Integer,String> hs= new HashMap();	
	hs.put(123, "deva");
	hs.put(536, "sena");
	hs.put(123, "keerthi");
	hs.put(826, "suresh");
	hs.put(674, "bahu");
	hs.put(436, "bali");
	
	System.out.println(hs);
	System.out.println(hs.containsKey(234));
	System.out.println(hs.get(436));
	System.out.println(hs.getOrDefault(1235, "sathya"));
	System.out.println(hs.isEmpty());
	
	Set<Entry<Integer, String>> st=hs.entrySet();
	Iterator<Entry<Integer,String>> itr=st.iterator();
	while(itr.hasNext())
	{
		Entry<Integer,String> finalResult=itr.next();
		System.out.println(finalResult.getKey()+"  "+finalResult.getValue());
	}
	
	
	
	
}
}

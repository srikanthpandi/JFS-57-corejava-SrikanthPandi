package com.demo.CollectionsArrays;

import java.util.*;
import java.util.Map.Entry;

public class HashExample {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(101, "Srikanth");
		hm.put(103, "Ramesh");
		hm.put(102, "Ananth");
		hm.put(104, "Sri Sri");
		hm.put(105, "Sampath");
		
		System.out.println("\n"+hm);
		
		System.out.println(hm.containsKey(102));
		System.out.println(hm.get(105));
		System.out.println(hm.getOrDefault(106, "Bheema"));
		
		
		Set<Entry<Integer,String>> st=hm.entrySet();
		Iterator<Entry<Integer,String>> itr=st.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> finaResult=itr.next();
			System.out.println(finaResult.getKey()+" "+finaResult.getValue());
		}
		
		
	}
}
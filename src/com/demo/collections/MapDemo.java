package com.demo.collections;

import java.util.LinkedHashMap;

public class MapDemo {
public static void main(String[] args) {
	
	LinkedHashMap hm= new LinkedHashMap();
	
	hm.put(123, "keerthi");
	hm.put(234, "suresh");
	hm.put(123, "ramesh");
	
	hm.put("keerthi", 900);
	hm.put("suresh", 263);
	hm.put("ramesh", 900);
	
	System.out.println(hm);
}
}

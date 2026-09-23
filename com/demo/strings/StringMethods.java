package com.demo.strings;

public class StringMethods {
	public static void main(String[] args) {

		String name = "welocme to bahubali";
		System.out.println(name.charAt(0));
		// System.out.println(name.charAt(30));
		System.out.println(name.codePointAt(6));
		System.out.println(name.codePointBefore(7));
		String cmp1 = "bahu";
		String cmp2 = "Bahu";
		System.out.println(cmp1.compareTo(cmp2));// lexographical
		System.out.println(cmp1.compareToIgnoreCase(cmp2));
		System.out.println(name.concat("devasena"));
		System.out.println(name.contains("deva"));
		System.out.println(cmp1.contentEquals(cmp2));
		System.out.println(name.endsWith("bali"));
		System.out.println(cmp1.equals(cmp2));
		System.out.println(cmp1.equalsIgnoreCase(cmp2));
		String empname = "ballala";
		int age = 32;
		double salary = 890.89;
		char surname = 'm';
		boolean isPresent = true;
		System.out.println("Welcome :Name is :%s %n age is :%d %n salary is:%f %n surname :%c %n isPresent :%b"
				.formatted(empname, age, salary, surname, isPresent));

		System.out.println(name.hashCode());
		System.out.println(name);
		System.out.println(name.indent(10));
		System.out.println(name.indexOf('e'));
		System.out.println(name.indexOf("to"));

		String sleep = new String("sleeping");// heap object

		String res = name.intern();
		System.out.println(res);
		String emb = "   ";
		System.out.println(emb.length());
		System.out.println(emb.isBlank());
		System.out.println(emb.isEmpty());
		System.out.println(name.indexOf('e'));
		System.out.println(name.lastIndexOf('e'));
		String rg = "1729938257";
		System.out.println(rg.matches("[6-9][0-9]{9}"));
		System.out.println(name.offsetByCodePoints(1, 4));
//String n1="welcome";
//String n2="cometoindia";
//System.out.println(n1.regionMatches(1,n2,1,4));

		System.out.println(name.repeat(3));
		System.out.println(name.replace('e', 's'));
		System.out.println(name.replace("to", "sathya"));
		String rgx = "wel674 t78o inh56djd";
		System.out.println(rgx.replaceAll("[0-9]", "#"));
		System.out.println(rgx.replaceFirst("[0-9]", "*"));
		System.out.println(name.startsWith("wel"));

		String rm = "        sathya     ";
		System.out.println(rm.length());
		String res2 = rm.strip();
		String lead = rm.stripLeading();
		System.out.println(lead.length());
		System.out.println(res2.length());
		System.out.println(name.getClass().getName());

	}
}

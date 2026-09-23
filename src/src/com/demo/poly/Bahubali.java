package com.demo.poly;

class Parents {

	public void property() {
		System.out.println("1000 crore proprty");
	}

	 void marrige() {
		System.out.println("ready for war: arrange marrge...");
	}
}

public class Bahubali extends Parents {

	public void job() {
		System.out.println("i got 10 lc/an job...");
	}

	@Override
	public void marrige() {
		System.out.println("heyy..ma.. i am fall in love:devasena");
	}

	public static void main(String[] args) {

		Bahubali bahu = new Bahubali();// run time
		bahu.job();
		bahu.property();
		bahu.marrige();
	}
}

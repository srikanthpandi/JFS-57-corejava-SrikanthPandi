package com.Dsa.Programs;
class EmlpoyeeDemo{
	public static void main(String[] args) {
        DemoArray[] demoArrays = new DemoArray[3];
        demoArrays[0] = new DemoArray(1, "suresh");
        demoArrays[1] = new DemoArray(2, "ramesh");
        demoArrays[2] = new DemoArray(3, "bahu");

        for (DemoArray demo : demoArrays) {
            System.out.println(demo);
        }
    }
}
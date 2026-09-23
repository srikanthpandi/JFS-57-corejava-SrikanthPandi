package com.Dsa.Programs;

public class DemoArray {
	int empId;
	String eName;
    public DemoArray(int empId, String eName) {
        this.empId = empId;
        this.eName = eName;
    }
    @Override
    public String toString() {
        return "DemoArray{" +
                "empId=" + empId +
                ", eName='" + eName + '\'' +
                '}';
    }
   
    
}
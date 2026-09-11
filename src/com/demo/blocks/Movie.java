package com.demo.blocks;

public class Movie {
	private int  ticketid;
	private String name;
	private String seatNum;
	private float time;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public void setTicketid1(int ticketid2){
		this.ticketid = ticketid2;
	}
}

	

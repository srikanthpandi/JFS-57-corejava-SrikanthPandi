package com.demo.blocks;

public class TicketDemo{
public static void main(String[] args) {
   Movie mv = new Movie();
    System.out.println(mv);

    // update
    mv.setSeatNum("B13");
    mv.setTicketid(15);
    System.out.println(mv);
}
}
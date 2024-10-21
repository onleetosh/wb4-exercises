package com.pluralsight;

public class Reservation {

    //private String guestName;
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double ReservationTotal;

    public Reservation(String roomType, double price,int numberOfNights, double reservationTotal){
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.ReservationTotal = reservationTotal;
    }
    public String getRoomType(){
        return this.roomType;
    }
    public String setRoomType(String roomType){
        return this.roomType;
    }
    public double getPrice(){
        return this.price;
    }

    public int getNumberOfNights(){
        return  this.numberOfNights;
    }
    public  int setNumberOfNights(int numberOfNights){
        return this.numberOfNights;
    }
    public boolean isWeekend(){
        return weekend;
    }
    public boolean setIsWeekend(boolean isWeekend){
        return !isWeekend();
    }
    public double getReservationTotal(){
        return this.ReservationTotal;
    }



}

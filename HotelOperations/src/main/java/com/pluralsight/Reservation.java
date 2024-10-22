package com.pluralsight;

public class Reservation {

    private String roomType; // king or double
    private int numberOfNights;
    private boolean isWeekend; // weekday or weekend?

    //initialize a constructor to create a reservation (object)
    public Reservation(String roomType, int numberOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //method designed return price
    public double getPrice() throws Exception{

        double price = 0;
        //if room size is king price is set to $139.00
        if(this.roomType.equalsIgnoreCase("king")){
            price = 139.0;
        }
        //if room size is double price is set to $124.00
        else if (this.roomType.equalsIgnoreCase("double")){
            price = 124.0;
        }
        else {
            throw new Exception("Invalid selection. Choose room type (king or double)");
        }
        //if stay is on the weekend increase price by 10%
        if(this.isWeekend) {
           // price = price * 1.1;
            price *= 1.1;
        }

        return price;
    }

    public double getReservationTotal() throws Exception {
       return this.getPrice() * this.numberOfNights;
    }

    //getters
    public String getRoomType(){
        return roomType;
    }
    public int getNumberOfNights(){
        return  numberOfNights;
    }
    public boolean isWeekend(){
        return isWeekend;
    }

    //setters with added parameters used to pass an argument
    public void setRoomType(String roomType){
         this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public void setIsWeekend(boolean weekend){
        isWeekend = weekend;
    }

}

/***
 *This class is responsible for knowing everything related to
 * a hotel room.
 *
 */

package com.pluralsight;

public class Room {
    private int beds; // track number of beds
    private double price;
    private boolean occupied; //taken or empty
    private boolean dirty;  //clean or dirty

    //initialize a constructor
    public Room(int beds, double price, boolean occupied, boolean dirty) {
        this.beds = beds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getBeds(){
        return  beds;
    }
    public double getPrice(){
        return price;
    }
    public boolean isOccupied(){
        return occupied;
    }
    public boolean isDirty(){
        return dirty;
    }
    public boolean isAvailable(){
        return ( !this.isDirty() && !this.isOccupied());
    }

    //guest checks in . room is consider taken and dirty
    public boolean checkIn() throws Exception {
        if (isAvailable()) {
            this.occupied = true;
            this.dirty = true;
            return true; // indicates checked in
        }
        else if (isDirty()){
            System.out.println("Room is in no condition for check-in.");
        }
        else {
            throw new Exception("Room is unavailable for check-in.");
        }
        return true;
    }

    //when guest check out, room is consider empty
    public boolean checkOut() throws Exception {
        if (isOccupied()) {
            this.occupied = false;
            return true; // indicates is  dirty
        }
        else {
            throw new Exception("Room is already vacant.");
        }
    }

    public boolean cleanRoom() throws Exception{
        if (isDirty()) {
            this.dirty = false; // Room is clean
            return true; //indicate room is available
        } else {
            throw new Exception("Room is already clean.");
        }

    }
}

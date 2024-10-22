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
    public boolean getAvailable(){
        return ( !this.isDirty() && !this.isOccupied());
    }
}

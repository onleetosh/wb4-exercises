/***
 * This class will allow you to create a simple hotel object and check if there are rooms available
 * for the current day only. The hotel has 2 types of rooms a King Suite and Basic Double room.
 *
 */
package com.pluralsight;

public class Hotel {

    //declare variables to track data
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    // constructor 1 sets only number of suites and rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    //constructor 2 specify the number of booked suites and booked rooms.
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }
    //getters
    public String getName(){
        return name;
    }
    public int getNumberOfSuites(){
        return numberOfSuites;
    }
    public  int getNumberOfRooms(){
        return numberOfRooms;
    }
    public  int getBookedSuites(){
        return bookedSuites;
    }
    public int getBookedRooms(){
        return bookedRooms;
    }

    //determines if there are enough rooms available and update the book inventory
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        
    }

    public int getAvailableSuites(){

    }

    public int getAvailableRooms(){

    }
}

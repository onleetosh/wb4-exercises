/***
 * This class will allow you to create a simple hotel object and check if there are rooms available
 * for the current day only. The hotel has 2 types of rooms a King Suite and Basic Double room.
 *
 */
package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    static Scanner input = new Scanner(System.in);

    //declare variables to track data
    private String name; //king or double
    private int numberOfSuites; //suites
    private int numberOfRooms; //basic rooms
    private int bookedSuites;
    private int bookedRooms;

    // constructor 1 sets only number of suites and rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0; //default to 0
        this.bookedRooms = 0; //default to 0

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


    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        //book suite
        if(isSuite){
            if ( numberOfSuites > getAvailableSuites()){
                return false; //unavailable
            }
        else {
            bookedSuites += numberOfRooms;
            return true; //available
            }
        }
        //book double
        else {
            if(numberOfRooms > getAvailableRooms()) {
                return false; //unavailable
            }
            else {
                bookedRooms += numberOfRooms;
                return true; //available
            }
        }
    }


    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;

    }
    public int getAvailableRooms() {
        return numberOfRooms - bookedRooms;
    }

}

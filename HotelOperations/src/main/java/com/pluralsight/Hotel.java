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
    private String name; // king  or double
    private int numberOfSuites; // suite rooms
    private int numberOfDoubles; // double rooms
    private int bookedSuites;
    private int bookedDoubles;

    // constructor 1 sets only number of suites and rooms
    public Hotel(String name, int numberOfSuites, int numberOfDoubles){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfDoubles = numberOfDoubles;
        this.bookedSuites = 0; //default to 0
        this.bookedDoubles = 0; //default to 0
    }

    //constructor 2 specify the number of booked suites and booked rooms.
    public Hotel(String name, int numberOfSuites, int numberOfDoubles, int bookedSuites, int bookedDoubles){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfDoubles = numberOfDoubles;
        this.bookedSuites = bookedSuites; //no need to default to 0
        this.bookedDoubles = bookedDoubles; //no need to default to 0
    }
    //getters
    public String getName(){
        return name;
    }
    public int getNumberOfSuites(){
        return numberOfSuites;
    }
    public  int getNumberOfDoubles(){
        return numberOfDoubles;
    }
    public  int getBookedSuites(){
        return bookedSuites;
    }
    public int getBookedDoubles(){
        return bookedDoubles;
    }


    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        //book suite
        if(isSuite){//unavailable
            if ( numberOfRooms > getAvailableSuites()){
                return false;
            }
        else {//available
            bookedSuites += numberOfRooms; // increment bookSuites by 1
            return true;
            }
        }
        //book double
        else {//unavailable
            if(numberOfRooms > getAvailableDoubles()) {
                return false;
            }
            else {//available
                bookedDoubles += numberOfRooms; //increment bookRooms by 1
                return true;
            }
        }
    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;

    }
    public int getAvailableDoubles() {
        return numberOfDoubles - bookedDoubles;
    }

}

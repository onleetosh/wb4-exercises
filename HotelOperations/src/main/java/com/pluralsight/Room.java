/***
 *This class is responsible for knowing everything related to
 * a hotel room.
 *
 */

package com.pluralsight;

public class Room {

    static Room[] Doubles = initializeDoubles();
    static Room[] Suites = initializeSuites();

    //declare variables
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

    public int getBeds(){ return  beds; }
    public double getPrice(){ return price; }
    public boolean isOccupied(){ return true; }
    public boolean isDirty(){ return true; }
    public boolean isAvailable(){ return ( !this.isDirty() && !this.isOccupied()); }

    //guest checks in to hotel room.
    public boolean checkIn()  {

        if (!isAvailable()) {
            System.out.println("Guest can check-in room");
            this.occupied = false;
            this.dirty = false;
            return true; // indicates checked in
        }
        else if (isDirty()){
            System.out.println("Room is in no condition for check-in.");
        }
        else {
            System.out.println("Room is occupied by guest. Cannot check-in.");
        }
        return true;
    }

    //when guest check out of hotel room
    public boolean checkOut() {
        if (isOccupied()) {
            System.out.println("Guest checked-out room.");
           // this.occupied = false;
            this.dirty = true;
            return true; // indicates is  dirty
        }
        else {
            System.out.println("Room is already vacant.");
        }
        return true;
    }

    public boolean cleanRoom() {
        if (!isDirty()) {
            System.out.println("Room is already clean.");
            return true;
        } else {
            System.out.println("Room needs to be clean");
        }
        return true;
    }

    public static void DisplaySuites(Room[] suites){
        System.out.printf("%5s %55s\n" , "Beds", "Price" );
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        for(Room suite : suites) {
            System.out.printf("%5s %55s \n", suite.getBeds(), suite.getPrice());
        }
    }
    //method designed to display available rooms
    public static void DisplayDoubles(Room[] rooms){
        System.out.printf("%5s %55s\n" , "Beds", "Price" );
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        for(Room room : rooms) {
            System.out.printf("%5s %55s \n", room.getBeds(), room.getPrice());
        }
    }
    public static Room[] showAvailableSuites(Room[] suites) {
        Room[] available = new Room[suites.length];

        int nextIndex = 0;
        for(Room suite: suites){
            if(!suite.isDirty() && !suite.isOccupied()){
                available[nextIndex++] = suite;
            }
        }

        // Create a final array to hold available suites
        Room[] results = new Room[nextIndex];
        System.arraycopy(available, 0, results, 0, nextIndex);
        return results;
    }
    //method designed to display available rooms
    public static Room[] showAvailableStandard(Room[] rooms) {
        Room[] available = new Room[rooms.length];

        int nextIndex = 0;
        for(Room room: rooms){
            if(!room.isDirty() && !room.isOccupied()){
                available[nextIndex++] = room;
            }
        }

        // Create a final array to hold available suites
        Room[] results = new Room[nextIndex];
        System.arraycopy(available, 0, results, 0, nextIndex);
        return results;
    }
    public static Room[] initializeSuites() {

        Room[] suite = new Room[10];
        suite[0] = new Room(3, 20, true, true);
        suite[1] = new Room(4, 20, false, false); //available
        suite[2] = new Room(3, 20, true, true);
        suite[3] = new Room(4, 20, false, false); //available
        suite[4] = new Room(3, 20, false, false); //available
        suite[5] = new Room(3, 20, true, true);
        suite[6] = new Room(4, 20, false, true);
        suite[7] = new Room(3, 20, false, true);
        suite[8] = new Room(4, 20, true, true);
        suite[9] = new Room(3, 20, false, false); //available
        return suite;
    }
    public static Room[] initializeDoubles() {
        Room[] room = new Room[10];
        room[0] = new Room(1, 10, true, true);
        room[1] = new Room(2, 10, false, false);
        room[2] = new Room(1, 10, true, true);
        room[3] = new Room(2, 10, false, false);
        room[4] = new Room(1, 10, false, false);
        room[5] = new Room(2, 10, true, true);
        room[6] = new Room(1, 10, false, true);
        room[7] = new Room(2, 10, false, true);
        room[8] = new Room(2, 10, true, true);
        room[9] = new Room(2, 10, false, false);
        return room;
    }


}

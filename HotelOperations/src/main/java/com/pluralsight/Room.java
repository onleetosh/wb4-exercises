/***
 *This class is responsible for knowing everything related to
 * a hotel room.
 *
 */

package com.pluralsight;

public class Room {

    static Room[] Standards = initializeStandards();
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
    public boolean isOccupied(){ return occupied; }
    public boolean isDirty(){ return dirty; }
    public boolean isAvailable(){ return ( !this.isDirty() && !this.isOccupied()); }

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

    public static void DisplaySuites(Room[] suites){
        System.out.printf("%5s %55s\n" , "Beds", "Price" );
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        for(Room suite : suites) {
            System.out.printf("%5s %55s \n", suite.getBeds(), suite.getPrice());
        }
    }
    //method designed to display available rooms
    public static void DisplayStandards(Room[] rooms){
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
    public static Room[] initializeStandards() {
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

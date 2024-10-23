package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @org.junit.jupiter.api.Test
    void Test_checkIn() {
        //arrange
        Room room = new Room(2, 20, false, true );
        //act
        room.checkIn();
        //assert
        assertTrue(room.checkIn());

    }

    @org.junit.jupiter.api.Test
    void Test_checkOut() {
        //arrange
        Room room = new Room(2, 20, false, true );
        //act
        room.checkOut();
        //assert
        assertTrue(room.checkOut());
    }

    @org.junit.jupiter.api.Test
    void Test_cleanRoom() { //check logic
//arrange
        Room room = new Room(2, 20, false, false );
        //act
        room.cleanRoom();
        //assert
        assertTrue(room.cleanRoom());
    }
}
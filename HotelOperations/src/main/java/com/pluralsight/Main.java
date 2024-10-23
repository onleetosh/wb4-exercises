package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Tosh", "Tech", 10,40);


        System.out.println("Showing available rooms..." );
        Room[] availableSuites = Room.showAvailableSuites(Room.Suites);
        Room.DisplaySuites(availableSuites);
    }
}
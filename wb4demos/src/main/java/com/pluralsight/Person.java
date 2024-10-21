package com.pluralsight;

public class Person {

    // attributes
    private String name;
    private int age;
    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // getters and setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // other methods
    public String convertToString() {
        return this.name + " is " + this.age + " year(s) old";
    }
}

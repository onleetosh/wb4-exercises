package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private final double overtimeAmount = 1.5;
    private final double workingAfterHours = 40;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    //getters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department;}
    public double getPayRate() { return payRate;}
    public double getHoursWorked() { return hoursWorked; }

    public double getRegularHours() {
        if (hoursWorked <= workingAfterHours) {
            return  hoursWorked;
        } else {
            return workingAfterHours;
        }
    }
    public double getOvertimeHours() {
        if(hoursWorked > workingAfterHours) {
            return  hoursWorked - workingAfterHours;
        }
        else {
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * overtimeAmount;
        return regularPay + overtimePay;


    }

}

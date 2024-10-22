package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private Double punchInTime; // Store punch-in time



    private final double overtimeBonus = 1.5;
    private final double maxWorkHour = 40;

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
        if (hoursWorked <= maxWorkHour) {
            return  hoursWorked;
        } else {
            return maxWorkHour;
        }
       // return (hoursWorked > maxWorkHour) ? maxWorkHour : hoursWorked;

    }
    public double getOvertimeHours() {
        if(hoursWorked > maxWorkHour) {
            return  hoursWorked - maxWorkHour;
        }
        else {
            return 0;
        }
        // return (hoursWorked > maxWorkHour) ? hoursWorked - maxWorkHour : 0 ;
    }

    public double getTotalPay() {
            //double regularPay = getRegularHours() * payRate;
            //double overtimePay = getOvertimeHours() * payRate * overtimeBonus;
            //return regularPay + overtimePay;

        return getRegularPay() + getOvertimePay();
    }

    public double getRegularPay(){
        return getRegularHours() * payRate;
    }

    public double getOvertimePay(){
        return getOvertimeHours() * payRate * overtimeBonus;

    }

    // work has punched in
    public void punchIn(double time) {
        this.punchInTime = time; // Store punch-in time
    }

    // worker has punch out
    public void punchOut(double time) {
        if (punchInTime == null) { // Check if punch-in has been recorded
            System.out.println("Error: Punch in first.");
            return;
        }
        // find total hours worked
        double workedHours = time - punchInTime;
        // Add hours to the total hours worked
        this.hoursWorked += workedHours;
        // reset punch-in
        this.punchInTime = null;
    }



}

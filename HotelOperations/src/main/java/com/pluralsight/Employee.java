package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
   static LocalDateTime now = LocalDateTime.now();
   static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

  //  private Double punchIn_Time;
    private LocalDateTime punchInTime;
    private LocalDateTime punchOutTime;
    private boolean isPunchIn = false; // class-level variable to track punch state
    private double totalHours = 0;     // to accumulate hours worked




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

    //determine hours worked
    public double getRegularHours() {
        if (hoursWorked <= maxWorkHour) {
            return  hoursWorked;
        } else {
            return maxWorkHour;
        }
       // return (hoursWorked > maxWorkHour) ? maxWorkHour : hoursWorked;

    }

    //determine overtime work hours
    public double getOvertimeHours() {
       //is hours work is greater than max hours
        if(hoursWorked > maxWorkHour) {
            return  hoursWorked - maxWorkHour;
        }
        else {
            return 0;
        }
        // return (hoursWorked > maxWorkHour) ? hoursWorked - maxWorkHour : 0 ;
    }

    //determine amount earned
    public double getTotalPay() {
            //double regularPay = getRegularHours() * payRate;
            //double overtimePay = getOvertimeHours() * payRate * overtimeBonus;
            //return regularPay + overtimePay;

        return getRegularPay() + getOvertimePay();
    }

    //determine amount earned
    public double getRegularPay(){
        return getRegularHours() * payRate;
    }

    //determine amount earned
    public double getOvertimePay(){
        return getOvertimeHours() * payRate * overtimeBonus;

    }

    public double punchIn(double time){
        return this.hoursWorked -= time;
    }

    public void punchIn(){
        punchInTime = now;
        String time = punchInTime.format(fmt);

    }

    public double punchOut(double time){
        return this.hoursWorked += time;
    }

    public void punchOut(){
        punchOutTime = now;
        String time = punchOutTime.format(fmt);

    }

    public double punchTimeCard(double time){
        if (!isPunchIn) {
            // Punch in: Start adding hours
            totalHours += time;
            isPunchIn = true; // set punch in
        } else {
            // Punch out: Subtract or just indicate the end of work hours
            isPunchIn = false; // set punch out
        }
        return totalHours; // return accumulated hours

    }
    public void punchTimeCard(boolean isWorking){

            String time = now.format(fmt);
            if (isWorking) {
                punchInTime = now;
                System.out.println(name + " punched in at: " + time);
            } else {
                punchOutTime = now;
                System.out.println(name + " punched out at: " + time);

                if (punchInTime != null) {
                    //getTotalPay();
                } else {
                    System.out.println("Error: No punch-in time recorded for " + name);
                }
            }
    }
}

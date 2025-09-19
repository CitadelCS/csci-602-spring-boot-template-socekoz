package edu.citadel.hw1;

import java.time.LocalDate;

public abstract class Employee implements Comparable<edu.citadel.hw1.Employee> {
    //initialize name and hireDate
    private String name;
    private LocalDate hireDate;
    //constructor for both fields
    public Employee (String n, LocalDate h) {
        name = n;
        hireDate = h;
    }
    //get methods for both fields
    public String getName() {
        return name;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    //get method for monthly pay. Subclasses implement.
    public abstract double getMonthlyPay();
    //compare method for ordering salaries,
    @Override
    public int compareTo(edu.citadel.hw1.Employee emp2) {
        if (this.getMonthlyPay() > emp2.getMonthlyPay()) {
            return 1;
        } else if (this.getMonthlyPay() < emp2.getMonthlyPay()) {
            return -1;
        } else {
            return 0;
        }
    }
}
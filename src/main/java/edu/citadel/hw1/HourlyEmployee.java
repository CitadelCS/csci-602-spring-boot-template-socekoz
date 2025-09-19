package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hoursWorked;
    public HourlyEmployee(String n, LocalDate h, double w, double hw) {
        super(n, h);
        wageRate = w;
        hoursWorked = hw;
    }
    //get methods for wageRate and hoursWorked
    public double getWageRate() {
        return wageRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    //getMonthlyPay
    @Override
    public double getMonthlyPay() {
        return wageRate * hoursWorked;
    }
    @Override
    public String toString() {
        return ("HourlyEmployee[name=" + getName() + ", hireDate=" + getHireDate() + ", wageRate=" + getWageRate() + ", hoursWorked=" + getHoursWorked() + "]");
    }
    //confused about these two methods below
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHireDate());
    }
    @Override
    public boolean equals(Object emp2) {
        if (this == emp2) {
            return true;
        } else if (emp2 == null) {
            return false;
        } else if (getClass() != emp2.getClass()) {
            return false;
        } else {
            edu.citadel.hw1.HourlyEmployee other = (edu.citadel.hw1.HourlyEmployee) emp2;
            return Objects.equals(getName(), other.getName()) && Objects.equals(getHireDate(), other.getHireDate());
        }
    }
}

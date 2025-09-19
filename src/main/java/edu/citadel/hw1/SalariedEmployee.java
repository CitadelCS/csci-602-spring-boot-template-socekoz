package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String n, LocalDate h, double a) {
        super(n, h);
        annualSalary = a;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double getMonthlyPay() {
        return annualSalary / 12.0;
    }

    @Override
    public String toString() {
        return ("SalariedEmployee[name=" + getName() + ", hireDate=" + getHireDate() + ", annualSalary=" + getAnnualSalary() + "]");
    }
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
            edu.citadel.hw1.SalariedEmployee other = (edu.citadel.hw1.SalariedEmployee) emp2;
            return Objects.equals(getName(), other.getName()) && Objects.equals(getHireDate(), other.getHireDate());
        }
    }
}

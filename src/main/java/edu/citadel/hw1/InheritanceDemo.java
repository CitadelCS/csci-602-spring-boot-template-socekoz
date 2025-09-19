package edu.citadel.hw1;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;

public class InheritanceDemo {
    public static void main(String[] args) {
        //Hourly employees
        ArrayList<edu.citadel.hw1.Employee> employees = new ArrayList<>();
        edu.citadel.hw1.HourlyEmployee e1 = new edu.citadel.hw1.HourlyEmployee("John Doe", LocalDate.of(2009, 5, 21), 50.5, 160.0);
        employees.add(e1);
        edu.citadel.hw1.HourlyEmployee e2 = new HourlyEmployee("Jane Doe", LocalDate.of(2005, 9, 1), 150.5, 80.0);
        employees.add(e2);
        //salaried employees
        edu.citadel.hw1.SalariedEmployee e3 = new edu.citadel.hw1.SalariedEmployee("Moe Howard", LocalDate.of(2004, 1, 1), 75000.0);
        employees.add(e3);
        edu.citadel.hw1.SalariedEmployee e4 = new SalariedEmployee("Curly Howard", LocalDate.of(2018, 1, 1), 105000.0);
        employees.add(e4);
        //print employees with their toString methods
        System.out.println("List of Employees (before sorting)");
        for (edu.citadel.hw1.Employee emp : employees) {
            System.out.println(emp); }
        System.out.println();
        //sort
        Collections.sort(employees);
        System.out.println("List of Employees (after sorting)");
        for (edu.citadel.hw1.Employee emp : employees) {
            System.out.println(emp); }
        System.out.println();
        //monthly pay
        System.out.println("Monthly Pay");
        double totalPay = 0;
        for (Employee emp : employees) {
            totalPay += emp.getMonthlyPay();
            System.out.println(emp.getName() + ": $" + emp.getMonthlyPay()); }
        System.out.println("Total Monthly Pay: $" + totalPay);
    }
}

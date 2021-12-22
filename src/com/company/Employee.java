package com.company;

public class Employee {

    private String firstName;
    private String lastName;
    private String middleName;
    private int groupNumber;
    private double salary;
    public static int counter = 1;
    private int id;

    public Employee(String firstName, String lastName, String middleName, int groupNumber, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.groupNumber = groupNumber;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  this.lastName + " " +
                this.firstName + " " +
                this.middleName + ", ID#: " +
                this.id + ", group: " +
                this.groupNumber + ", salary: " +
                this.salary + " RUB";
    }

}

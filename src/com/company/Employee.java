package com.company;

// encapsulation | define access use class
public class Employee {

    private String id;
    private String name;
    private Double salary;
    // constant data can't override and assign new value
    final String company = "OOP";
    // don't want to use attribute
    // getter: read value
    // setter: assign value


    // constructor => Initial on create object
    // Default Constructor
    public Employee() {
        System.out.println("Employee class");
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
        displayEmployee();
    }

    public void displayEmployee() {
        System.out.println("name: " + this.name + " salary: " + this.salary + " company: " + this.company);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

}

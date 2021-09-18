package com.company;

// inheritance | extend super class for re-use method or attribute
// polymorphism | overload, override method
public class Programmer extends Employee implements Benefit {

    public Programmer(String name, Double salary) {
        // keyword super use constructor from super class
        super(name,salary);
        System.out.println("Programmer Department");
    }

    public void Bonus(float percent) {
        System.out.println("bonus/percent: " + percent);
    }
    // overload method same name and difference params
    public void Bonus(float percent, Integer months) {
        System.out.println("bonus/percent: " + percent);
        System.out.println("bonus/months: " + months);

    }

    // override is same name from super class

    // abstract class

}

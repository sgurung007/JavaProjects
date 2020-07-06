package com.gurungMomSon;

public class Employee extends MyAbstract{
    @Override
    public void displayName() {
        System.out.println("printing from employee displayName");
    }

    @Override
    public void displayEmail() {
        System.out.println("printing from employee displayEmail");

    }
}

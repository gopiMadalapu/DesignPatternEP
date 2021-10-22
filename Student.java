package com.company;

public class Student extends Observer {
    @Override
    public void notifyAllObservers() {
        System.out.println("Student had been notified about assessment");
    }
}

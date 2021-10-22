package com.company;

public class Parent extends Observer {
    @Override
    public void notifyAllObservers() {
        System.out.println("Parents have been notified about student assessment!");
    }
}

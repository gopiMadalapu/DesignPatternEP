package com.company;

import java.util.ArrayList;
import java.util.List;

public class Portal {
    private static Portal portal = new Portal();
    private List<Observer> observers = new ArrayList<Observer>();

    private Portal() {
        for (int i = 0; i < 2; i++) {
            Observer observer = new Student();
            attach(observer);
        }
        for (int i = 0; i < 2; i++) {
            Observer observer = new Parent();
            attach(observer);
        }
    }

    public static Portal getInstance() {
        return portal;
    }

    public void printMenu() {
        System.out.println("WELCOME TO EXAM PORTAL!!");
        System.out.println("1. Configure Questions");
        System.out.println("2. Notify students and parents about assessments");
        System.out.println("3. Mark students assessments");
        System.out.println("4. Exit");
    }

    public void configureQuestions(String type) {
        QuestionTypeFactory questionTypeFactory = new QuestionTypeFactory();
        QuestionType questionType = questionTypeFactory.getInstance(type);
        questionType.configureQuestions();
    }

    public void markAssessments(String user, String pass) {
        MarkAssessmentProxy markAssessmentProxy = new MarkAssessmentProxy(user, pass);
        markAssessmentProxy.markAssessment();
    }

    private void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.notifyAllObservers();
        }
    }
}

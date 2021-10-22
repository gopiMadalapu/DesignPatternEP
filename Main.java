package com.company;

//Singleton ✅
//Observer ✅
//Factory ✅
//Proxy ✅

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Portal portal = Portal.getInstance();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (option != 4) {
            portal.printMenu();
            input = sc.nextLine();
            option = Integer.parseInt(input);
            if (option == 1) {
                System.out.println("Which type of questions you want to configure ?");
                System.out.println("1. Multiple Choice Questions");
                System.out.println("2. Open Ended Questions");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    portal.configureQuestions("mcq");
                } else {
                    portal.configureQuestions("openended");
                }
            }
            if (option == 2) {
                portal.notifyAllObservers();
            }
            if (option == 3) {
                System.out.println("Teachers can only mark assessments. You want to login as a teacher ?");
                System.out.println("1. Yes\n2. No");
                input = sc.nextLine();
                int selection = Integer.parseInt(input);
                if (selection == 1) {
                    System.out.print("Enter name: ");
                    String user = sc.nextLine();
                    System.out.print("Enter password: ");
                    String pass = sc.nextLine();
                    portal.markAssessments(user, pass);
                }else{
                    System.out.println("Only Teachers can mark assessments");
                }
            }

        }
    }
}

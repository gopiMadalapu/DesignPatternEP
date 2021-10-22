package com.company;

public class OpenEndedQuestions implements QuestionType{
    @Override
    public void configureQuestions() {
        System.out.println("Open Ended Questions have been configured for students");
    }
}

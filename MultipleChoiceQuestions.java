package com.company;

public class MultipleChoiceQuestions implements QuestionType{
    @Override
    public void configureQuestions() {
        System.out.println("Multiple questions have been configured for students.");
    }
}

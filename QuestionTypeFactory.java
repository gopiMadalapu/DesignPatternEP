package com.company;

public class QuestionTypeFactory {
    public QuestionType getInstance(String type) {
        if (type.equals("mcq")) {
            return new MultipleChoiceQuestions();
        } else {
            return new OpenEndedQuestions();
        }
    }
}

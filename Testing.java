package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testing {

    @Test
    public void questionTypeFactoryTest(){
        QuestionTypeFactory factory=new QuestionTypeFactory();
        QuestionType questionType=factory.getInstance("mcq");

        assertTrue(questionType instanceof MultipleChoiceQuestions);
    }

    @Test
    public void portalSingletonTest(){
        Portal p1=Portal.getInstance();
        Portal p2=Portal.getInstance();

        assertEquals(p1,p2);
    }
}

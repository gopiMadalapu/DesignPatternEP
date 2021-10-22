package com.company;

public class MarkAssessmentProxy implements MarkAssessment {
    private boolean isTeacher;
    private MarkAssessmentImplementation markAssessmentImplementation;


    public MarkAssessmentProxy(String name, String pass) {
        if (name.equals("Teacher") && pass.equals("123")) {
            isTeacher = true;
            markAssessmentImplementation = new MarkAssessmentImplementation();
        }
    }

    @Override
    public void markAssessment() {
        if (isTeacher) {
            markAssessmentImplementation.markAssessment();
        } else {
            System.out.println("Login as a teach to mark assessment!");
        }
    }
}

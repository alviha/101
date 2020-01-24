/**
 *  The AnswerChoice class holds values for the answer content, and if it is correct
 *
 * @author Bufford Brian Sta Maria
 *
 * CMSC 355, Spring 2019
 * Project A8
 * 3/26/2019
 *
 */
package com.example.myapplication;

public final class AnswerChoice {

    /** instance variables */
    private String content;
    private boolean isCorrect;

    /**
     * Parameterized constructor
     * @param content what the answer actually says
     * @param isCorrect true if the answer is correct
     */
    public AnswerChoice(String content, boolean isCorrect) {
        this.content = content;
        this.isCorrect = isCorrect;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public void setCorrect(boolean value) {

        this.isCorrect = value;
    }

    public String getContent() {

        return this.content;
    }

    public boolean isCorrect() {

        return this.isCorrect;
    }
}

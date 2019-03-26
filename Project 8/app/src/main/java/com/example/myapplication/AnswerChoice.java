package com.example.myapplication;

public final class AnswerChoice {

    private String content;
    private boolean isCorrect;

    public AnswerChoice(String content, boolean isCorrect);

    public void setContent(String content);

    public void setCorrect(boolean value);

    public String getContent() {
        return this.content;
    }

    public boolean isCorrect() {
        return this.isCorrect;
    }
}

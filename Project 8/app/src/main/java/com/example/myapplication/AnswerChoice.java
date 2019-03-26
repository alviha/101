package com.example.myapplication;

public final class AnswerChoice {

    private String content;
    private boolean isCorrect;

    public AnswerChoice(String content, boolean value) {
        this.content = content;
        this.isCorrect = value;
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

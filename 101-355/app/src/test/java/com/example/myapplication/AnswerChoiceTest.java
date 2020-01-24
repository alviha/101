/**
 *  Test class of the AnswerChoice class using JUnit 4
 *
 * @author Bufford Brian Sta Maria
 *
 * CMSC 355, Spring 2019
 * Project A8
 * 3/25/2019
 *
 */
package com.example.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnswerChoiceTest {

    private AnswerChoice testAnswerChoice;

    @Before
    public void setUp() throws Exception {
        testAnswerChoice = new AnswerChoice("row", true);
    }

    // test the constructor: assert the content
    @Test
    public void testAnswerChoice1() {
        String expected = "1";
        AnswerChoice testAnswer = new AnswerChoice("1", true);
        assertEquals(expected, testAnswer.getContent());
    }

    // test the constructor: assert the isCorrect value
    @Test
    public void testAnswerChoice2() {
        AnswerChoice testAnswer = new AnswerChoice("1", true);
        assertTrue(testAnswer.isCorrect());
    }

    // test setter for the content
    @Test
    public void testSetContent() {
        String expected = "Java";
        testAnswerChoice.setContent("Java");
        assertEquals(expected, testAnswerChoice.getContent());
    }

    // test setter for the isCorrect value
    @Test
    public void testSetCorrect() {
        testAnswerChoice.setCorrect(false);
        assertFalse(testAnswerChoice.isCorrect());
    }
}
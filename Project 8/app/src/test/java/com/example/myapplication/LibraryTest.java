/**
 *  Test class of the Library class using JUnit 4
 *
 * @author Bufford Brian Sta Maria
 *
 * CMSC 355, Spring 2019
 * Project A8
 * 3/30/2019
 *
 */
package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    // test: retrieve Elementary Programming questions; assert question set for lesson 1
    @Test
    public void testGetQuestionsElementaryProgramming() {

        String[] expected = {
                "Suppose a Scanner object is created as follows: \n \n Scanner input = new Scanner(System.in); \n \n What method do you use to read an int value?\n",
                "If you enter 1 2 3, when you run this program, what will be the output? \n \n import java.util.Scanner; \n \n public class Test1 { \n public static void main(String[] args) { \n Scanner input = new Scanner(System.in); \n System.out.print(\"Enter three numbers: \"); \n double number1 = input.nextDouble(); \n double number2 = input.nextDouble(); \n double number3 = input.nextDouble(); \n \n double average = (number1 + number2 + number3) / 3; \n \n  System.out.println(average); \n } \n }",
                "What is the exact output of the following code? \n \n double area = 3.5; \n System.out.print(\"area\"); \n System.out.print(area);",
                "Which of the following are correct names for variables according to Java naming conventions?",
                "Which of the following are correct ways to declare variables?",
                "To improve readability and maintainability, you should declare _________ instead of using literal values such as 3.14159.",
                "To assign a value 1 to variable x, you write",
                "Which of the following are not valid assignment statements?",
                "____________ is the Java assignment operator.",
                "To declare a constant MAX_LENGTH inside a method with value 99.98, you write"
        };

        Library.Levels level = Library.Levels.ELEMENTARY_PROGRAMMING;
        int lessonNumber = 0;
        String[] questions = Library.getQuestions(level, lessonNumber);

        assertArrayEquals(expected, questions);

    }

    // test: retrieve Selections questions; assert question set for lesson 1
    @Test
    public void testGetQuestionsSelections() {

        String[] expected = {
                "The equal comparison operator in Java is __________.",
                "In Java, the word true is ________.",
                "Which of the following code displays the area of a circle if the radius is positive.",
                "Suppose x = 1, y = -1, and z = 1. What is the printout of the following statement? \n \n (Please indent the statement correctly first.) \n if (x > 0) \n if (y > 0) \n System.out.println(\"x > 0 and y > 0\"); \n else if (z > 0) \n System.out.println(\"x < 0 and z > 0\");",
                "Analyze the following code: \n \n boolean even = false; \n if (even = true) { \n System.out.println(\"It is even!\"); \n }",
                "Suppose isPrime is a boolean variable, which of the following is the correct and best statement for testing if isPrime is true.",
                "Analyze the following code. \n \n boolean even = false; \n if (even) { \n System.out.println(\"It is even!\"); \n }",
                "The following code displays ___________. \n \n double temperature = 50; \n if (temperature >= 100) \n System.out.println(\"too hot\"); \n else if (temperature <= 40) \n System.out.println(\"too cold\"); \n else \n System.out.println(\"just right\");",
                "Suppose income is 4001, what is the output of the following code: \n \n if (income > 3000) { \n System.out.println(\"Income is greater than 3000\"); \n } \n else if (income > 4000) { \n System.out.println(\"Income is greater than 4000\");",
                "Analyze the following code: \n \n Code 1: \n int number = 45; \n boolean even; \n if (number % 2 == 0) \n even = true; \n else \n even = false; \n Code 2: \n boolean even = (number % 2 == 0);"
        };

        Library.Levels level = Library.Levels.SELECTIONS;
        int lessonNumber = 0;
        String[] questions = Library.getQuestions(level, lessonNumber);

        assertArrayEquals(expected, questions);

    }

    // test: retrieve Functions Characters and Strings questions; assert question set for lesson 1
    @Test
    public void testGetQuestionsFunctionsCharactersStrings() {

        String[] expected = {
                "What is Math.round(3.6)?",
                "What is Math.rint(3.6)?",
                "What is Math.rint(3.5)?",
                "What is Math.ceil(3.6)?",
                "What is Math.floor(3.6)?",
                "To obtain the sine of 35 degrees, use _______.",
                "To obtain the arc sine of 0.5, use _______.",
                "Math.sin(Math.PI) returns _______.",
                "Math.asin(0.5) returns _______.",
                "Math.cos(Math.PI) returns _______."
        };

        Library.Levels level = Library.Levels.FUNCTIONS_CHARACTERS_STRINGS;
        int lessonNumber = 0;
        String[] questions = Library.getQuestions(level, lessonNumber);

        assertArrayEquals(expected, questions);

    }

    // test: retrieve Loops questions; assert question set for lesson 1
    @Test
    public void testGetQuestionsLoops() {

        String[] expected = {
                "How many times will the following code print \"Welcome to Java\"? \n \n int count = 0; \n while (count < 10) { \n System.out.println(\"Welcome to Java\"); \n count++; \n }",
                "Analyze the following code. \n \n int count = 0; \n while (count < 100) { \n // Point A \n System.out.println(\"Welcome to Java!\"); \n count++; \n // Point B \n } \n // Point C",
                "How many times will the following code print \"Welcome to Java\"? \n \n int count = 0; \n while (count++ < 10) { \n System.out.println(\"Welcome to Java\"); \n }",
                "Analyze the following fragment: \n \n double sum = 0 \n double d = 0 \n while (d != 10.0) { \n d += 0.1; \n sum += sum + d; \n }",
                "What is the value of balance after the following code is executed? \n \n int balance = 10; \n while (balance >= 1){ \n if (balance < 9) break; \n balance = balance - 9; \n }",
                "What is the output of the following fragment? \n \n int i = 1 \n int j = 1; \n while (i < 5) { \n i++; \n j = j * 2; \n }",
                "Suppose cond1 is a Boolean expressions. When will this while condition be true? \n while (cond1) ...",
                "Analyze the following code. \n \n int x = 1; \n while (0 < x) && (x < 100) \n System.out.println(x++);",
                "What balance after the following code is executed? \n \n int balance = 10; \n while (balance >= 1) { \n if (balance < 9) continue; \n balance = balance - 9; \n }"
        };

        Library.Levels level = Library.Levels.LOOPS;
        int lessonNumber = 0;
        String[] questions = Library.getQuestions(level, lessonNumber);

        assertArrayEquals(expected, questions);

    }

    // test: retrieve Methods questions; assert question set for lesson 1
    @Test
    public void testGetQuestionsMethods() {

        String[] expected = {
                "Suppose your method does not return any value, which of the following keywords can be used as a return type?",
                "The signature of a method consists of ____________.",
                "All Java applications must have a method __________.",
                "Arguments to methods always appear within __________.",
                "Each time a method is invoked, the system stores parameters and local variables in an area of memory, known as _______, which stores elements in last-in first-out fashion.",
                "Which of the following should be defined as a void method?",
                "You should fill in the blank in the following code with ______________. \n \n public class Test { \n public static void main(String[] args) { \n System.out.print(\"The grade is \"); \n printGrade(78.5); \n System.out.print(\"The grade is \"); \n printGrade(59.5); \n } \n \n public static __________ printGrade(double score) { \n if (score >= 90.0) { \n System.out.println('A'); \n } \n else if (score >= 80.0) { \n System.out.println('B'); \n } \n else if (score >= 70.0) { \n System.out.println('C'); \n } \n else if (score >= 60.0) { \n System.out.println('D'); \n } \n else { \n System.out.println('F'); \n } \n } \n }",
                "When you invoke a method with a parameter, the value of the argument is passed to the parameter. This is referred to as _________.",
                "Given the following method: \n \n static void nPrint(String message, int n) { \n while (n > 0) { \n System.out.print(message); \n n--; \n } \n } \n \n What is the printout of the call nPrint('a', 4)?",
                "Given the following method: \n \n static void nPrint(String message, int n) { \n while (n > 0) { \n System.out.print(message); \n n--; \n } \n } \n \n What is k after invoking nPrint(\"A message\", k)? \n int k = 2; \n nPrint(\"A message\", k);"
        };

        Library.Levels level = Library.Levels.METHODS;
        int lessonNumber = 0;
        String[] questions = Library.getQuestions(level, lessonNumber);

        assertArrayEquals(expected, questions);

    }

    // test: retrieve Single Dimensional Arrays questions; assert question set for lesson 1
    @Test
    public void testGetQuestionsSingleDimensionalArrays() {

        String[] expected = {
                "What is the representation of the third element in an array called a?",
                "If you declare an array double[] list = {3.4, 2.0, 3.5, 5.5}, list[1] is ________.",
                "If you declare an array double[] list = {3.4, 2.0, 3.5, 5.5}, the highest index in array list is __________.",
                "How many elements are in array double[] list = new double[5]?",
                "What is the correct term for numbers[99]?"
        };

        Library.Levels level = Library.Levels.SINGLE_DIMENSIONAL_ARRAYS;
        int lessonNumber = 0;
        String[] questions = Library.getQuestions(level, lessonNumber);

        assertArrayEquals(expected, questions);

    }

    // test: retrieve Elementary Programming answer choices; assert answer choices for lesson 1, question 1
    @Test
    public void testGetAnswerChoicesElementaryProgramming() {

        String[] expected = {"input.nextInt();", "input.nextInteger();", "input.int();", "input.integer();"};

        Library.Levels level = Library.Levels.ELEMENTARY_PROGRAMMING;
        int lessonNumber = 0;
        AnswerChoice[] answerChoices = Library.getAnswerChoices(level, lessonNumber)[0];
        String[] actual = {answerChoices[0].getContent(), answerChoices[1].getContent(), answerChoices[2].getContent(), answerChoices[3].getContent()};

        assertArrayEquals(expected, actual);

    }

    // test: retrieve Selections answer choices; assert answer choices for lesson 1, question 1
    @Test
    public void testGetAnswerChoicesSelections() {

        String[] expected = {"==", "!=", "<>", "^="};

        Library.Levels level = Library.Levels.SELECTIONS;
        int lessonNumber = 0;
        AnswerChoice[] answerChoices = Library.getAnswerChoices(level, lessonNumber)[0];
        String[] actual = {answerChoices[0].getContent(), answerChoices[1].getContent(), answerChoices[2].getContent(), answerChoices[3].getContent()};

        assertArrayEquals(expected, actual);

    }

    // test: retrieve Functions Characters and Strings answer choices; assert answer choices for lesson 1, question 1
    @Test
    public void testGetAnswerChoicesFunctionsCharactersStrings() {

        String[] expected = {"4", "3", "3.0", "4.0"};

        Library.Levels level = Library.Levels.FUNCTIONS_CHARACTERS_STRINGS;
        int lessonNumber = 0;
        AnswerChoice[] answerChoices = Library.getAnswerChoices(level, lessonNumber)[0];
        String[] actual = {answerChoices[0].getContent(), answerChoices[1].getContent(), answerChoices[2].getContent(), answerChoices[3].getContent()};

        assertArrayEquals(expected, actual);

    }

    // test: retrieve Loops answer choices; assert answer choices for lesson 1, question 1
    @Test
    public void testGetAnswerChoicesLoops() {

        String[] expected = {"10", "9", "8", "11"};

        Library.Levels level = Library.Levels.LOOPS;
        int lessonNumber = 0;
        AnswerChoice[] answerChoices = Library.getAnswerChoices(level, lessonNumber)[0];
        String[] actual = {answerChoices[0].getContent(), answerChoices[1].getContent(), answerChoices[2].getContent(), answerChoices[3].getContent()};

        assertArrayEquals(expected, actual);

    }
    
    // test: retrieve Methods answer choices; assert answer choices for lesson 1, question 1
    @Test
    public void testGetAnswerChoicesMethods() {

        String[] expected = {"void", "int", "double", "public"};

        Library.Levels level = Library.Levels.METHODS;
        int lessonNumber = 0;
        AnswerChoice[] answerChoices = Library.getAnswerChoices(level, lessonNumber)[0];
        String[] actual = {answerChoices[0].getContent(), answerChoices[1].getContent(), answerChoices[2].getContent(), answerChoices[3].getContent()};

        assertArrayEquals(expected, actual);

    }

    // test: retrieve Single Dimensional Arrays answer choices; assert answer choices for lesson 1, question 1
    @Test
    public void testGetAnswerChoicesSingleDimensionalArrays() {

        String[] expected = {"a[2]", "a(2)", "a[3]", "a(3)"};

        Library.Levels level = Library.Levels.SINGLE_DIMENSIONAL_ARRAYS;
        int lessonNumber = 0;
        AnswerChoice[] answerChoices = Library.getAnswerChoices(level, lessonNumber)[0];
        String[] actual = {answerChoices[0].getContent(), answerChoices[1].getContent(), answerChoices[2].getContent(), answerChoices[3].getContent()};

        assertArrayEquals(expected, actual);

    }

    // test: retrieve Hints questions; assert hints for lesson 1
    @Test
    public void testGetHintsElementaryProgramming() {

        String[] expected = {
                "What int comes next?",
                "Find the average.",
                "Print what's inside.",
                "camelCase notation",
                "; ends the declaration",
                "Another word for a fixed value",
                "Assignment operator.",
                "A variable cannot be assigned to a constant.",
                "The assignment operator is equivalent to assigning a variable.",
                "Same as any other variable declaration/initialization except contains another keyword."
        };

        Library.Levels level = Library.Levels.ELEMENTARY_PROGRAMMING;
        int lessonNumber = 0;
        String[] hints = Library.getHints(level, lessonNumber);

        assertArrayEquals(expected, hints);

    }
}
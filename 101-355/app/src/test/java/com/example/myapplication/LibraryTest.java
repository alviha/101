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

    // test: retrieve Elementary Programming Hints; assert hints for lesson 1
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

    // test: retrieve Selections Hints; assert hints for lesson 1
    @Test
    public void testGetHintsSelections() {

        String[] expected = {
                "'=' by itself is the assignment operator.",
                "The data  type that takes in true/false statements.",
                "Think about inequalities.",
                "y is less than 1",
                "The single '=' sets a variable's value, it does not compare two values",
                "isPrime is already a boolean data type.",
                "Even is false.",
                "Think about inequalities.",
                "If an if statement is true then the program has no reason to check the else statement.",
                "Both are either correct or incorrect."
        };

        Library.Levels level = Library.Levels.SELECTIONS;
        int lessonNumber = 0;
        String[] hints = Library.getHints(level, lessonNumber);

        assertArrayEquals(expected, hints);

    }

    // test: retrieve Functions Characters and Strings Hints; assert hints for lesson 1
    @Test
    public void testGetHintsFunctionsCharactersStrings() {

        String[] expected = {
                "round() returns an int value.",
                "rint() returns a double value",
                "rint() returns the nearest even integer as a double.",
                "ceil() returns a double value.",
                "floor() returns a double value rounded down.",
                "You are converting from degrees to _______.",
                "You are converting from degrees to _______.",
                "What is the value of y at sin(PI)?",
                "What is the arcSine of 0.5?",
                "What is the cosine of pi?"
        };

        Library.Levels level = Library.Levels.FUNCTIONS_CHARACTERS_STRINGS;
        int lessonNumber = 0;
        String[] hints = Library.getHints(level, lessonNumber);

        assertArrayEquals(expected, hints);

    }

    // test: retrieve Loops Hints; assert hints for lesson 1
    @Test
    public void testGetHintsLoops() {

        String[] expected = {
                "Prints after checking that count is less than 10.",
                "What's going at each point?",
                "Count is incremented before printing.",
                "Think about floating point numbers.",
                "Two conditions to pay attention to.",
                "2 to the \"number of loop executions\" power.",
                "Value of cond1.",
                "Look for errors.",
                "Beginning value of balance is 10."
        };

        Library.Levels level = Library.Levels.LOOPS;
        int lessonNumber = 0;
        String[] hints = Library.getHints(level, lessonNumber);

        assertArrayEquals(expected, hints);

    }

    // test: retrieve Methods Hints; assert hints for lesson 1
    @Test
    public void testGetHintsMethods() {

        String[] expected = {
                "Context clues.",
                "What method is being called and what is being passed?",
                "Required in order to run a program.",
                "What is towards the end of a method call?",
                "Push, pop, peak...",
                "Which of the methods above doesn't return a value on method call?",
                "What is the return type?",
                "Giving the parameter a _____.",
                "Pay close attention to the variable type and what is passed.",
                "Does the value change?"
        };

        Library.Levels level = Library.Levels.METHODS;
        int lessonNumber = 0;
        String[] hints = Library.getHints(level, lessonNumber);

        assertArrayEquals(expected, hints);

    }

    // test: retrieve Single Dimensional Arrays Hints; assert hints for lesson 1
    @Test
    public void testGetHintsSingleDimensionalArrays() {

        String[] expected = {
                "Arrays use regular brackets.",
                "The first value of an array is array[0].",
                "The first value of an array is array[0].",
                "array[x].. x is the size in the declaration/initialization.",
                "Past tense."
        };

        Library.Levels level = Library.Levels.SINGLE_DIMENSIONAL_ARRAYS;
        int lessonNumber = 0;
        String[] hints = Library.getHints(level, lessonNumber);

        assertArrayEquals(expected, hints);

    }

    // test: retrieve first 10 questions for pretest
    @Test
    public void testGetPreTestQuestions() {

        String[] expected = {
                "Which of the following lines is not a Java comment?",
                "Which of the following are not reserved words?",
                "Every statement in java ends with ___________.",
                "If a program compiles fine, but it produces incorrect result, then the program suffers  __________.",
                "If you forget to put a closing quotation mark on a string, what kind error will be raised?",
                "The keywords in Java are all in lowercase.",
                "_______ is the code with natural language mixed with Java code.",
                "Which of the following is a valid identifier?",
                "To declare an int variable number with initial value 2, you write _________.",
                "What is the value of (double)5/2?"
        };

        Library.Levels level = Library.Levels.SINGLE_DIMENSIONAL_ARRAYS;
        String[] allQuestions = Library.getPreTestQuestions();
        String[] firstTenQuestions = new String[10];
        for(int i = 0; i < 10; i++) {
            firstTenQuestions[i] = allQuestions[i];
        }

        assertArrayEquals(expected, firstTenQuestions);

    }

    // test: retrieve answer choices for pretest; assert first question choices
    @Test
    public void testGetPreTestAnswerChoices() {

        String[] expected = {
                "-- comments",
                "/** comments */",
                "// comments",
                "/* comments */"
        };

        AnswerChoice[][] answerChoices = Library.getPreTestAnswerChoices();
        String[] actual = {answerChoices[0][0].getContent(), answerChoices[0][1].getContent(), answerChoices[0][2].getContent(), answerChoices[0][3].getContent()};

        assertArrayEquals(expected, actual);

    }

    // test: retrieve sample lessons for elementary programming; assert sample lesson for first lesson
    @Test
    public void testGetElementaryProgrammingSampleLessons() {

        String[] expected = {
                "Introductory Lesson",
                "What is programming?",
                "Programming is the process of breaking down a large, complex task into smaller and smaller subtasks. The process continues until the subtasks are simple enough to be performed with the basic instructions provided by the computer."
        };

        Library.Levels level = Library.Levels.ELEMENTARY_PROGRAMMING;
        int lessonNumber = 0;
        String[] sampleLessons = Library.getSampleLessons(level, lessonNumber);

        assertArrayEquals(expected, sampleLessons);
    }

    // test: retrieve sample lessons for selections; assert sample lesson for first lesson
    @Test
    public void testGetSelectionsSampleLessons() {

        String[] expected = {
                "Boolean Data Types and If Statements",
                "What are boolean data types and ff statements?",
                "A boolean data type is a data type that has a value of either true or false. An if statement is a boolean conditional expression that if proved true, executes a statement or series of statements inside its corresponding braces."
        };

        Library.Levels level = Library.Levels.SELECTIONS;
        int lessonNumber = 0;
        String[] sampleLessons = Library.getSampleLessons(level, lessonNumber);

        assertArrayEquals(expected, sampleLessons);
    }

    // test: retrieve sample lessons for mathematical functions characters and strings; assert sample lesson for first lesson
    @Test
    public void testGetFunctionsCharactersStringsSampleLessons() {

        String[] expected = {
                "Common Mathematical Functions",
                "What are common mathematical functions?",
                "Common mathematical functions in java are functions more advanced than addition, subtraction, multiplication and division. These methods come from the java.lang.Math class and can be used for functions such as square root, sine, absolute value, etc."
        };

        Library.Levels level = Library.Levels.FUNCTIONS_CHARACTERS_STRINGS;
        int lessonNumber = 0;
        String[] sampleLessons = Library.getSampleLessons(level, lessonNumber);

        assertArrayEquals(expected, sampleLessons);
    }

    // test: retrieve sample lessons for loops; assert sample lesson for first lesson
    @Test
    public void testGetLoopsSampleLessons() {

        String[] expected = {
                "While Loops",
                "What are while loops?",
                "A while loop is a flow that repeatedly executes a statement or series of statements until the boolean condition stated before it is no longer true."
        };

        Library.Levels level = Library.Levels.LOOPS;
        int lessonNumber = 0;
        String[] sampleLessons = Library.getSampleLessons(level, lessonNumber);

        assertArrayEquals(expected, sampleLessons);
    }

    // test: retrieve sample lessons for methods; assert sample lesson for first lesson
    @Test
    public void testGetMethodsSampleLessons() {

        String[] expected = {
                "Defining and Calling Methods/Void Methods",
                "What does it mean to define and/or call a method?",
                "Defining a method is when a method is created by specifying its access type, return type, name, parameters and body. A method call is when a method name is stated and the appropriate parameters are supplied to it. This takes the previously created method and tells it to execute its body and return the resulting value if appropriate."
        };

        Library.Levels level = Library.Levels.METHODS;
        int lessonNumber = 0;
        String[] sampleLessons = Library.getSampleLessons(level, lessonNumber);

        assertArrayEquals(expected, sampleLessons);
    }

    // test: retrieve sample lessons for single dimensional arrays; assert sample lesson for first lesson
    @Test
    public void testGetSingleDimensionalArraysSampleLessons() {

        String[] expected = {
                "Array Basics",
                "What are Array Basics?",
                "This lesson will present the basics of arrays such as their declaration, initialization and the basic functions performed on them."
        };

        Library.Levels level = Library.Levels.SINGLE_DIMENSIONAL_ARRAYS;
        int lessonNumber = 0;
        String[] sampleLessons = Library.getSampleLessons(level, lessonNumber);

        assertArrayEquals(expected, sampleLessons);
    }
}
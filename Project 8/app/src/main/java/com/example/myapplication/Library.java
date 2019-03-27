/**
 *  Library that holds all the questions and answer choices to the challenges
 *
 * @author Bufford Brian Sta Maria
 *
 * CMSC 355, Spring 2019
 * Project A8
 * 3/26/2019
 *
 */
package com.example.myapplication;

public final class Library {

    protected enum Levels {
        ELEMENTARY_PROGRAMMING,
        SELECTIONS,
        FUNCTIONS_CHARACTERS_STRINGS,
        LOOPS,
        METHODS,
        SINGLE_DIMENSIONAL_ARRAYS;
    }

    // Questions for Elementary Programming Level
    private static String[][] elementaryProgrammingQuestions = {

            // Questions for Lesson 1 - Intro
            {
                    "Suppose a Scanner object is created as follows: \n \n Scanner input = new Scanner(System.in); \n \n What method do you use to read an int value?\n",
                    "import java.util.Scanner; \n \n public class Test1 { \n public static void main(String[] args) { \n Scanner input = new Scanner(System.in); \n System.out.print(\"Enter three numbers: \"); \n double number1 = input.nextDouble(); \n double number2 = input.nextDouble(); \n double number3 = input.nextDouble(); \n \n double average = (number1 + number2 + number3) / 3; \n \n  System.out.println(average); \n } \n }",
                    "What is the exact output of the following code? \n \n double area = 3.5; \n System.out.print(\"area\"); \n System.out.print(area);",
                    "Which of the following are correct names for variables according to Java naming conventions?",
                    "Which of the following are correct ways to declare variables?",
                    "To improve readability and maintainability, you should declare _________ instead of using literal values such as 3.14159.",
                    "To assign a value 1 to variable x, you write",
                    "Which of the following are not valid assignment statements?",
                    "____________ is the Java assignment operator.",
                    "To declare a constant MAX_LENGTH inside a method with value 99.98, you write"
            },

            // Questions for Lesson 2 - Numeric Data Types and Operations
            {

                    "Which of these data types requires the most amount of memory?",
                    "If a number is too large to be stored in a variable of the float type, it _____________.",
                    "Analyze the following code: \n \n public class Test { \n  public static void main(String[] args) { \n int n = 10000 * 10000 * 10000; \n System.out.println(\"n is \" + n); \n } \n }",
                    "What is the result of 45/4?",
                    "Which of the following expression results in a value 1?",
                    "25 % 1 is _____",
                    "-25 % 5 is _____",
                    "-24 % 5 is _____",
                    "-24 % -5 is _____",
                    "Math.pow(2, 3) returns __________.",
                    "Math.pow(4, 1 / 2) returns __________.",
                    "Math.pow(4, 1.0 / 2) returns __________.",
                    "The __________ method returns a raised to the power of b.",
                    "Which of these data types requires the least amount of memory?"

            },

            // Questions for Lesson 3
            {
                    "This is the first question for lesson 3 in Elementary Programming",
                    "This is the second question for lesson 3 in Elementary Programming",
            },
            // Questions for Lesson 4
            {
                    "This is the first question for lesson 4 in Elementary Programming",
                    "This is the second question for lesson 4 in Elementary Programming",
                    "This is the third question for lesson 4 in Elementary Programming"
            }
    };

    // Questions for Selections Level
    private static String[][] selectionsQuestions = {

            // Questions for Lesson 1
            {
                    "This is the first question for lesson 1 in Selections",
                    "This is the second question for lesson 1 in Selections",
                    "This is the third question for lesson 1 in Selections",
                    "This is the fourth question for lesson 1 in Selections",
                    "This is the fifth question for lesson 1 in Selections"
            },

            // Questions for Lesson 2
            {
                    "This is the first question for lesson 2 in Selections",
                    "This is the second question for lesson 2 in Selections",
                    "This is the third question for lesson 2 in Selections",
                    "This is the fourth question for lesson 2 in Selections",
                    "This is the fifth question for lesson 2 in Selections"
            },

            // Questions for Lesson 3
            {
                    "This is the first question for lesson 3 in Selections",
                    "This is the second question for lesson 3 in Selections",
                    "This is the third question for lesson 3 in Selections",
                    "This is the fourth question for lesson 3 in Selections",
                    "This is the fifth question for lesson 3 in Selections"
            }
    };

    // Questions for Functions Characters and Strings Level
    private static String[][] functionsCharactersStringsQuestions = {

            // Questions for Lesson 1 - Common mathematical functions
            {
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
            },

            // Questions for Lesson 2 - Character Data Type and Operations
            {
                    "Which of the following is the correct expression of character 4?",
                    "A Java character is stored in __________.",
                    "Suppose x is a char variable with a value 'b'. \n What is the printout of the statement System.out.println(++x)?",
                    "Which of the following statement prints smith\\exam1\\test.txt?",
                    "The Unicode of 'a' is 97. What is the Unicode for 'c'?",
                    "What is the printout of System.out.println('z' - 'a')?",
                    "'3' - '2' + 'm' / 'n' is ______.",
                    "To check whether a char variable ch is an uppercase letter, you write ___________.",
                    "Which of following is not a correct method in Character?",
                    "Suppose Character x = new Character('a'), __________________ returns true."
            },

            // Questions for Lesson 3
            {
                    "This is the first question for lesson 3 in Functions Characters and Strings",
                    "This is the second question for lesson 3 in Functions Characters and Strings",
                    "This is the third question for lesson 3 in Functions Characters and Strings",
                    "This is the fourth question for lesson 3 in Functions Characters and Strings",
                    "This is the fifth question for lesson 3 in Functions Characters and Strings"
            }
    };

    // Questions for Loops Level
    private static String[][] loopsQuestions = {

            // Questions for Lesson 1 - While
            {
                    "How many times will the following code print \"Welcome to Java\"? \n \n int count = 0; \n while (count < 10) { \n System.out.println(\"Welcome to Java\"); \n count++; \n }",
                    "Analyze the following code. \n \n int count = 0; \n while (count < 100) { \n // Point A \n System.out.println(\"Welcome to Java!\"); \n count++; \n // Point B \n } \n // Point C",
                    "How many times will the following code print \"Welcome to Java\"? \n \n int count = 0; \n while (count++ < 10) { \n System.out.println(\"Welcome to Java\"); \n }",
                    "Analyze the following fragment: \n \n double sum = 0 \n double d = 0 \n while (d != 10.0) { \n d += 0.1; \n sum += sum + d; \n }",
                    "What is the value of balance after the following code is executed? \n \n int balance = 10; \n while (balance >= 1){ \n if (balance < 9) break; \n balance = balance - 9; \n }",
                    "What is the output of the following fragment? \n \n int i = 1 \n int j = 1; \n while (i < 5) { \n i++; \n j = j * 2; \n }",
                    "Suppose cond1 is a Boolean expressions. When will this while condition be true? \n while (cond1) ...",
                    "Analyze the following code. \n \n int x = 1; \n while (0 < x) && (x < 100) \n System.out.println(x++);",
                    "What balance after the following code is executed? \n \n int balance = 10; \n while (balance >= 1) { \n if (balance < 9) continue; \n balance = balance - 9; \n }"
            },

            // Questions for Lesson 2 - For
            {
                    "Analyze the following statement: \n \n double sum = 0; \n for (double d = 0; d < 10;) { \n d += 0.1; \n sum += sum + d; \n }",
                    "Which of the following loops prints \"Welcome to Java\" 10 times? \n \n A: \n for (int count = 1; count <= 10; count++) { \n System.out.println(\"Welcome to Java\"); \n } \n \n B: \n for (int count = 0; count < 10; count++) { \n System.out.println(\"Welcome to Java\"); \n } \n \n C: \n for (int count = 1; count < 10; count++) { \n System.out.println(\"Welcome to Java\"); \n } \n \n D: \n for (int count = 0; count <= 10; count++) { \n System.out.println(\"Welcome to Java\"); \n }",
                    "Which of the following loops correctly computes 1/2 + 2/3 + 3/4 + ... + 99/100? \n \n A: \n double sum = 0; \n for (int i = 1; i <= 99; i++) { \n sum = i / (i + 1); \n } \n System.out.println(\"Sum is \" + sum); \n \n B: \n double sum = 0; \n for (int i = 1; i < 99; i++) { \n sum += i / (i + 1); \n } \n System.out.println(\"Sum is \" + sum); \n \n C: \n double sum = 0; \n for (int i = 1; i <= 99; i++) { \n sum += 1.0 * i / (i + 1); \n } \n System.out.println(\"Sum is \" + sum); \n \n D: \n double sum = 0; \n for (int i = 1; i <= 99; i++) { \n sum += i / (i + 1.0); \n } \n System.out.println(\"Sum is \" + sum);",
                    "The following loop displays _______________. \n \n for (int i = 1; i <= 10; i++) { \n System.out.print(i + \" \"); \n i++; \n }",
                    "What is the output for y? \n \n int y = 0; \n for (int i = 0; i&lt;10; ++i) { \n y += i; \n } \n System.out.println(y);",
                    "What is i after the following for loop? \n \n int y = 0; \n for (int i = 0; i&lt;10; ++i) { \n y += i;  \n }",
                    "How many times is the println statement executed? \n \n for (int i = 0; i < 10; i++) \n for (int j = 0; j < i; j++) \n System.out.println(i * j)",
                    "What is the printout after the following loop terminates? \n \n int number = 25; \n int i; \n boolean isPrime = true; \n for (i = 2; i < number && isPrime; i++) { \n  if (number % i == 0) { \n isPrime = false; \n } \n }",
                    "What is the printout after the following loop terminates? \n \n int number = 25; \n int i; \n boolean isPrime = true; \n for (i = 2; i < number; i++) { \n if (number % i == 0) { \n isPrime = false; break; \n } \n }",
                    "What is the number of iterations in the following loop: \n \n for (int i = 1; i < n; i++) { \n // iteration \n }"
            },

            // Questions for Lesson 3
            {
                    "This is the first question for lesson 3 in Loops",
                    "This is the second question for lesson 3 in Loops",
                    "This is the third question for lesson 3 in Loops",
                    "This is the fourth question for lesson 3 in Loops",
                    "This is the fifth question for lesson 3 in Loops"
            }
    };

    // Questions for Methods Level
    private static String[][] methodsQuestions = {

            // Questions for Lesson 1
            {
                    "This is the first question for lesson 1 in Methods",
                    "This is the second question for lesson 1 in Methods",
                    "This is the third question for lesson 1 in Methods",
                    "This is the fourth question for lesson 1 in Methods",
                    "This is the fifth question for lesson 1 in Methods"
            },

            // Questions for Lesson 2
            {
                    "This is the first question for lesson 2 in Methods",
                    "This is the second question for lesson 2 in Methods",
                    "This is the third question for lesson 2 in Methods",
                    "This is the fourth question for lesson 2 in Methods",
                    "This is the fifth question for lesson 2 in Methods"
            },

            // Questions for Lesson 3
            {
                    "This is the first question for lesson 3 in Methods",
                    "This is the second question for lesson 3 in Methods",
                    "This is the third question for lesson 3 in Methods",
                    "This is the fourth question for lesson 3 in Methods",
                    "This is the fifth question for lesson 3 in Methods"
            }
    };

    // Questions for Single Dimensional Arrays Level
    private static String[][] singleDimensionalArraysQuestions = {

            // Questions for Lesson 1
            {
                    "This is the first question for lesson 1 in Single Dimensional Arrays",
                    "This is the second question for lesson 1 in Single Dimensional Arrays",
                    "This is the third question for lesson 1 in Single Dimensional Arrays",
                    "This is the fourth question for lesson 1 in Single Dimensional Arrays",
                    "This is the fifth question for lesson 1 in Single Dimensional Arrays"
            },

            // Questions for Lesson 2
            {
                    "This is the first question for lesson 2 in Single Dimensional Arrays",
                    "This is the second question for lesson 2 in Single Dimensional Arrays",
                    "This is the third question for lesson 2 in Single Dimensional Arrays",
                    "This is the fourth question for lesson 2 in Single Dimensional Arrays",
                    "This is the fifth question for lesson 2 in Single Dimensional Arrays"
            },

            // Questions for Lesson 3
            {
                    "This is the first question for lesson 3 in Single Dimensional Arrays",
                    "This is the second question for lesson 3 in Single Dimensional Arrays",
                    "This is the third question for lesson 3 in Single Dimensional Arrays",
                    "This is the fourth question for lesson 3 in Single Dimensional Arrays",
                    "This is the fifth question for lesson 3 in Single Dimensional Arrays"
            }
    };

    // Answer choices for Elementary Programming Level
    private static AnswerChoice[][][] elementaryProgrammingAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("input.nextInt();", true),
                            new AnswerChoice("input.nextInteger();", false),
                            new AnswerChoice("input.int();", false),
                            new AnswerChoice("input.integer();", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("2.0", true),
                            new AnswerChoice("1.0", false),
                            new AnswerChoice("3.0", false),
                            new AnswerChoice("4.0", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("area3.5", true),
                            new AnswerChoice("3.53.5", false),
                            new AnswerChoice("3.5 3.5", false),
                            new AnswerChoice("area 3.5", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("findArea", true),
                            new AnswerChoice("Radius", false),
                            new AnswerChoice("RADIUS", false),
                            new AnswerChoice("FindArea", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("int length; int width;", true),
                            new AnswerChoice("int length, width;", true),
                            new AnswerChoice("int length; width;", false),
                            new AnswerChoice("int length, int width;", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("constants", true),
                            new AnswerChoice("variables", false),
                            new AnswerChoice("methods", false),
                            new AnswerChoice("classes", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("x = 1;", true),
                            new AnswerChoice("1 = x;", false),
                            new AnswerChoice("x == 1;", false),
                            new AnswerChoice("1 := x;", false)
                    },

                    //Question 8 choices
                    {
                            new AnswerChoice("55 = x;", true),
                            new AnswerChoice("x = 55;", false),
                            new AnswerChoice("x = 56 + y;", false),
                            new AnswerChoice("x += 3;", false)

                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("=", true),
                            new AnswerChoice("==", false),
                            new AnswerChoice(":=", false),
                            new AnswerChoice("=:", false)
                    },

                    //Question 10 choices
                    {
                            new AnswerChoice("final double MAX_LENGTH = 99.98;", true),
                            new AnswerChoice("final MAX_LENGTH = 99.98;", false),
                            new AnswerChoice("final float MAX_LENGTH = 99.98;", false),
                            new AnswerChoice("double MAX_LENGTH = 99.98;", false)
                    }
            },

            // Lesson 2
            {
                    // Question 1 choices
                    {
                            new AnswerChoice("long", true),
                            new AnswerChoice("int", false),
                            new AnswerChoice("short", false),
                            new AnswerChoice("byte", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("causes overflow", true),
                            new AnswerChoice("causes underflow", false),
                            new AnswerChoice("causes no error", false),
                            new AnswerChoice("cannot happen in Java", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("The result of 10000 * 10000 * 10000 is too large to be stored in an int variable n. This causes an overflow and the program continues to execute because Java does not report errors on overflow.", true),
                            new AnswerChoice("The program displays n is 1000000000000", false),
                            new AnswerChoice("The result of 10000 * 10000 * 10000 is too large to be stored in an int variable n. This causes an overflow and the program is aborted.", false),
                            new AnswerChoice("The result of 10000 * 10000 * 10000 is too large to be stored in an int variable n. This causes an underflow and the program is aborted.", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("11", true),
                            new AnswerChoice("10", false),
                            new AnswerChoice("12", false),
                            new AnswerChoice("11.25", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("37 % 6", true),
                            new AnswerChoice("25 % 5", false),
                            new AnswerChoice("15 % 4", false),
                            new AnswerChoice("2 % 1", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("0", true),
                            new AnswerChoice("2", false),
                            new AnswerChoice("3", false),
                            new AnswerChoice("4", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("0", true),
                            new AnswerChoice("1", false),
                            new AnswerChoice("2", false),
                            new AnswerChoice("4", false)
                    },

                    // Question 8 choices
                    {
                            new AnswerChoice("-4", true),
                            new AnswerChoice("-1", false),
                            new AnswerChoice("-7", false),
                            new AnswerChoice("4", false)
                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("-4", true),
                            new AnswerChoice("4", false),
                            new AnswerChoice("-3", false),
                            new AnswerChoice("3", false)
                    },

                    // Question 10 choices
                    {
                            new AnswerChoice("8.0", true),
                            new AnswerChoice("8", false),
                            new AnswerChoice("9", false),
                            new AnswerChoice("9.0", false)
                    },

                    // Question 11 choices
                    {
                            new AnswerChoice("1.0", true),
                            new AnswerChoice("2", false),
                            new AnswerChoice("0", false),
                            new AnswerChoice("2.0", false)
                    },

                    // Question 12 choices
                    {
                            new AnswerChoice("2.0", true),
                            new AnswerChoice("2", false),
                            new AnswerChoice("0", false),
                            new AnswerChoice("1.0", false)
                    },

                    // Question 13 choices
                    {
                            new AnswerChoice("Math.pow(a, b)", true),
                            new AnswerChoice("Math.pow(b, a)", false),
                            new AnswerChoice("Math.exponent(a, b)", false),
                            new AnswerChoice("Math.power(a, b)", false)
                    },

                    // Question 14 choices
                    {
                            new AnswerChoice("byte", true),
                            new AnswerChoice("short", false),
                            new AnswerChoice("double", false),
                            new AnswerChoice("float", false)
                    }

            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            },

            //Lesson 4
            {

            }
    };

    // Answer choices for Selections Level
    private static AnswerChoice[][][] selectionsAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            }
    };

    // Answer choices for Functions Characters Strings Level
    private static AnswerChoice[][][] functionsCharactersStringsAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("4", true),
                            new AnswerChoice("3", false),
                            new AnswerChoice("3.0", false),
                            new AnswerChoice("4.0", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("4.0", true),
                            new AnswerChoice("5.0", false),
                            new AnswerChoice("3", false),
                            new AnswerChoice("3.0", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("4.0", true),
                            new AnswerChoice("3", false),
                            new AnswerChoice("4.0", false),
                            new AnswerChoice("3.0", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("4.0", true),
                            new AnswerChoice("3", false),
                            new AnswerChoice("3.0", false),
                            new AnswerChoice("5.0", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("3.0", true),
                            new AnswerChoice("3", false),
                            new AnswerChoice("4", false),
                            new AnswerChoice("5.0", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("Math.sin(Math.toRadians(35))", true),
                            new AnswerChoice("Math.sin(35)", false),
                            new AnswerChoice("Math.sin(Math.toDegrees(35))", false),
                            new AnswerChoice("Math.sin(Math.toRadian(35))", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("Math.asin(0.5)", true),
                            new AnswerChoice("Math.asin(Math.toDegrees(0.5))", false),
                            new AnswerChoice("Math.sin(Math.toRadian(0.5))", false),
                            new AnswerChoice("Math.sin(0.5)", false)
                    },

                    // Question 8 choices
                    {
                            new AnswerChoice("0.0", true),
                            new AnswerChoice("1.0", false),
                            new AnswerChoice("0.5", false),
                            new AnswerChoice("0.4", false)
                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("Math.toRadians(30)", true),
                            new AnswerChoice("30", false),
                            new AnswerChoice("Math.PI / 4", false),
                            new AnswerChoice("Math.PI / 2", false)
                    },

                    // Question 10 choices
                    {
                            new AnswerChoice("-1.0", true),
                            new AnswerChoice("1.0", false),
                            new AnswerChoice("0.0", false),
                            new AnswerChoice("0.5", false)
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("'4'", true),
                            new AnswerChoice("'\\0004'", false),
                            new AnswerChoice("\"4\"", false),
                            new AnswerChoice("4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("two bytes", true),
                            new AnswerChoice("one byte", false),
                            new AnswerChoice("three bytes", false),
                            new AnswerChoice("four bytes", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("c", true),
                            new AnswerChoice("d", false),
                            new AnswerChoice("a", false),
                            new AnswerChoice("b", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("System.out.println(\"smith\\\\exam1\\\\test.txt\");", true),
                            new AnswerChoice("System.out.println(\"smith\\exam1\\test.txt\");", false),
                            new AnswerChoice("System.out.println(\"smith\\\"exam1\\\"test.txt\");", false),
                            new AnswerChoice("System.out.println(\"smith\"\\exam1\"\\test.txt\");", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("99", true),
                            new AnswerChoice("98", false),
                            new AnswerChoice("97", false),
                            new AnswerChoice("96", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("25", true),
                            new AnswerChoice("26", false),
                            new AnswerChoice("a", false),
                            new AnswerChoice("z", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("1", true),
                            new AnswerChoice("2", false),
                            new AnswerChoice("3", false),
                            new AnswerChoice("0", false)
                    },

                    // Question 8 choices
                    {
                            new AnswerChoice("(ch >= 'A' && ch <= 'Z')", true),
                            new AnswerChoice("(ch >= 'A' && ch >= 'Z')", false),
                            new AnswerChoice("(ch >= 'A' || ch <= 'Z')", false),
                            new AnswerChoice("('A' <= ch <= 'Z')", false)
                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("isDigit()", true),
                            new AnswerChoice("isLetter(char)", false),
                            new AnswerChoice("isLetterOrDigit(char)", false),
                            new AnswerChoice("toLowerCase(char)", false)
                    },

                    // Question 10 choices
                    {
                            new AnswerChoice("x.equals('a')", true),
                            new AnswerChoice("x.equalsIgnoreCase('A')", false),
                            new AnswerChoice("x.compareToIgnoreCase('A')", false),
                            new AnswerChoice("x.equals(\"a\")", false)
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            }
    };

    // Answer choices for Loops Level
    private static AnswerChoice[][][] loopsAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("10", true),
                            new AnswerChoice("9", false),
                            new AnswerChoice("8", false),
                            new AnswerChoice("11", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("count < 100 is always true at Point A", true),
                            new AnswerChoice("count < 100 is always true at Point B", false),
                            new AnswerChoice("count < 100 is always false at Point B", false),
                            new AnswerChoice("count < 100 is always true at Point C", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("10", true),
                            new AnswerChoice("9", false),
                            new AnswerChoice("8", false),
                            new AnswerChoice("11", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("The program may not stop because of the phenomenon referred to as numerical inaccuracy for operating with floating-point numbers.", true),
                            new AnswerChoice("The program does not compile because sum and d are declared double, but assigned with integer value 0.", false),
                            new AnswerChoice("The program never stops because d is always 0.1 inside the loop.", false),
                            new AnswerChoice("After the loop, sum is 0 + 0.1 + 0.2 + 0.3 + ... + 1.9", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("1", true),
                            new AnswerChoice("2", false),
                            new AnswerChoice("0", false),
                            new AnswerChoice("-1", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("16", true),
                            new AnswerChoice("32", false),
                            new AnswerChoice("8", false),
                            new AnswerChoice("4", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("in case cond1 is true", true),
                            new AnswerChoice("in case cond1 is false", false),
                            new AnswerChoice("always true", false),
                            new AnswerChoice("always false", false)
                    },

                    // Question 8 choices
                    {
                            new AnswerChoice("The code does not compile because (0 < x) && (x < 100) is not enclosed in a pair of parentheses.", true),
                            new AnswerChoice("The loop runs forever.", false),
                            new AnswerChoice("The code does not compile because the loop body is not in the braces.", false),
                            new AnswerChoice("The numbers 1 to 99 are displayed.", false)
                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("The loop does not end", true),
                            new AnswerChoice("1", false),
                            new AnswerChoice("0", false),
                            new AnswerChoice("-1", false)
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("The program compiles and runs fine.", true),
                            new AnswerChoice("The program runs in an infinite loop because d&lt;10 would always be true.", false),
                            new AnswerChoice("The program has a compile error because the control variable in the for loop cannot be of the double type.", false),
                            new AnswerChoice("The program has a compile error because the adjustment is missing in the for loop.", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("AB", true),
                            new AnswerChoice("AC", false),
                            new AnswerChoice("ABC", false),
                            new AnswerChoice("BD", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("CD", true),
                            new AnswerChoice("ABCD", false),
                            new AnswerChoice("B", false),
                            new AnswerChoice("C", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("1 3 5 7 9", true),
                            new AnswerChoice("1 2 3 4 5", false),
                            new AnswerChoice("1 2 3 4 5 6 7 8 9 10", false),
                            new AnswerChoice("1 2 3 4 5 6 7 8 9", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("45", true),
                            new AnswerChoice("10", false),
                            new AnswerChoice("11", false),
                            new AnswerChoice("12", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("undefined", true),
                            new AnswerChoice("9", false),
                            new AnswerChoice("11", false),
                            new AnswerChoice("10", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("45", true),
                            new AnswerChoice("20", false),
                            new AnswerChoice("10", false),
                            new AnswerChoice("100", false)
                    },

                    // Question 8 choices
                    {
                            new AnswerChoice("i is 6 isPrime is false", true),
                            new AnswerChoice("i is 6 isPrime is true", false),
                            new AnswerChoice("i is 5 isPrime is false", false),
                            new AnswerChoice("i is 5 isPrime is true", false)
                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("i is 5 isPrime is false", true),
                            new AnswerChoice("i is 5 isPrime is true", false),
                            new AnswerChoice("i is 6 isPrime is true", false),
                            new AnswerChoice("i is 6 isPrime is false", false)
                    },

                    // Question 10 choices
                    {
                            new AnswerChoice("n - 1", true),
                            new AnswerChoice("n + 1", false),
                            new AnswerChoice("2*n", false),
                            new AnswerChoice("n", false)
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            }
    };

    // Answer choices for Methods Level
    private static AnswerChoice[][][] methodsAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            }
    };

    // Answer choices for Single Dimensional Arrays Level
    private static AnswerChoice[][][] singleDimensionalArraysAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("Choice 1", true),
                            new AnswerChoice("Choice 2", false),
                            new AnswerChoice("Choice 3", false),
                            new AnswerChoice("Choice 4", false)
                    }
            }
    };

    /**
     * Return questions from a level's lesson
     *
     * @param level  the level (ELEMENTARY_PROGRAMMING, SELECTIONS, ETC.)
     * @param lesson the lesson number (first lesson is 0)
     * @return the set of questions from the specified level and lesson number
     */
    public static String[] getQuestions(Levels level, int lesson) {

        if (level == Levels.ELEMENTARY_PROGRAMMING) {
            return elementaryProgrammingQuestions[lesson];
        }
        else if (level == Levels.SELECTIONS) {
            return selectionsQuestions[lesson];
        }
        else if (level == Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return functionsCharactersStringsQuestions[lesson];
        }
        else if (level == Levels.LOOPS) {
            return loopsQuestions[lesson];
        }
        else if (level == Levels.METHODS) {
            return methodsQuestions[lesson];
        }
        else {
            return singleDimensionalArraysQuestions[lesson];
        }
    }

    /**
     * Return answer choices for the questions from a level's lesson
     * @param level the level (ELEMENTARY_PROGRAMMING, SELECTIONS, ETC.)
     * @param lesson the lesson number (first lesson is 0)
     * @return the set of answer choices from questions from the specified level and lesson number
     */
    public static AnswerChoice[][] getAnswerChoices(Levels level, int lesson) {

        if (level == Levels.ELEMENTARY_PROGRAMMING) {
            return elementaryProgrammingAnswerChoices[lesson];
        }
        else if (level == Levels.SELECTIONS) {
            return selectionsAnswerChoices[lesson];
        }
        else if (level == Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return functionsCharactersStringsAnswerChoices[lesson];
        }
        else if (level == Levels.LOOPS) {
            return loopsAnswerChoices[lesson];
        }
        else if (level == Levels.METHODS) {
            return methodsAnswerChoices[lesson];
        }
        else {
            return singleDimensionalArraysAnswerChoices[lesson];
        }
    }
}

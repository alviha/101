/**
 * Library that holds all the questions and answer choices to the challenges
 *
 * @author Bufford Brian Sta Maria
 * <p>
 * CMSC 355, Spring 2019
 * Project A8
 * 3/26/2019
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
                    "If you enter 1 2 3, when you run this program, what will be the output? \n \n import java.util.Scanner; \n \n public class Test1 { \n public static void main(String[] args) { \n Scanner input = new Scanner(System.in); \n System.out.print(\"Enter three numbers: \"); \n double number1 = input.nextDouble(); \n double number2 = input.nextDouble(); \n double number3 = input.nextDouble(); \n \n double average = (number1 + number2 + number3) / 3; \n \n  System.out.println(average); \n } \n }",
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
            }
    };

    // Questions for Selections Level
    private static String[][] selectionsQuestions = {

            // Questions for Lesson 1 - 3.3-3.9
            {
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
            },

            // Questions for Lesson 2
            {
                    "Which of the following is the correct expression that evaluates to true if the number x is between 1 and 100 or the number is negative?",
                    "Assume x = 4 and y = 5, Which of the following is true?",
                    "Assume x = 4, Which of the following is true?",
                    "Given |x - 2| <= 4, Which of the following is true?",
                    "Given |x - 2| >= 4, Which of the following is true?",
                    "Analyze the following program fragment: \n \n int x; \n double d = 1.5; \n switch (d) { \n case 1.0: x = 1; \n case 1.5: x = 2; \n case 2.0: x = 3; \n }",
                    "What is y after the following switch statement? \n \n int x = 0; \n int y = 0; \n switch (x + 1)  { \n case 0: y = 0; \n case 1: y = 1; \n default: y = -1 \n }",
                    "What is y after the following switch statement is executed? \n \n int x = 3; int y = 4; \n switch (x + 3) { \n case 6:  y = 0; \n case 7:  y = 1; \n default: y += 1; \n }",
                    "Analyze the following code fragments that assign a boolean value to the variable even. \n \n Code 1: \n if (number % 2 == 0) \n even = true; \n else \n even = false; \n Code 2: \n even = (number % 2 == 0) ? true: false; \n Code 3: \n even = number % 2 == 0;",
                    "What is the output of the following code? \n \n boolean even = false; \n System.out.println((even ? \"true\" : \"false\"));"
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
            },

            // Questions for Lesson 4
            {
                    "This is the first question for lesson 4 in Functions Characters and Strings",
                    "This is the second question for lesson 4 in Functions Characters and Strings",
                    "This is the third question for lesson 4 in Functions Characters and Strings",
                    "This is the fourth question for lesson 4 in Functions Characters and Strings",
                    "This is the fifth question for lesson 4 in Functions Characters and Strings"
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

            // Questions for Lesson 1 - 6.2-6.7
            {
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
            },

            // Questions for Lesson 2 - 6.8-6.11
            {
                    "Analyze the following code: \n \n public class Test { \n public static void main(String[] args) { \n System.out.println(xMethod(5, 500L)); \n } \n public static int xMethod(int n, long l) { \n System.out.println(\"int, long\"); \n return n; \n } \n public static long xMethod(long n, long l) { \n System.out.println(\"long, long\"); \n return n; \n } \n }",
                    "Analyze the following code: \n \n class Test { \n public static void main(String[] args) { \n System.out.println(xmethod(5)); \n } \n public static int xmethod(int n, long t) { \n System.out.println(\"int\"); \n return n; \n } \n public static long xmethod(long n) { \n System.out.println(\"long\"); \n return n; \n } \n }",
                    "Analyze the following code. \n \n public class Test { \n public static void main(String[] args)  { \n System.out.println(max(1, 2)); \n } \n public static double max(int num1, double num2) { \n System.out.println(\"max(int, double) is invoked\"); \n if (num1 > num2) \n return num1; \n else \n return num2; \n } \n \n public static double max(double num1, int num2) { \n System.out.println(\"max(double, int) is invoked\"); \n if (num1 > num2) \n return num1; \n else \n return num 2; \n } \n }",
                    "Analyze the following code. \n \n public class Test { \n public static void main(String[] args)  { \n System.out.println(m(2)); \n } \n public static int m(int num) { \n return num; \n } \n public static void m(int num) { \n System.out.println(num); \n } \n }",
                    "A variable defined inside a method is referred to as __________.",
                    "What is k after the following block executes? \n \n { \n int k = 2; \n nPrint(\"A message\", k); \n } \n System.out.println(k);",
                    "(int)(Math.random() * (65535 + 1)) returns a random number __________.",
                    "(int)('a' + Math.random() * ('z' - 'a' + 1)) returns a random number __________.",
                    "(char)('a' + Math.random() * ('z' - 'a' + 1)) returns a random character __________.",
                    "__________ is to implement one method in the structure chart at a time from the top to the bottom."
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

            // Questions for Lesson 1 - Array basics
            {
                    "What is the representation of the third element in an array called a?",
                    "If you declare an array double[] list = {3.4, 2.0, 3.5, 5.5}, list[1] is ________.",
                    "If you declare an array double[] list = {3.4, 2.0, 3.5, 5.5}, the highest index in array list is __________.",
                    "How many elements are in array double[] list = new double[5]?",
                    "What is the correct term for numbers[99]?"
            },

            // Questions for Lesson 2 - Copying arrays
            {
                    "In the following code, what is the printout for list2? \n \n class Test { \n public static void main(String[] args) { \n int[] list1 = {1, 2, 3}; \n int[] list2 = {1, 2, 3}; \n list2 = list1; \n list1[0] = 0; list1[1] = 1; list2[2] = 2; \n for (int i = 0; i < list2.length; i++) \n System.out.print(list2[i] + \" \"); \n } \n }",
                    "In the following code, what is the printout for list1? \n \n class Test { \n public static void main(String[] args) { \n int[] list1 = {1, 2, 3}; \n int[] list2 = {1, 2, 3}; \n list2 = list1; \n list1[0] = 0; list1[1] = 1; list2[2] = 2; \n for (int i = 0; i < list1.length; i++) \n System.out.print(list1[i] + \" \"); \n } \n }",
                    "Analyze the following code: \n \n public class Test { \n public static void main(String[] args) { \n int[] x = {1, 2, 3, 4}; \n int[] y = x; \n x = new int[2]; \n for (int i = 0; i < y.length; i++) \n System.out.print(y[i] + \" \"); \n } \n }",
                    "Analyze the following code: \n \n public class Test { \n public static void main(String[] args) { \n int[] x = {1, 2, 3, 4}; \n int[] y = x; \n x = new int[2]; \n for (int i = 0; i < x.length; i++) \n System.out.print(x[i] + \" \"); \n } \n }",
                    "Analyze the following code: \n \n public class Test { \n public static void main(String[] args) { \n final int[] x = {1, 2, 3, 4}; \n int[] y = x; \n x = new int[2]; \n for (int i = 0; i < y.length; i++) \n System.out.print(y[i] + \" \"); \n } \n }"
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

    // Hints for Elementary Programming Level
    private static String[][] elementaryProgrammingHints = {

            // Hints for Lesson 1
            {
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
            },

            // Hints for Lesson 2
            {
                    "Which one implies it will use more memory?",
                    "Can happen to a river during a hurricane.",
                    "Can happen to a river during a hurricane.",
                    "How many times does 4 go into 45 evenly.",
                    "The remainder after division.",
                    "The remainder after division.",
                    "The remainder after division.",
                    "The remainder after division.",
                    "The remainder after division.",
                    "Returns a double value.",
                    "Note that 1 / 2 is 0.",
                    "Returns a double value.",
                    "An abbreviated version.",
                    "Similar to how the smallest sizes of candy bars are ____ sized."
            },

            // Hints for Lesson 3

            {
                    "Lesson 3 Hint 1",
                    "Lesson 3 Hint 2"
            }
    };

    // Hints for Selections Level
    private static String[][] selectionsHints = {

            // Hints for Lesson 1
            {
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
            },

            // Hints for Lesson 2
            {
                    "Think of inequalities.",
                    "'||' means or, '&&' means and.",
                    "'!' means not.",
                    "Keep in mind it's the absolute value of x-2.",
                    "'||' means or, '&&' means and.",
                    "Pay attention to variable types.",
                    "y will go to the default case if one of the other cases isn’t invoked.",
                    "Switch statements are similar to if statements.",
                    "All three are choices are correct but which one is preferred?",
                    "What boolean value is even equal to.?"
            },

            // Hints for Lesson 3
            {
                    "Lesson 3 Hint 1",
                    "Lesson 3 Hint 2",
                    "Lesson 3 Hint 3",
                    "Lesson 3 Hint 4",
                    "Lesson 3 Hint 5"
            }
    };

    // Hints for functionsCharactersStringsHints Level
    private static String[][] functionsCharactersStringsHints = {

            // Hints for Lesson 1
            {
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
            },

            // Hints for Lesson 2
            {
                    "Quotations.",
                    "Java characters use Unicode encoding.",
                    "x increments to the next letter of the alphabet.",
                    "The character '\\' is an escape character and needs to be escaped when used as part of a String.",
                    "Since c is two letters after a the same applies to digits.",
                    "How many letters are in between z and a?",
                    "Singular.",
                    "Make sure the value is between all uppercase characters.",
                    "Missing parameter.",
                    "‘a’ isn’t a String."
            },

            // Hints for Lesson 3
            {
                    "Lesson 3 Hint 1",
                    "Lesson 3 Hint 2",
                    "Lesson 3 Hint 3",
                    "Lesson 3 Hint 4",
                    "Lesson 3 Hint 5"
            },

            // Hints for Lesson 4
            {
                    "Lesson 4 Hint 1",
                    "Lesson 4 Hint 2",
                    "Lesson 4 Hint 3",
                    "Lesson 4 Hint 4",
                    "Lesson 4 Hint 5"
            }
    };

    // Hints for loops Level
    private static String[][] loopsHints = {

            // Hints for Lesson 1
            {
                    "Prints after checking that count is less than 10.",
                    "What's going at each point?",
                    "Count is incremented before printing.",
                    "Think about floating point numbers.",
                    "Two conditions to pay attention to.",
                    "2 to the \"number of loop executions\" power.",
                    "Value of cond1.",
                    "Look for errors.",
                    "Beginning value of balance is 10."
            },

            // Hints for Lesson 2
            {
                    "Are there any errors?",
                    "Two correct answers.",
                    "Two correct answers.",
                    "Increments twice.",
                    "y+=i is the same as y = y + i.",
                    "The scope of i is inside the loop.",
                    "Pay close attention to the i++ and j++.",
                    "Final value of i and final value of isPrime.",
                    "Final value of i and final value of isPrime.",
                    "How many times does the loop execute if i < n."
            },

            // Hints for Lesson 3
            {
                    "Lesson 3 Hint 1",
                    "Lesson 3 Hint 2",
                    "Lesson 3 Hint 3",
                    "Lesson 3 Hint 4",
                    "Lesson 3 Hint 5"
            }
    };

    // Hints for methods Level
    private static String[][] methodsHints = {

            // Hints for Lesson 1
            {
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
            },

            // Hints for Lesson 2
            {
                    "Trace the code.",
                    "Trace the code.",
                    "Trace the code.",
                    "Trace the code.",
                    "Familiar environment.",
                    "Is there an error?",
                    "Between second and first.",
                    "Between second and first.",
                    "Between second and first.",
                    "Answer is in the question."
            },

            // Hints for Lesson 3
            {
                    "Lesson 3 Hint 1",
                    "Lesson 3 Hint 2",
                    "Lesson 3 Hint 3",
                    "Lesson 3 Hint 4",
                    "Lesson 3 Hint 5"
            }
    };

    // Hints for singleDimensionalArrays Level
    private static String[][] singleDimensionalArraysHints = {

            // Hints for Lesson 1
            {
                    "Arrays use regular brackets.",
                    "The first value of an array is array[0].",
                    "The first value of an array is array[0].",
                    "array[x].. x is the size in the declaration/initialization.",
                    "Past tense."
            },

            // Hints for Lesson 2
            {
                    "The first value of an array is array[0].",
                    "Look at the changes made to list1.",
                    "Print out the contents of y[].",
                    "Print out the contents of x[].",
                    "How was x[] declared?"
            },

            // Hints for Lesson 3
            {
                    "Lesson 3 Hint 1",
                    "Lesson 3 Hint 2",
                    "Lesson 3 Hint 3",
                    "Lesson 3 Hint 4",
                    "Lesson 3 Hint 5"
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
                    }

            }
    };

    // Answer choices for Selections Level
    private static AnswerChoice[][][] selectionsAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("==", true),
                            new AnswerChoice("!=", false),
                            new AnswerChoice("<>", false),
                            new AnswerChoice("^=", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("a Boolean literal", true),
                            new AnswerChoice("a Java keyword", false),
                            new AnswerChoice("same as value 1", false),
                            new AnswerChoice("same as value 0", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("if (radius > 0) System.out.println(radius * radius * 3.14159);", true),
                            new AnswerChoice("if (radius != 0) System.out.println(radius * radius * 3.14159);", false),
                            new AnswerChoice("if (radius >= 0) System.out.println(radius * radius * 3.14159);", false),
                            new AnswerChoice("if (radius <= 0) System.out.println(radius * radius * 3.14159);", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("x < 0 and z > 0;", true),
                            new AnswerChoice("x > 0 and y > 0;", false),
                            new AnswerChoice("x < 0 and z < 0;", false),
                            new AnswerChoice("no printout.", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("The program runs fine and displays It is even!.", true),
                            new AnswerChoice("The program runs fine, but displays nothing.", false),
                            new AnswerChoice("The program has a runtime error.", false),
                            new AnswerChoice("The program has a compile error.", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("if (isPrime)", true),
                            new AnswerChoice("if (!isPrime = false)", false),
                            new AnswerChoice("if (isPrime == true)", false),
                            new AnswerChoice("if (isPrime = true)", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("The code displays nothing.", true),
                            new AnswerChoice("The code displays It is even!", false),
                            new AnswerChoice("The code is wrong. You should replace if (even) with if (even == true)", false),
                            new AnswerChoice("The code is wrong. You should replace if (even) with if (even = true)", false)
                    },

                    // Question 8 choices
                    {
                            new AnswerChoice("just right", true),
                            new AnswerChoice("too hot", false),
                            new AnswerChoice("too cold", false),
                            new AnswerChoice("too hot too cold just right", false)
                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("Income is greater than 3000", true),
                            new AnswerChoice("Income is greater than 3000 followed by Income is greater than 4000", false),
                            new AnswerChoice("Income is greater than 4000", false),
                            new AnswerChoice("Income is greater than 4000 followed by Income is greater than 3000", false)
                    },

                    // Question 10 choices
                    {
                            new AnswerChoice("Both Code 1 and Code 2 are correct, but Code 2 is better.", true),
                            new AnswerChoice("Both Code 1 and Code 2 have compile errors.", false),
                            new AnswerChoice("Code 2 has compile errors.", false),
                            new AnswerChoice("Code 1 has compile errors.", false)
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("((x < 100) && (x > 1)) || (x < 0)", true),
                            new AnswerChoice("1 < x < 100 && x < 0", false),
                            new AnswerChoice("((x < 100) && (x > 1)) && (x < 0)", false),
                            new AnswerChoice("(1 > x >  100) || (x < 0)", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("x < 5 || y < 5", true),
                            new AnswerChoice("x < 5 && y < 5", false),
                            new AnswerChoice("x > 5 && y > 5", false),
                            new AnswerChoice("x > 5 || y > 5", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("x != 5", true),
                            new AnswerChoice("x == 5", false),
                            new AnswerChoice("x != 4", false),
                            new AnswerChoice("!(x == 4)", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("x - 2 <= 4 && x - 2 >= -4", true),
                            new AnswerChoice("x - 2 <= 4 && x - 2 >= 4", false),
                            new AnswerChoice("x - 2 <= 4 && x - 2 > -4", false),
                            new AnswerChoice("x - 2 <= 4 || x - 2 >= -4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("x - 2 >= 4 || x - 2 <= -4", true),
                            new AnswerChoice("x - 2 >= 4 && x - 2 <= -4", false),
                            new AnswerChoice("x - 2 >= 4 && x - 2 < -4", false),
                            new AnswerChoice("x - 2 >= 4 || x - 2 < -4", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("The switch control variable cannot be double.", true),
                            new AnswerChoice("The program has a compile error because the required break statement is missing in the switch statement.", false),
                            new AnswerChoice("The program has a compile error because the required default case is missing in the switch statement.", false),
                            new AnswerChoice("No errors.", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("-1", true),
                            new AnswerChoice("2", false),
                            new AnswerChoice("0", false),
                            new AnswerChoice("1", false)
                    },

                    // Question 8 choices
                    {
                            new AnswerChoice("2", true),
                            new AnswerChoice("1", false),
                            new AnswerChoice("3", false),
                            new AnswerChoice("4", false)
                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("All three are correct, but Code 3 is preferred.", true),
                            new AnswerChoice("All three are correct, but Code 2 is preferred.", false),
                            new AnswerChoice("All three are correct, but Code 1 is preferred.", false),
                            new AnswerChoice("Code 2 has a compile error, because you cannot have true and false literals in the conditional expression.", false)
                    },

                    // Question 10 choices
                    {
                            new AnswerChoice("false", true),
                            new AnswerChoice("true", false),
                            new AnswerChoice("nothing", false),
                            new AnswerChoice("true false", false)
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
            },

            // Lesson 4
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
                            new AnswerChoice("BA", false),
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
                            new AnswerChoice("void", true),
                            new AnswerChoice("int", false),
                            new AnswerChoice("double", false),
                            new AnswerChoice("public", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("method name and parameter list", true),
                            new AnswerChoice("method name", false),
                            new AnswerChoice("return type, method name, and parameter list", false),
                            new AnswerChoice("parameter list", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("public static void main(String[] args)", true),
                            new AnswerChoice("public static Main(String[] args)", false),
                            new AnswerChoice("public static Main(String args[])", false),
                            new AnswerChoice("public void main(String[] args)", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("parentheses", true),
                            new AnswerChoice("brackets", false),
                            new AnswerChoice("curly braces", false),
                            new AnswerChoice("quotation marks", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("a stack", true),
                            new AnswerChoice("a heap", false),
                            new AnswerChoice("an array", false),
                            new AnswerChoice("storage area", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("Write a method that prints integers from 1 to 100.", true),
                            new AnswerChoice("Write a method that returns a random integer from 1 to 100.", false),
                            new AnswerChoice("Write a method that checks whether current second is an integer from 1 to 100.", false),
                            new AnswerChoice("Write a method that converts an uppercase letter to lowercase.", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("void", true),
                            new AnswerChoice("int", false),
                            new AnswerChoice("double", false),
                            new AnswerChoice("boolean", false)
                    },

                    // Question 8 choices
                    {
                            new AnswerChoice("pass by value", true),
                            new AnswerChoice("method invocation", false),
                            new AnswerChoice("pass by reference", false),
                            new AnswerChoice("pass by name", false)
                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("invalid call", true),
                            new AnswerChoice("aaa", false),
                            new AnswerChoice("aaaa", false),
                            new AnswerChoice("aaaaa", false)
                    },

                    // Question 10 choices
                    {
                            new AnswerChoice("2", true),
                            new AnswerChoice("1", false),
                            new AnswerChoice("3", false),
                            new AnswerChoice("0", false)
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("The program displays int, long followed by 5.", true),
                            new AnswerChoice("The program displays long, long followed by 5.", false),
                            new AnswerChoice("The program runs fine but displays things other than 5.", false),
                            new AnswerChoice("The program does not compile because the compiler cannot distinguish which xmethod to invoke.", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("The program displays long followed by 5.", true),
                            new AnswerChoice("The program displays int followed by 5.", false),
                            new AnswerChoice("The program runs fine but displays things other than 5.", false),
                            new AnswerChoice("The program does not compile because the compiler cannot distinguish which xmethod to invoke.", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("The program cannot compile because the compiler cannot determine which max method should be invoked.", true),
                            new AnswerChoice("The program cannot compile because you cannot have the print statement in a non-void method.", false),
                            new AnswerChoice("The program runs and prints 2 followed by \"max(int, double)\" is invoked.", false),
                            new AnswerChoice("The program runs and prints 2 followed by \"max(double, int)\" is invoked.", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("The program has a compile error because the two methods m have the same signature.", true),
                            new AnswerChoice("The program has a compile error because the second m method is defined, but not invoked in the main method.", false),
                            new AnswerChoice("The program runs and prints 2 once.", false),
                            new AnswerChoice("The program runs and prints 2 twice.", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("a local variable", true),
                            new AnswerChoice("a block variable", false),
                            new AnswerChoice("a method variable", false),
                            new AnswerChoice("a global variable", false)
                    },

                    // Question 6 choices
                    {
                            new AnswerChoice("k is not defined outside the block. So, the program has a compile error", true),
                            new AnswerChoice("2", false),
                            new AnswerChoice("0", false),
                            new AnswerChoice("1", false)
                    },

                    // Question 7 choices
                    {
                            new AnswerChoice("between 0 and 65535", true),
                            new AnswerChoice("between 0 and 65536", false),
                            new AnswerChoice("between 1 and 65535", false),
                            new AnswerChoice("between 1 and 65536", false)
                    },

                    // Question 8 choices
                    {
                            new AnswerChoice("between (int)'a' and (int)'z'", true),
                            new AnswerChoice("between 0 and (int)'z'", false),
                            new AnswerChoice("between 'a' and 'z'", false),
                            new AnswerChoice("between 'a' and 'y'", false)
                    },

                    // Question 9 choices
                    {
                            new AnswerChoice("between 'a' and 'z'", true),
                            new AnswerChoice("between 'a' and 'y'", false),
                            new AnswerChoice("between 'b' and 'z'", false),
                            new AnswerChoice("between 'b' and 'y'", false)
                    },

                    // Question 10 choices
                    {
                            new AnswerChoice("Top-down approach", true),
                            new AnswerChoice("Bottom-up approach", false),
                            new AnswerChoice("Bottom-up and top-down approach", false),
                            new AnswerChoice("Stepwise refinement", false)
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
                            new AnswerChoice("a[2]", true),
                            new AnswerChoice("a(2)", false),
                            new AnswerChoice("a[3]", false),
                            new AnswerChoice("a(3)", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("2.0", true),
                            new AnswerChoice("3.5", false),
                            new AnswerChoice("5.5", false),
                            new AnswerChoice("3.4", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("3", true),
                            new AnswerChoice("2", false),
                            new AnswerChoice("1", false),
                            new AnswerChoice("0", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("5", true),
                            new AnswerChoice("6", false),
                            new AnswerChoice("0", false),
                            new AnswerChoice("4", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("indexed variable", true),
                            new AnswerChoice("index", false),
                            new AnswerChoice("index variable", false),
                            new AnswerChoice("array variable", false)
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            new AnswerChoice("0 1 2", true),
                            new AnswerChoice("1 2 3", false),
                            new AnswerChoice("1 1 1", false),
                            new AnswerChoice("0 1 3", false)
                    },

                    // Question 2 choices
                    {
                            new AnswerChoice("0 1 2", true),
                            new AnswerChoice("1 2 3", false),
                            new AnswerChoice("1 1 1", false),
                            new AnswerChoice("0 1 3", false)
                    },

                    // Question 3 choices
                    {
                            new AnswerChoice("The program displays 1 2 3 4", true),
                            new AnswerChoice("The program displays 0 0", false),
                            new AnswerChoice("The program displays 0 0 3 4", false),
                            new AnswerChoice("The program displays 0 0 0 0", false)
                    },

                    // Question 4 choices
                    {
                            new AnswerChoice("The program displays 0 0", true),
                            new AnswerChoice("The program displays 1 2 3 4", false),
                            new AnswerChoice("The program displays 0 0 3 4", false),
                            new AnswerChoice("The program displays 0 0 0 0", false)
                    },

                    // Question 5 choices
                    {
                            new AnswerChoice("The program has a compile error on the statement x = new int[2], because x is final and cannot be changed.", true),
                            new AnswerChoice("The program displays 1 2 3 4", false),
                            new AnswerChoice("The program displays 0 0", false),
                            new AnswerChoice("The elements in the array x cannot be changed, because x is final.", false)
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

    private static String[] preTestQuestions = {

            //
    };

    private static AnswerChoice[][] preTestAnswerChoices = {

            // Question 1 choices
            {
                    new AnswerChoice("void", true),
                    new AnswerChoice("int", false),
                    new AnswerChoice("double", false),
                    new AnswerChoice("public", false)
            },

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
        } else if (level == Levels.SELECTIONS) {
            return selectionsQuestions[lesson];
        } else if (level == Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return functionsCharactersStringsQuestions[lesson];
        } else if (level == Levels.LOOPS) {
            return loopsQuestions[lesson];
        } else if (level == Levels.METHODS) {
            return methodsQuestions[lesson];
        } else {
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
        } else if (level == Levels.SELECTIONS) {
            return selectionsAnswerChoices[lesson];
        } else if (level == Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return functionsCharactersStringsAnswerChoices[lesson];
        } else if (level == Levels.LOOPS) {
            return loopsAnswerChoices[lesson];
        } else if (level == Levels.METHODS) {
            return methodsAnswerChoices[lesson];
        } else {
            return singleDimensionalArraysAnswerChoices[lesson];
        }
    }

    public static String[] getHints(Levels level, int lesson) {

        if (level == Levels.ELEMENTARY_PROGRAMMING) {
            return elementaryProgrammingHints[lesson];
        } else if (level == Levels.SELECTIONS) {
            return selectionsHints[lesson];
        } else if (level == Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return functionsCharactersStringsHints[lesson];
        } else if (level == Levels.LOOPS) {
            return loopsHints[lesson];
        } else if (level == Levels.METHODS) {
            return methodsHints[lesson];
        } else {
            return singleDimensionalArraysHints[lesson];
        }
    }

    public static String[] getPreTestQuestions() {
        return preTestQuestions;
    }

    public static AnswerChoice[][] getPreTestAnswerChoices() {
        return preTestAnswerChoices;
    }
}


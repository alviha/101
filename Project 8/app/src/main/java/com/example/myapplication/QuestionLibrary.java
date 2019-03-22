package com.example.myapplication;

import android.widget.LinearLayout;

public final class QuestionLibrary extends Library {

    // Questions for Elementary Programming Level
    private String[][] elementaryProgrammingQuestions = {

            // Questions for Lesson 1
            {
                    "This is the first question for lesson 1 in Elementary Programming",
                    "This is the second question for lesson 1 in Elementary Programming",
                    "This is the third question for lesson 1 in Elementary Programming",
                    "This is the fourth question for lesson 1 in Elementary Programming",
                    "This is the fifth question for lesson 1 in Elementary Programming"
            },

            // Questions for Lesson 2
            {
                    "This is the first question for lesson 2 in Elementary Programming",
                    "This is the second question for lesson 2 in Elementary Programming",
                    "This is the third question for lesson 2 in Elementary Programming",
                    "This is the fourth question for lesson 2 in Elementary Programming",
                    "This is the fifth question for lesson 2 in Elementary Programming"
            },

            // Questions for Lesson 3
            {
                    "This is the first question for lesson 3 in Elementary Programming",
                    "This is the second question for lesson 3 in Elementary Programming",
                    "This is the third question for lesson 3 in Elementary Programming",
                    "This is the fourth question for lesson 3 in Elementary Programming",
                    "This is the fifth question for lesson 3 in Elementary Programming"
            }
    };

    // Questions for Selections Level
    private String[][] selectionsQuestions = {

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
    private String[][] functionsCharactersStringsQuestions = {

            // Questions for Lesson 1
            {
                    "This is the first question for lesson 1 in Functions Characters and Strings",
                    "This is the second question for lesson 1 in Functions Characters and Strings",
                    "This is the third question for lesson 1 in Functions Characters and Strings",
                    "This is the fourth question for lesson 1 in Functions Characters and Strings",
                    "This is the fifth question for lesson 1 in Functions Characters and Strings"
            },

            // Questions for Lesson 2
            {
                    "This is the first question for lesson 2 in Functions Characters and Strings",
                    "This is the second question for lesson 2 in Functions Characters and Strings",
                    "This is the third question for lesson 2 in Functions Characters and Strings",
                    "This is the fourth question for lesson 2 in Functions Characters and Strings",
                    "This is the fifth question for lesson 2 in Functions Characters and Strings"
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
    private String[][] loopsQuestions = {

            // Questions for Lesson 1
            {
                    "This is the first question for lesson 1 in Loops",
                    "This is the second question for lesson 1 in Loops",
                    "This is the third question for lesson 1 in Loops",
                    "This is the fourth question for lesson 1 in Loops",
                    "This is the fifth question for lesson 1 in Loops"
            },

            // Questions for Lesson 2
            {
                    "This is the first question for lesson 2 in Loops",
                    "This is the second question for lesson 2 in Loops",
                    "This is the third question for lesson 2 in Loops",
                    "This is the fourth question for lesson 2 in Loops",
                    "This is the fifth question for lesson 2 in Loops"
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
    private String[][] methodsQuestions = {

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
    private String[][] singleDimensionalArraysQuestions = {

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

    /**
     * Retrieve questions for a level's lesson
     *
     * @param level  the level (ELEMENTARY_PROGRAMMING, SELECTIONS, ETC.)
     * @param lesson the lesson number (first lesson is 0)
     * @return the array of questions from the specified level and lesson number
     */
    public String[] getQuestions(Levels level, int lesson) {

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


}

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
    private static String[][] loopsQuestions = {

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
    private static String[][][] elementaryProgrammingAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            }
    };

    // Answer choices for Selections Level
    private static String[][][] selectionsAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            }
    };

    // Answer choices for Functions Characters Strings Level
    private static String[][][] functionsCharactersStringsAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            }
    };

    // Answer choices for Loops Level
    private static String[][][] loopsAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            }
    };

    // Answer choices for Methods Level
    private static String[][][] methodsAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            }
    };

    // Answer choices for Single Dimensional Arrays Level
    private static String[][][] singleDimensionalArraysAnswerChoices = {

            // Lesson 1
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 2
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            },

            // Lesson 3
            {

                    // Question 1 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 2 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 3 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 4 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    },

                    // Question 5 choices
                    {
                            "Choice 1",
                            "Choice 2",
                            "Choice 3",
                            "Choice 4"
                    }
            }
    };

    /**
     * Retrieve questions from a level's lesson
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
     * Retrieve answer choices for the questions from a level's lesson
     * @param level the level (ELEMENTARY_PROGRAMMING, SELECTIONS, ETC.)
     * @param lesson the lesson number (first lesson is 0)
     * @return the set of answer choices from questions from the specified level and lesson number
     */
    public static String[][] getAnswerChoices(Levels level, int lesson) {

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

package com.example.myapplication;

public class Progress {
    //retrieves the name of each level for an int variable in shared preferences for score
    public static String lessonName(int lesson, Library.Levels level) {
        String testing = "";

        if (lesson == 0 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            return testing = "elementaryProgramming1";
        }
        else if (lesson == 1 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            return testing = "elementaryProgramming2";
        }
        else if (lesson == 2 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            return testing = "elementaryProgramming3";
        }
        else if (lesson == 0 && level == Library.Levels.SELECTIONS) {
            return testing = "selections1";
        }
        else if (lesson == 1 && level == Library.Levels.SELECTIONS) {
            return testing = "selections2";
        }
        else if (lesson == 2 && level == Library.Levels.SELECTIONS) {
            return testing = "selections3";
        }
        else if (lesson == 0 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings1";
        }
        else if (lesson == 1 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings2";
        }
        else if (lesson == 2 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings3";
        }
        else if (lesson == 3 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings4";
        }
        else if (lesson == 0 && level == Library.Levels.LOOPS) {
            return testing = "loops1";
        }
        else if (lesson == 1 && level == Library.Levels.LOOPS) {
            return testing = "loops2";
        }
        else if (lesson == 2 && level == Library.Levels.LOOPS) {
            return testing = "loops3";
        }
        else if (lesson == 0 && level == Library.Levels.METHODS) {
            return testing = "methods1";
        }
        else if (lesson == 1 && level == Library.Levels.METHODS) {
            return testing = "methods2";
        }
        else if (lesson == 0 && level == Library.Levels.SINGLE_DIMENSIONAL_ARRAYS) {
            return testing = "singleDimensionalArrays1";
        }
        else if (lesson == 1 && level == Library.Levels.SINGLE_DIMENSIONAL_ARRAYS) {
            return testing = "singleDimensionalArrays2";
        }
        return testing;
    }
    //retrieves the name of current level for the boolean variable in shared preferences
    // for retrieving unlocked levels
    public static String unlockName(int lesson, Library.Levels level) {
        String testing = "";

        if (lesson == 1 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            return testing = "elementaryProgramming02";
        }
        else if (lesson == 2 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            return testing = "elementaryProgramming03";
        }
        else if (lesson == 0 && level == Library.Levels.SELECTIONS) {
            return testing = "selections01";
        }
        else if (lesson == 1 && level == Library.Levels.SELECTIONS) {
            return testing = "selections02";
        }
        else if (lesson == 2 && level == Library.Levels.SELECTIONS) {
            return testing = "selections03";
        }
        else if (lesson == 0 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings01";
        }
        else if (lesson == 1 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings02";
        }
        else if (lesson == 2 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings03";
        }
        else if (lesson == 3 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings04";
        }
        else if (lesson == 0 && level == Library.Levels.LOOPS) {
            return testing = "loops01";
        }
        else if (lesson == 1 && level == Library.Levels.LOOPS) {
            return testing = "loops02";
        }
        else if (lesson == 2 && level == Library.Levels.LOOPS) {
            return testing = "loops03";
        }
        else if (lesson == 0 && level == Library.Levels.METHODS) {
            return testing = "methods01";
        }
        else if (lesson == 1 && level == Library.Levels.METHODS) {
            return testing = "methods02";
        }
        else if (lesson == 0 && level == Library.Levels.SINGLE_DIMENSIONAL_ARRAYS) {
            return testing = "singleDimensionalArrays01";
        }
        else if (lesson == 1 && level == Library.Levels.SINGLE_DIMENSIONAL_ARRAYS) {
            return testing = "singleDimensionalArrays02";
        }
        return testing;
    }
    //sets name for next level after the current one for the boolean variables in shared preferences
    //used for unlocking the next level
    public static String setUnlockName(int lesson, Library.Levels level) {
        String testing = "";

        if (lesson == 0 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            return testing = "elementaryProgramming02";
        } else if (lesson == 1 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            return testing = "elementaryProgramming03";
        } else if (lesson == 2 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            return testing = "selections01";
        } else if (lesson == 0 && level == Library.Levels.SELECTIONS) {
            return testing = "selections02";
        } else if (lesson == 1 && level == Library.Levels.SELECTIONS) {
            return testing = "selections03";
        } else if (lesson == 2 && level == Library.Levels.SELECTIONS) {
            return testing = "functionsCharactersStrings01";
        } else if (lesson == 0 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings02";
        } else if (lesson == 1 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings03";
        } else if (lesson == 2 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "functionsCharactersStrings04";
        } else if (lesson == 3 && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            return testing = "loops01";
        } else if (lesson == 0 && level == Library.Levels.LOOPS) {
            return testing = "loops02";
        } else if (lesson == 1 && level == Library.Levels.LOOPS) {
            return testing = "loops03";
        } else if (lesson == 2 && level == Library.Levels.LOOPS) {
            return testing = "methods01";
        } else if (lesson == 0 && level == Library.Levels.METHODS) {
            return testing = "methods02";
        } else if (lesson == 1 && level == Library.Levels.METHODS) {
            return testing = "singleDimensionalArrays01";
        } else if (lesson == 0 && level == Library.Levels.SINGLE_DIMENSIONAL_ARRAYS) {
            return testing = "singleDimensionalArrays02";
        }
        return testing;
    }
}

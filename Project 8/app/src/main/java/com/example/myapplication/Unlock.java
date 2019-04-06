package com.example.myapplication;

import android.content.Intent;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Unlock {
    private static boolean elementaryProgramming2, elementaryProgramming3, selections1,
            selections2, selections3, functionsCharactersStrings1, functionsCharactersStrings2,
            functionsCharactersStrings3, functionsCharactersStrings4, loops1, loops2, loops3, methods1,
            methods2, singleDimensionalArrays1, singleDimensionalArrays2;
    private static FirebaseDatabase levelLocks = FirebaseDatabase.getInstance();
    private static DatabaseReference unlockReference = levelLocks.getReference();
    private static FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();



    static void UnlockLevel(int percent, int lesson, Library.Levels level) {
        //checks if score is above %80 and unlocks next level if it is.
        if (percent >= 80 && lesson == 0 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            elementaryProgramming2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("elementaryProgramming2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            elementaryProgramming3 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("elementaryProgramming3").setValue(true);
        }
        if (percent >= 80 && 2 == lesson && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            selections1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("selections1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.SELECTIONS) {
            selections2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("selections2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.SELECTIONS) {
            selections3 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("selections3").setValue(true);
        }
        if (percent >= 80 && 2 == lesson && level == Library.Levels.SELECTIONS) {
            functionsCharactersStrings1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("functionsCharactersStrings1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            functionsCharactersStrings2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("functionsCharactersStrings2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            functionsCharactersStrings3 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("functionsCharactersStrings3").setValue(true);
        }
        if (percent >= 80 && 2 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            functionsCharactersStrings4 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("functionsCharactersStrings4").setValue(true);
        }
        if (percent >= 80 && 3 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            loops1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("loops1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.LOOPS) {
            loops2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("loops2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.LOOPS) {
            loops3 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("loops3").setValue(true);
        }
        if (percent >= 80 && 2 == lesson && level == Library.Levels.LOOPS) {
            methods1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("methods1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.METHODS) {
            methods2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("methods2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.METHODS) {
            singleDimensionalArrays1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("singleDimensionalArrays1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.SINGLE_DIMENSIONAL_ARRAYS) {
            singleDimensionalArrays2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("singleDimensionalArrays2").setValue(true);
        }

    }
    static boolean isUnlocked(int lesson, Library.Levels level) {
        //checks to see if the level is unlocked
        boolean unlocked = false;
        if (lesson == 1 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            //unlocked = unlockReference.child("users").child(currentUser.getUid()).child("elementaryProgramming2").equals(true);
            unlocked = elementaryProgramming2;
            return unlocked;
        }
        if (2 == lesson && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            unlocked = elementaryProgramming3;
            return unlocked;
            //unlockReference.child("users").child(currentUser.getUid()).child("elementaryProgramming3").setValue(true);
        }
        if (0 == lesson && level == Library.Levels.SELECTIONS) {
            unlocked=selections1;
            return unlocked;
        }
        if (1 == lesson && level == Library.Levels.SELECTIONS) {
            unlocked = selections2;
            return unlocked;
        }
        if (2 == lesson && level == Library.Levels.SELECTIONS) {
            unlocked = selections3;
            return unlocked;
        }
        if (0 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            unlocked = functionsCharactersStrings1;
            return unlocked;
        }
        if (1 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            unlocked = functionsCharactersStrings2;
            return unlocked;
        }
        if (2 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            unlocked = functionsCharactersStrings3;
            return unlocked;
        }
        if (3 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            unlocked = functionsCharactersStrings4;
            return unlocked;
        }
        if (0 == lesson && level == Library.Levels.LOOPS) {
            unlocked = loops1;
            return unlocked;
        }
        if (1 == lesson && level == Library.Levels.LOOPS) {
            unlocked = loops2;
            return unlocked;
        }
        if (2 == lesson && level == Library.Levels.LOOPS) {
            unlocked = loops3;
            return unlocked;
        }
        if (0 == lesson && level == Library.Levels.METHODS) {
            unlocked = methods1;
            return unlocked;
        }
        if (1 == lesson && level == Library.Levels.METHODS) {
            unlocked = methods2;
            return unlocked;
        }
        if (0 == lesson && level == Library.Levels.SINGLE_DIMENSIONAL_ARRAYS) {
            unlocked = singleDimensionalArrays1;
            return unlocked;
        }
        if (1 == lesson && level == Library.Levels.SINGLE_DIMENSIONAL_ARRAYS) {
            unlocked = singleDimensionalArrays2;
            return unlocked;
        }
        return unlocked;
    }

}

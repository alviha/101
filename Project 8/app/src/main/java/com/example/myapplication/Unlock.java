package com.example.myapplication;

import android.content.Intent;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Unlock {
    private Library.Levels level;
    private int lesson;
    private static boolean elementaryProgramming2, elementaryProgramming3, selections1,
            selections2, selections3, functionsCharactersStrings1, functionsCharactersStrings2,
            functionsCharactersStrings3, functionsCharactersStrings4, loops1, loops2, loops3, methods1,
            methods2, singleDimensionalArrays1, singleDimensionalArrays2;
    static int total;
    static int progressStatus;
    private static FirebaseDatabase levelLocks = FirebaseDatabase.getInstance();
    private static DatabaseReference unlockReference = levelLocks.getReference();
    private static FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();


    public static boolean isElementaryProgramming2() {
        return elementaryProgramming2;
    }

    public static void Unlock(int percent, int lesson, Library.Levels level) {

        if (percent >= 80 && lesson == 0 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            //progressStatus = percent + Homepage.progressStatus;
            elementaryProgramming2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("elementaryProgramming2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            //progressStatus = percent + progressStatus;
            elementaryProgramming3 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("elementaryProgramming3").setValue(true);
        }
        if (percent >= 80 && 2 == lesson && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            progressStatus = percent + progressStatus;
            selections1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("selections1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.SELECTIONS) {
            progressStatus = percent + progressStatus;
            selections2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("selections2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.SELECTIONS) {
            progressStatus = percent + progressStatus;
            selections3 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("selections3").setValue(true);
        }
        if (percent >= 80 && 2 == lesson && level == Library.Levels.SELECTIONS) {
            progressStatus = percent + progressStatus;
            functionsCharactersStrings1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("functionsCharactersStrings1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            progressStatus = percent + progressStatus;
            functionsCharactersStrings2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("functionsCharactersStrings2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            progressStatus = percent + progressStatus;
            functionsCharactersStrings3 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("functionsCharactersStrings3").setValue(true);
        }
        if (percent >= 80 && 2 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            progressStatus = percent + progressStatus;
            functionsCharactersStrings4 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("functionsCharactersStrings4").setValue(true);
        }
        if (percent >= 80 && 3 == lesson && level == Library.Levels.FUNCTIONS_CHARACTERS_STRINGS) {
            progressStatus = percent + progressStatus;
            loops1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("loops1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.LOOPS) {
            progressStatus = percent + progressStatus;
            loops2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("loops2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.LOOPS) {
            progressStatus = percent + progressStatus;
            loops3 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("loops3").setValue(true);
        }
        if (percent >= 80 && 2 == lesson && level == Library.Levels.LOOPS) {
            progressStatus = percent + progressStatus;
            methods1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("methods1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.METHODS) {
            progressStatus = percent + progressStatus;
            methods2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("methods2").setValue(true);
        }
        if (percent >= 80 && 1 == lesson && level == Library.Levels.METHODS) {
            progressStatus = percent + progressStatus;
            singleDimensionalArrays1 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("singleDimensionalArrays1").setValue(true);
        }
        if (percent >= 80 && 0 == lesson && level == Library.Levels.SINGLE_DIMENSIONAL_ARRAYS) {
            progressStatus = percent + progressStatus;
            singleDimensionalArrays2 = true;
            unlockReference.child("users").child(currentUser.getUid()).child("singleDimensionalArrays2").setValue(true);
        }

    }
    public static boolean isUnlocked(int lesson, Library.Levels level) {
        boolean unlocked = false;
        if (lesson == 1 && level == Library.Levels.ELEMENTARY_PROGRAMMING) {
            unlocked = unlockReference.child("users").child(currentUser.getUid()).child("elementaryProgramming2").equals(true);
            //unlocked = elementaryProgramming2;
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

package com.example.myapplication;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.support.constraint.Constraints.TAG;
import static com.example.myapplication.Homepage.progressStatus;

public class Progress {
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    private static DatabaseReference data_progress = database.getReference();


//saves progress in firebase
    public static void ProgressStatus(final int progress){
        data_progress.setValue(progress);
        data_progress.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //keeps up with the variable when it changes
                progressStatus = dataSnapshot.getValue(int.class);
                Log.d(TAG, "Progress is: " + progress);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w(TAG, "Failed to read value.", databaseError.toException());
            }
        });
    }
    public static int ProgressValue(){
        return progressStatus;
    }
}

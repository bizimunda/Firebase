package com.android.hamid.firebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDatabase = FirebaseDatabase.getInstance().getReference();
        writeNewUser("one", "hamid","email@gmail.com");
        writeNewUser("two", "hamid2","ema2il@gmail.com");

        writeNewHome("id1", "AIBV", "34m");
        writeNewHome("id2", "Dell", "50m");

        Log.d("MainActivity", "User written et Home written");

    }
    private void writeNewUser(String userId, String name, String email) {
        User user = new User(name, email);
        mDatabase.child("users").child(userId).setValue(user);

    }

    private void writeNewHome(String homeId, String name, String qdrMeter) {
        Home home= new Home(name, qdrMeter );
        mDatabase.child("Home").child(homeId).setValue(home);

    }


}

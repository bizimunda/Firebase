package com.android.hamid.firebase;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by u5980 on 10/19/2017.
 */

@IgnoreExtraProperties
public class Home {

    public String name;
    public String qdrMeter;

    public Home() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Home(String name, String qdrMeter) {
        this.name = name;
        this.qdrMeter = qdrMeter;
    }
}

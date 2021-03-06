package com.android.hamid.firebase;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by u5980 on 10/19/2017.
 */

@IgnoreExtraProperties
public class User {

    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}

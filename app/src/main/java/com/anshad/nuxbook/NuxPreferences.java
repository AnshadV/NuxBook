package com.anshad.nuxbook;

import android.content.Context;
import android.content.SharedPreferences;

public class NuxPreferences {
    private static final String KEY_LOGIN_STATE = "key_login_state";

    private SharedPreferences preferences;

    NuxPreferences(Context context) {
        preferences =
                context.getSharedPreferences("nux-book", Context.MODE_PRIVATE);
    }

    public boolean isLoggedIn() {
        return preferences.getBoolean(KEY_LOGIN_STATE, false);
    }

    public void setLoggedIn(boolean loggedIn) {
        preferences.edit().putBoolean(KEY_LOGIN_STATE, loggedIn).apply();
    }
}

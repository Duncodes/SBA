package io.github.duncodes.sba;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    private SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext());
        if (!prefs.getBoolean("UserLoggedIn", false)) {

            startActivity(new Intent(this, LoginActivity.class));
            finish();

        } else {
            startActivity(new Intent(this, HomeActivity.class));
            finish();
        }
    }
}

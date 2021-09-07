package com.gk.uits_scheduler.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gk.uits_scheduler.R;
import com.gk.uits_scheduler.fragments.SettingsFragment;


public class SettingsActivity extends AppCompatActivity {
    public static final String
            KEY_SEVEN_DAYS_SETTING = "sevendays";
    public static final String KEY_SCHOOL_WEBSITE_SETTING = "schoolwebsite";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}

package com.gk.uits_scheduler.fragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.gk.uits_scheduler.R;


public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings, rootKey);
    }
}

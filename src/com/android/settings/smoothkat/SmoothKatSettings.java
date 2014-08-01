package com.android.settings.smoothkat;

import android.os.Bundle;
import android.preference.Preference;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class SmoothKatSettings extends SettingsPreferenceFragment implements
        Preference.OnPreferenceChangeListener {
    private static final String TAG = "SmoothKatSettings";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.gnome_settings);
        }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        // TODO Auto-generated method stub
        return false;
    }
}

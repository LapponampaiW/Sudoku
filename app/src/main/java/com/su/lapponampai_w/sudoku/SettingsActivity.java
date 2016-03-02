package com.su.lapponampai_w.sudoku;

import android.app.Fragment;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

/**
 * Created by apple on 3/1/16.
 */
public class SettingsActivity extends PreferenceActivity {

    protected void onCreate(Bundle w) {
        super.onCreate(w);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
    }


    private static class SettingsFragment extends PreferenceFragment {
        public void onCreate(Bundle y) {
            super.onCreate(y);
            addPreferencesFromResource(R.xml.setting);
        }

    }
}

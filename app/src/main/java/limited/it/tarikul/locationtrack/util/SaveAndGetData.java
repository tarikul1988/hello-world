package limited.it.tarikul.locationtrack.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Tarikul on 4/5/2018.
 */

public class SaveAndGetData {
    public static void saveToSharedPreferences(String key, String value, Context context){
        SharedPreferences preferences;
        SharedPreferences.Editor editor;

        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = preferences.edit();

        editor.putString(key, value);
        editor.commit();

    }

    public static String getValueFromSharedPreferences(String key, Context context){
        SharedPreferences preferences;
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(key, null);
    }

    // LUC: New method added for consistency
    public static void setValueToSharedPreferences(String key, String value, Context context){
        saveToSharedPreferences(key, value, context);
    }

    public static void saveBoleanValueSharedPreferences(String key, boolean isChecked, Context context){
        SharedPreferences preferences;
        SharedPreferences.Editor editor;

        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = preferences.edit();
        editor.putBoolean(key, isChecked);
        editor.commit();

    }
    public static boolean getBoleanValueSharedPreferences(String key,Context context){
        SharedPreferences preferences;
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getBoolean(key,false);

    }
}

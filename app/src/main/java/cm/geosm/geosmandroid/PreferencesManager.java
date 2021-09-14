package cm.geosm.geosmandroid;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "welcome";

    private static final String FIRST = "no";


    public PreferencesManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }




    public void firstConnect(String a) {
        editor.putString(FIRST,a);
        editor.apply();
    }


    public String getConnect() {
        return pref.getString(FIRST,"no");
    }



}


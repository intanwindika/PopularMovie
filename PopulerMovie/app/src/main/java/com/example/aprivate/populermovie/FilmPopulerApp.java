package com.example.aprivate.populermovie;

import android.app.Application;
import com.facebook.stetho.Stetho;
/**
 * Created by private on 26/10/2017.
 */

public class FilmPopulerApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }
}
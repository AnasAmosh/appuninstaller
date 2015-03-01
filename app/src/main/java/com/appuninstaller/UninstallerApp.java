package com.appuninstaller;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

public class UninstallerApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (!BuildConfig.DEBUG) {
            // Start crashlytics on non-debug builds only
            /**
             * test anas amosh
             */
            Crashlytics.start(this);
        }
    }
}

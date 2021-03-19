package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MiJdGU4MfGxOIuGBRtEK00ct2aVZG8mw4QSnds33")
                .clientKey("Zi3Uhx2r7aV6bFrtcqTg9hWu1h7eInUlfnCF6clK")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

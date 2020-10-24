package com.example.varstagram;

import android.app.Application;

import com.example.varstagram.model.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Register parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BM9PA2xdT4nnwUb7InFXNgIQX2ZvXpWOIlnhhPMl")
                .clientKey("nkmHjbTzItgsqYieit6fVYzbBfvwQMgTWF4EYQw4")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

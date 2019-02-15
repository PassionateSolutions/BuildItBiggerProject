package com.udacity.gradle.builditbigger.backend;

import com.example.android.javalib.JavaJokeLib;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new JavaJokeLib().pullJokeFromZombieJokeList();

        return myData;
    }
}
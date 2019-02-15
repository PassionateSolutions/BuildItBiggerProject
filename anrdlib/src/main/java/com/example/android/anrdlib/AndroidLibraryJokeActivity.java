package com.example.android.anrdlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class AndroidLibraryJokeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library_joke);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.android_library_joke_activity_xml, new AndroidLibraryJokeFragment()).commit();
        }
    }
}

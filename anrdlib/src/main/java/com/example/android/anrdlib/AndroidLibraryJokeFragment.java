package com.example.android.anrdlib;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AndroidLibraryJokeFragment extends Fragment {

    TextView jokeTextView;

    public AndroidLibraryJokeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View jokeView = inflater.inflate(R.layout.fragment_android_library_joke, container, false);

        String jokeIntent = getActivity().getIntent().getStringExtra("jokeIntent");

        jokeTextView = jokeView.findViewById(R.id.android_library_joke_fragment);

        jokeTextView.setText(jokeIntent);

        return jokeView;


    }
}

package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;


@RunWith(AndroidJUnit4.class)
public class AsyncTaskDeviceJokeTest {

    // String Variable that will be used to find out if the data coming back is Empty.
    public static final String JOKE_EMPTY_NOT_FUNNY = "";


    // The rule that will be casted on the Main Activity, in which we find the button we want to test the AsyncTask On
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    // Method to start the Test on the Joke Button and the Joke Fragment that displays the Jokes
    // Then tells us if it doesn't match with an Empty String JOKE_EMPTY_NOT_FUNNY then the test passes
    @Test
    public void clickJokeButtonToTestIfEmptyOrNot() {

        // Performs click on jokeButton which is found within the main>res>layout>activity_main
        onView(withId(R.id.jokeButton)).perform(click());
        // Performs check comparison with the empty string JOKE_EMPTY_NOT_FUNNY with the
        // textView found within the anrdlib>main>res>layout>fragment_android_library_joke
        // If it comes back as not empty then we pass the test!
        onView(withId(R.id.android_library_joke_fragment)).check(matches(not(withText(JOKE_EMPTY_NOT_FUNNY))));

    }

}
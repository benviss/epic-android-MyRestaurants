package com.dafunk.myrestaurants;

/**
 * Created by foste on 11/12/2016.
 */

import android.support.test.rule.ActivityTestRule;

import com.dafunk.myrestaurants.ui.MainActivity;

import org.junit.Rule;
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);



}
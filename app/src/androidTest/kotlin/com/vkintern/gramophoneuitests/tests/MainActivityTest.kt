package com.vkintern.gramophoneuitests.tests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.kabouzeid.gramophone.ui.activities.MainActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.kabouzeid.gramophone.R


@RunWith(AndroidJUnit4::class)
class MainActivityTest{
    @Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test() {
        println(activityTestRule.scenario)
        Thread.sleep(15000)
        onView(ViewMatchers.withId(R.id.mi_button_cta)).perform(click())
        onView(ViewMatchers.withId(R.id.mi_button_cta)).check(matches(isDisplayed()))

    }

}

package ru.tinkoff.myupgradeapplication.week6

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.github.tomakehurst.wiremock.junit.WireMockRule
import org.junit.Rule
import org.junit.Test
import ru.tinkoff.myupgradeapplication.MainActivity

class WireMockFirstTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    val mockRule = WireMockRule(5000)

    @Test
    fun emptyWireMockTest() {
        // то что тест запускается - уже победа
    }
}
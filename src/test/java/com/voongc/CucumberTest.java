package com.voongc;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * To run cucumber test.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"com.voongc", "com.voongc.stepdefs"}
)
public class CucumberTest {

}
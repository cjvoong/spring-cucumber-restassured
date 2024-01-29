package com.voongc.stepdefs;

import com.voongc.CucumberSpringContextConfiguration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class StepDefinitions {
    private Response response;

    @Given("the API base URI is {string}")
    public void setBaseURI(String baseURI) {
        RestAssured.baseURI = baseURI;
    }

    @When("a GET request is made to {string}")
    public void sendGetRequest(String endpoint) {
        response = given().get(endpoint);
    }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int expectedStatusCode) {
        Assert.assertEquals(expectedStatusCode, response.getStatusCode());
    }

    @Then("the response should contain {string}")
    public void verifyResponseContains(String expectedContent) {
        response.then().assertThat().body(Matchers.containsString(expectedContent));
    }
}


Feature: Example REST API Testing

  Scenario: Get Request to Example Endpoint
    Given the API base URI is "https://jsonplaceholder.typicode.com"
    When a GET request is made to "/posts/1"
    Then the response status code should be 200
    And the response should contain "title"

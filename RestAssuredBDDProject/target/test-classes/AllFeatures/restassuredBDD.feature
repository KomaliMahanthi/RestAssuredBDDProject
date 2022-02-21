Feature: Test get
API URL: https://reqres.in/api/users?page=2
  Scenario: Check status code
    Given user enters url
    When status code using get method
    Then status code received
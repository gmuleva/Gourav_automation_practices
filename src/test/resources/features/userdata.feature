@adb
Feature: Data driven testing using users.json

@hcm2
Scenario Outline: Create user using JSON file data
    * def user = __row
    * print user

    Given url 'https://jsonplaceholder.typicode.com/users'
    And request user
    When method post
    Then status 201

    And match response.name == user.name
    And match response.username == user.username
    And match response.email == user.email
    And match response.phone_no == user.phone_no

Examples:
    | read('userdata/users.json') |
Feature: Test the functionality
  I want to use this template for my feature file

  Scenario: login of app
    Given browser
    And enter usname and psword
      | mailid          | usname | psword |
      | user1@gmail.com | user1  |   1234 |
      | user2@gmail.com | user2  |  12345 |
      | user3@gmail.com | user3  | 123456 |
    Then login to app

Feature: To test login functionality

  Scenario: Login to app
    Given launch
    Then go to url
    And enter us and pw
      | admin    | 12345 | admin@gmail.com |
      | newadmin |     5 | newad@gmail.com |
      Then logins

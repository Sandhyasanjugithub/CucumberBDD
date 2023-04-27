
Feature:To Test Login Functionality

 
  Scenario: Login to app with valid credentials
   Given  launch browser
 Then   enter url
    Then validate login page is displayed or not
    Then enter username
    And enter password
    Then click on login button
    Then validate home page is displayed or not

  Scenario: login to app with customer credentials
 Given  launch browser
 Then   enter url
    Then enter username "admin123"
    And enter password  "12345"
    Then click on login button
   
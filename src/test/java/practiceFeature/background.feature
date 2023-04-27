Feature: To Test Login Functionality
Background:
 Given  launch browser
 Then   enter url

 @regressiontest
  Scenario: Login to app with valid credentials
  
    Then validate login page is displayed or not
    Then enter username
    And enter password
    Then click on login button
    Then validate home page is displayed or not
@smoketest
  Scenario: login to app with customer credentials
  Then enter username "admin123"
    And enter password  "12345"
    Then click on login button
   
 
   
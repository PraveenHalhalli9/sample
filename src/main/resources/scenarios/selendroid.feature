@selendroid
Feature: selendroid Example Feature
  #Sample Test Scenario Description

  @appium
  Scenario: demo create user
   Then I start application by id "io.selendroid.testapp"
   And I click on "FolderIcon"
   Then I enter "Praveen" to "Username_text_feild"
   Then I enter "praveenh@gmail.com" to "email_text_field"
   And I enter "1234" to "password_text_field"
   Given I hide keyboard
   And I click on "checkbox"
   Then I click on "Register_user"
   And I enter "(.*?)" to "(.*?)"
   
   @demo_app
   Scenario: create a demo user
   When I start application by id "io.selendroid.testapp"
   And I verify page
   Then I Enter "John" username
   Then I Enter emailID "test1@gmail.com"
   Given Enter password "12345"
   And I validate name "Mr. Burns"
   
   
   
   
   
   
   
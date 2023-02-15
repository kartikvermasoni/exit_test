#Author: kartik.verma01@nagarro.com
Feature: To check alert dialogs functionality

  @test7
  Scenario Outline: Testing App dialogs functionality
    Given I am on the homepage of apk and clicked app
    Then migrated to Alert Dialogs and clicked
    Given many dialogs popup but tapped on Txt Entry Dialogs
    Then enter the Name in text entry"<name>"
    Then enter the Password in text entry"<Password>"
    Then tap on submit and assert it false

    Examples: 
      | name   | Password |
      | kartik | kartik12 |

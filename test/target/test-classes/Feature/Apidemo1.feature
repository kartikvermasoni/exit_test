Feature: to test a view page

  Background: reached second screen
    Given I am on the homepage of apk

  @test1
  Scenario: to test the 3d transition in views
    And clicking on views
    Then i should be able to migrate on 3d transition page
    When clicking on animations and 3d transition
    Then click on Lyon

  @test2
  Scenario: to test the switches functionality in views
    And clicking on views
    Then click on switches i should be able to migrate inside page
    When i tap on switches over all the buttons
    Then check all the buttons are open
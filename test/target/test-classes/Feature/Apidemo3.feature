Feature: to test a graphics page

  Background: reached second screen
    Given I am on the homepage of apk
  
  @test5
  Scenario: to test the bitmap decode in graphics
    And clicking on graphics
    Then i should be able to migrate on bitmap decode page
    When clicking on bitmapdecode and getting output
    Then click on open app again btn

  @test6
  Scenario: To test the text in Api demos
    And clicking on text
    Then i should be able to migrate on linkify page
    When clicking on linkify 
    And getting url text verified
   
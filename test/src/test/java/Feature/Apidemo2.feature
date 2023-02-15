Feature: testing text to speech and loader functionality
  I want to use this feature for my both scenarios

  @test3
  Scenario: Testing text to speech
    Given I am on the homepage of apk
    And clicking on app
    And clicked text to speech
    When I complete clicking action
    Then I validate the outcomes

  @test4
  Scenario Outline: Testing custom loader functionality
    Given I am on the homepage of apk and clicked app
    Then migrated to loader and clicked
    Given cursor custom throttled but tapped on custom 
    Then entered the search text "<name>"
    Then I verify the "<status>" in step

    Examples: 
      | name   | status   |
      | chrome | Approved |

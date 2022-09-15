Feature: HU-01 Looking for the QA Position

  Scenario: Search for the QA Position
    Given the user is on the main page of Kiwibot
    When the user can go to the careers module
    And search for remote jobs
    Then the user should see the qa position
    And the user could subscribe  for the newsletter
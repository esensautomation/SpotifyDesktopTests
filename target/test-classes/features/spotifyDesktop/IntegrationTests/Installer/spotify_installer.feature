@Smoke
Feature: Spotify Desktop Installer

  Scenario: Nominal Case

    Given I launch the "stable" spotify installer
    Then I should have Spotify installed

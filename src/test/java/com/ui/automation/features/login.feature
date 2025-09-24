Feature: Login functionality

  Scenario: Valid Login
    Given User is on login page
    When User enters username "admin" and password "admin123"
    And Clicks login button
    Then User should see homepage

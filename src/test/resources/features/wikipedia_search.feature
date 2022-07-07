Feature: Wikipedia Search Functionality Title Verification

  Background:
    Given user is on Wikipedia homepage
    When user types "Steve Jobs" in search box and clicks enter
  @wiki
  Scenario: Search functionality result title verification
    Then user sees "Steve Jobs - Wikipedia" on wikipedia title

  @wiki
  Scenario: Search functionality result header verification
    Then user sees "Steve Jobs" in header

  @wiki
    Scenario: Search functionality result image header verification
      Then user sees "Steve Jobs" in image header
Feature: LetterBoxd Page

  @letterboxd
  Scenario: Sign in account with the valid inputs
    Given user navigates to "https://letterboxd.com"
    When user sign in to the account
    And user can add and remove items from the watch list
    Then user verify every sort by type modifies the list correctly


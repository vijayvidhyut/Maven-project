Feature: this is to test google search

  @Opengoogle
  Scenario: Google search scenario
    Given user is entered in google page
    When user is typing the title is "Thanjavur"
    And click the search button
    Then user to see   result of what he searched

Feature: Register a buyer
  As a user
  I want to register a buyer
  So that verify login function work well

  @function
  Scenario: Register successfully as a Buyer
    Given I open CartCount website
    When I tap on [SIGNUP AS BUYER] button
    And I input valid email
    And I input valid FullName
    And I input valid PassWord
    And I tap on [Confirm] button
    Then Buyer 's homepage is opened successfully
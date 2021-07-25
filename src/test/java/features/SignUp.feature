Feature: Register a buyer
  As a user
  I want to register a buyer
  So that verify login function work well

  Background:
    Given : CartCount HomePage is opened

  Scenario: Register successfully as a Buyer
    When I tap on [SIGNUP AS BUYER] button
    Then [SignUp Page] screen is opened
    And I input valid email
    And I input valid FullName
    And I input valid PassWord
    And I tap on [Confirm] button
    Then Buyer 's homepage is opened successfully
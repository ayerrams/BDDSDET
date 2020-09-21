@Login
Feature: To validate login application
  Scenario: To test login with valid credentials
    Given Login application should be launched
    When Enter name, pwd and click submit
    Then Login should be successful

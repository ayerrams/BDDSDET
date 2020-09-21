Feature: Login feature
  This feature includes scenario that would validate the following feature.
  1.login as Admin
  2. login as linda.Anderson
  3. login with negative data
#  Scenario: Login as Admin
#    Given I am able to navigate onto the login page
#    When I enter username as "Admin"
#    And I enter password as "admin123"
#    And I click on login button
#    Then I should see the username as "Welcome Linda"
#  Scenario: Login as Linda.anderson
#    Given I am able to navigate onto the login page
#    When I enter username as "linda.anderson"
#    And I enter password as "linda.anderson"
#    And I click on login button
#    Then I should see the username as "Welcome Linda"
  Scenario Outline: login with different user
    Given I am able to navigate onto the login page
    When I enter username as "<user>"
    And I enter password as "<pwd>"
    And I click on login button
    Then I should see the username as "<name>"

    Examples:
      |user					 |pwd		        |name				 |
      |Admin				 |admin123      |Welcome Linda|
      |linda.anderson|linda.anderson|Welcome Linda|

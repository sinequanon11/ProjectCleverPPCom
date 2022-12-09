Feature: Login Functionality

  Scenario: Successfully register

    Given Naviagate to cleverppc
    When Create an account
    And  Fill the registration form
    Then User should register successfully
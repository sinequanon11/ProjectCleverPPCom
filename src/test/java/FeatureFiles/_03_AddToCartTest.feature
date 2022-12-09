Feature: Add to cart Test
  Scenario:  Add to cart Test

    When Naviagate to cleverppc
    And navigate to women on the top bar
    And  click on summer dresses
    And move to product photo
    And  Add to cart a random item
    Then  Successfull message should be displayed

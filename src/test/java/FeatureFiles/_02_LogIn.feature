Feature: Login Test

  Scenario Outline:Login Functionality

    When Naviagate to cleverppc

    And Click on the Sign In Button
      | signInButton |

    And User sending the keys in Dialog content
      | eMailConfirm    | <Email>    |
      | passWordConfirm | <password> |

    And Click on the element in the Dialog
      | signInConfirm |

    Then Unsuccessful message should be displayed

    Examples:

      | Email              | password |
      | ttttttt@gmail.com  | 12345    |


  Scenario Outline:Login Functionality

    When Naviagate to cleverppc

    And Click on the Sign In Button
      | signInButton |

    And User sending the keys in Dialog content
      | eMailConfirm    | <Email>    |
      | passWordConfirm | <password> |


    And Click on the element in the Dialog
      | signInConfirm |

    Then Success message should be displayed

    Examples:

      | Email               | password |
      | davidwoods3@gmail.com| 12345    |
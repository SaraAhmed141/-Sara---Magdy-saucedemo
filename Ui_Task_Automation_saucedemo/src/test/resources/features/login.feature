@Demo_SwagLabs @Login
Feature: Login Test
  # Verify that user can login successfully with positive scenario
  Scenario Outline: <Title>

    Given The user navigates to website

    Then The user clicks on login button and enters credentials
      | username   | password   |
      | <username> | <password> |

    Then The user verifies the header
      | expectedHeader   |
      | <expectedHeader> |

    Examples:
      | Title                                       | username      | password     | expectedHeader |
      | user can Login successfully with valid data | standard_user | secret_sauce | Swag Labs      |

###################################################################################################################################

  # Negative Scenarios
  Scenario Outline: <Title>

    Given The user navigates to website

    Then The user clicks on login button and enters credentials
      | username   | password   |
      | <username> | <password> |

    Then The user verifies welcome message
      | expectedMessage   |
      | <expectedMessage> |

    Examples:
      | Title                                           | username      | password | expectedMessage                                                           |
      | user Login with invalid data                    | standard      | secret   | Epic sadface: Username and password do not match any user in this service |
      | user Login with empty field                     |               |          | Epic sadface: Username is required                                        |
      | user Login with missing data in Password field | standard_user |          | Epic sadface: Password is required                                        |

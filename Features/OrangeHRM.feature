Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I open orangeHRM home page
    Then I verify the logo present on page
    And close browser
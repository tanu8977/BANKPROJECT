Feature: Test login functionality

  Scenario Outline: 
    Given the user login to the browser functionality
    When user enters <Clientnumber> in the cmk
    And user also enters <password> in the cmk
    And user clicks the clientnumber in the button
    Then user clicks on logon button

    Examples: 
      | Clientnumber | password |
      | gfhgv        | hbh      |
      | hghjg        | bjh      |

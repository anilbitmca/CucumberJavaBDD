Feature: Test login functionality of website
  Scenario Outline: user is able to login using username and password
    Given browser is open for credentials
    When user entered <username> and <password>
    And click on login button in webpage
    Then user will login to webpage
    Examples:
    |username|password|
    |user1|12345|
    |user2|12345|


Feature:
  Scenario Outline:login to orangeHRM and create new admin
    Given open orangeHRM website
    When write username "<username>"
    And write password "<password>"
    And click on login button
    Then it will be redirected to dashboard
    When click on Admin button
    And it will navigate to user managment page
    And I check the number of records
    And click on Add button
    Then click on user Role dropdown list and choose ESS
    And Type the Employee name "<empolyeeName>"
    And click on status dropdown list and choose active
    And Type username "<usernameText>"
    And Type the password "<passwordText>"
    And Type confirm password "<confirmPassword>"
    Then click on submit button
    And I check the number of records
    And Type in search bar the new added username"<usernameSearch>"
    And click on search button
    And click on delete icon
    And click on delete button in popup screen
   And click on reset button
    Then I check the number of records


    Examples:
      | username | password | empolyeeName         | usernameText | confirmPassword | passwordText | usernameSearch |
      | Admin    | admin123 | Youmna Magdy Mokhtar | youmnaMagdy  | Test@1234       | Test@1234    | youmnaMagdy    |




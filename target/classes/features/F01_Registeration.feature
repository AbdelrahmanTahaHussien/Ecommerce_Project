@smoke
  Feature: F01_Registration | guest user could create new account
    #Positive Scenario


    Scenario:   user could create new account with valid data

      Given user go to register page
      When user select gender type
      And user enter first name "Automation" and last name "Tester"
      And user enter date of birth
      And user enter email "test@example.com" field
      And user fills Password Fields "P@ssw0rd"
      And user clicks on register button
      Then success message is displayed
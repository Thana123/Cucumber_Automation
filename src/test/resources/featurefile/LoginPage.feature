Feature: Spark Demo

   
  Scenario: Login to Spark Sports
    Given At the home page https://www.sparksport.co.nz/
    When Click on  login
    Then Login with username and password
      | user123 | asdfsdf  |
     

    
    Scenario: login forgotpassword
    Given At the home page https://www.sparksport.co.nz/
    When Click on  forgot password
    Then Request new Password
     | asdfsdf@gmail.com |
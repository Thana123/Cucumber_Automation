Feature: Spark Demo

  Scenario: Signup to Spark Sports
    Given At the home page https://www.sparksport.co.nz/
    When Click on  Signup
    Then Select seven days free trial subscription
    Then Fill and submit the signup form    
    |  fname   |     lastname    |    password    |       email              |
    |  caop    |     nat         |    tes@123     |       caop@gmail.com     |
   
    
  Scenario: Signup to Spark Sports
    Given At the home page https://www.sparksport.co.nz/
    When Click on  Signup
    Then Select voucher subscription
    Then Fill and submit the signup form
    |  fname   |     lastname    |    password    |       email              |
    |  caop    |     nat         |    tes@123     |       caop@gmail.com     |

Feature: Baisacrafts SignUp Fuctionality

Scenario Outline: User Able To SignUp The baisacrafts Application
 
Given Lounch The Application 
When User Click On the Signup button
And User Entering The First Name and Last Name Phone Number Email and Password "<username>" And "<Lastname>" And "<Phone>" And "<email>" And "<password>"  
And User Click On The SignUp Now button
Then User Should Be Navigate The DashBoard Page

Examples: 
      | username | Lastname | Phone      |   email          |  password |
      | vinoth   | s        | 8548889518 | vinoth@gmail.com | 1234567   |


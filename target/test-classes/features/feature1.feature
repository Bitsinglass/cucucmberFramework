Feature: Verify Login Functionality of application
@001 @Smoke
Scenario: To Verify user is Not Able to Login with Invalid credentials
Given User is on Login screen of application
When User enter username "jatin" and password "123456"
And User Clicks on Login button
Then Message appears on screen that Invalid credentials

@002 @Smoke
Scenario: To Verify user is UnAble to Login with valid Username & Invalid password
Given User is on Login screen of application
When User Enters valid username "Admin" & Invalid password "12345678"
And User Clicks on Login button
Then Message appears on screen that Invalid credentials

@003 @Smoke
Scenario: To Verify user is Logins successfully with valid Username & valid password
Given User is on Login screen of application
When User enters username and password 
| username | password |
| admin1   | pswd1    |
| admin2   | pswd2    |
| admin3   | pswd3    |
| admin4   | pswd4    |

And User Clicks on Login button
Then User navigates to Home page


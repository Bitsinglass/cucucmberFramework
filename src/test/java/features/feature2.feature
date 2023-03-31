#Feature: Verify Assign Leave Functionality
#@004 @Smoke
#Scenario: To Verify Assign Leave page opens successfully
#Given User is on Home screen of application
#When User clicks on Assign Leave link 
#Then Assign Leave page opens successfully
#
#
#@005 @Smoke
#Scenario: To Verify all validations of Mandatory fields of Assign Leave page
#Given User is on Assign Leave page of application
#When User clicks on Assign button link 
#Then Validation messages should appear on screen
#
#@006 @Smoke
#Scenario: To Verify validation if Employee name not exist
#Given User is on Assign Leave page of application
#When User enters invalid employee name "jatin" 
#Then Invalid name message should appear on screen
#
#@007 @Smoke
#Scenario: To Verify validation for invalid date
#Given User is on Assign Leave page of application
#When User enters invalid date name "0000-01-22" 
#Then Invalid date message should appear on screen
#
#@008 @Smoke
#Scenario: To Verify validation if To Date is < then From date
#Given User is on Assign Leave page of application
#When User enters From date "2022-06-21"
#When User enters To date "2022-05-20"
#And user clicks on Assign button 
#Then message should appear on screen That "To date should be after from date"
#
#@008
#Scenario: To Verify Leave assign successfully
#Given User is on Assign Leave page of application
#When User enters valid Emp Name
#And User selects leave type "CAN-personnel"
#And User enters To date as "2022-06-21"
#And User enters From date as "2022-06-20"
#Then user clicks on Assign button 
#And Leave assignment confirmation popup opens
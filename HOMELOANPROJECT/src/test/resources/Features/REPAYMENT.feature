Feature: Testing Repayment calculator
Scenario:
Given the user logins to the browser functionality
When the user fills the form sheetname "<SheetName>" and rowNumber <rownumber> 
And the user clicks the "<Calculate>" button
Then A shows a successful message "YOUR MESSAGE HAS BEEN SUCCESSFULLY SENTTO OUR TEAM "

Examples
|SheetName|rowNumber|
|Sheet1   |    0    |
|Sheet1   |    1    |
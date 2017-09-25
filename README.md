Project Title:
---------------------------------------------------------------------------------------------------------------------

SMAVA Automation Project for Loan Selection and User Login.


Getting Started:
----------------------------------------------------------------------------------------------------------------------
These instructions will get you a copy of the project up and running on your local machine for development and testing 
purposes. See deployment for notes on how to deploy the project on a live system.

Prerequistes:
----------------------------------------------------------------------------------------------------------------------
Project Management Tool : Maven
Operating Sytem         : Windows7, Windows10,Linux
IDE                     : Eclipse
Testing Framework       : TestNG
Design Pattern          : Page Object Model(POM)
Browser                 : Firefox, Chrome, I.E. 


Required Installations:
----------------------------------------------------------------------------------------------------------------------
Step1: Download and install latest java version from below link

http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Note: Please download as per system configuration

Step2: Download and launch Eclipse IDE

https://www.eclipse.org/downloads/


Running the Tests:
-----------------------------------------------------------------------------------------------------------------------
Step1: Deploy the project in Eclipse IDE
	a) Unzip the attached project file(SMAVA PROJECT)
	b) Open the eclipse and click on import
	c) Select project folder and click on finish.

Step2: Right click on TestNG.xml file-->Goto RunAs TestNG Suite

Test Breakdown for better understanding of the scripts:
------------------------------------------------------------------------------------------------------------------------

Source package: scr/test/java
package       : com.kiran.smava.config
class         : Constants.java

In Constants.java class, i maintained url details and browser types and other constant values.


Source package: scr/test/java
package       : com.kiran.smava.pages
class         : SmavaHomePage.java

Here in SmavaHomePage.java class, i maintained all UI Objects of the Smava Home Page and the related methods to work with
those Ojbects.


Source package: scr/test/java
package       : com.kiran.smava.pages
class         : UserLoginPopUp.java

Here in UserLoginPopUp.java class, i maintained all UI Objects of the Login Popup and the related methods to work with
those Ojbects.


Source package: scr/test/java
package       : com.kiran.smava.testBase
class         : TestBase.java

Here in TestBase.java class, i maintained driver initialization and coding for Browser Launching


Source package: scr/test/java
package       : com.kiran.smava.testScripts
class         : TC001_LoanSelection.java



TC001_LoanSelection.java class includes the script for selecting Loan Selection as per below test case.
-------------------------------------------------------------------------------------------------------

1. User Story: User selects the loan of amount 2750 Euros at smava.de,to pay during 24 months for living(Wohnen).
Click on next(weiter) and verify that the page is completely loaded


Test case:
----------
-->User goto Smava.de website
-->Selects the loan amount as 2750 Euros from the Net loan amount drop down list
-->Selects the Running time as 24 Months from the Running time drop down list
-->Selects the Use as Live from the Use drop down list.
-->Next click on Continue(weiter) button and waits till the page is loaded

Test result:
------------
Page loaded successfully.


Source package: scr/test/java
package       : com.kiran.smava.testScripts
class         : TC002_UserLogin.java


TC002_UserLogin.java class includes the script for selecting Loan Selection as per below test case.
---------------------------------------------------------------------------------------------------

2. User Story: As a user i want to click on "Anmelden" and be able to introduce data,but not being able to log-in
because the data is not correct

Test case:
----------
-->User goto Smava.de website
-->Click on LOG
-->Enter User E-MAIL
-->Enter Password
-->Next click on Log In button

Test result:
------------
Throws an error message



Built With:
------------------------------------------------------------------------------------------------------------------------- 

Maven          --> Dependency Management
Coding Style   --> Page Object Model
Test Framework --> TestNG


Author:
--------------------------------------------------------------------------------------------------------------------------

Kiran Marupakula
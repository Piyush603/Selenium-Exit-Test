#ABOUT PROJECT 

A.	Implementation of Automation Exit Test Assignment for Flipkart using Java Selenium
B.	Tools Used 
1.	Selenium 
2.	Eclipse Editor
3.	Java
4.	Github and Jenkins
5.	TestNG 
6.	Maven 
C.	Usage of Config.properties & Excel sheet as input
D.	Information and Steps to Run the Project
a.	How to run  
•	Implemented automation Test project for FlipKart
•	Code versioning Repositor: GitHub
•	run RunAssignment.bat 
b.	Mode options:-
•	Headless 
•	Non- Headless
c.	Important Note 
•	To change browser - change the browser in Resources/config.properties 

#Important Directory 
•	Drivers : .drivers/ 
•	Report File : .reports/ExtentReports.html 
•	Log File : ./logs/propertieslogs.log 
•	Configuration File: .Resources/config.properties 
•	Screenshots Folder: .test\ScreenCapturesJPEG 
•	Test Data File : src/main/java…in package testdata\exceldata.xlsx


#Driver Options:
Chrome, Edge, Firefox
##For Reporting below option available. Extent Report with Fail case screenshot in report. Logger Report
##Test Can also be run on maven command line command:- mvn clean test

Command to install referenced  jar : 
C:\Users\piyushdhamne\Downloads\selenium-java-3.141.59 
 
How to run through jenkins 

•	download jenkins.war file 
•	run in cmd 
•	setup Jenkins 

 
Implemented features 

*	Create at least 20 automated scenarios across different flows and screens - done 
*	Implement POM - done 
* Test data should be read from excel. User has the ability to selective run the test cases by marking yes in the Execution Required field in excel - done 
*	Global Parameters should be read from config file like browser name, test site URL, global wait value etc. should be read from a properties file - done 
*	Use proper waits i.e. implicit wait and explicit wait wherever necessary. - done 
*	The test should run on following browsers IE, Chrome, FF - done 
*	There should be an option to run the test cases in headless mode - done 
*	Put proper assertions and error screenshot in the extent report - done 
*	Create reusable libraries and import these as jars in the current project - done 
*	Create a ReadMe document which has the steps to install and run the code - done 
*	Integration with github and Jenkins done 

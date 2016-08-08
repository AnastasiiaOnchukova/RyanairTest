# RyanairTest
Technologes used:
Java, maven, JUnit, Cucumber, Page Object pattern, Selenium WebDriver (chromedriver)

Prerequisities: 
1. Have JDK installed, added to the clathpath
2. Have maven installed and added to the clathpath
3. Have Chrome browser installed

Run test:
1. Go to directory containing tests
2. Open command prompt in it
3. Run 'mvn clean test -Dbrowser=chrome"


Results will be visible in console or second option is to open Html report, to do this go to '\ryanairBookingDeclinedTest\target\cucumber-html-report' and open in any brower index.html file.

Screenshots of results you can see in repository named 'TestResult.jpg' and 'TestResultCmd.jpg'



Additional info:
In order to solve this task I chose Page Object Pattern, main idea of which is to separate test itself from the implementation of methods and locators operating with the page. For page objects could be taken different pages of application or different logical parts of one page. Since test was quite simple and didn't involve interactions with different parts of one page, I created separate page objects for pages (home page, booking home page, booking extras page, booking payment page).
I am aware that on my code could be done a lot of refactoring (moving more methods to utilities class, removal of repetitive code, storing all locators for operating with pages in separate from methods classes for each page), but this is to give basic idea how test could be organized. 
 

This is a MVN project.
Automation exercise using Selenium with Page Object Model.
For running this, take into consideration the following set up.

Pre-set up:
This repository has ChromeDriver for Chrome version 89. If you need to update it please find it https://chromedriver.chromium.org/downloads
1 - update the config.properties file with the correct chromeDriverPath
chromeDriverPath=./ChallengeSelenium

Run options:
 1 - Executes from Solution.java class
 2 - Using java -cp command
        java -cp /absolute/path/for/compiled/classes:/absolute/path/to/junit-4.12.jar:/absolute/path/to/hamcrest-core-1.3.jar org.junit.runner.JUnitCore your.package.TestClassName

Requirements:
1. Check if the email and password fields are on the main screen of the application:

Email input has id equal to email-input;
Password input has id equal to password-input;
Login button has id equal to login-button.

2. Check if the given valid credentials work:

Use credentials given in the description (login@codility.com).
After a successful login attempt, a div with class equal to message success and containing a message: Welcome to Codility is visible.

3. Check if the given wrong credentials work:

Use credentials given in the description (unknown@codility.com).
After an unsuccessful login attempt, a div with class equal to message error and containing a message You shall not pass! Arr! is visible.

4. Check if the email validation is working:

Use email in an invalid form
After an unsuccessful login attempt, a div with class equal to validation error and containing a message Enter a valid email is visible.

5. Check for empty credentials:

After an unsuccessful login attempt, a div with class equal to validation error and containing a message Email is required is visible.
After an unsuccessful login attempt, a div with class equal to validation error and containing a message Password is required is visible.